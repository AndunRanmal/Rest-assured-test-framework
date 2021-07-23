package products;

import base.ApiBaseTest;
import enums.ProductCategories;
import io.qameta.allure.Step;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import models.products.searchProduct.request.GetProductsQueryParamsRequest;
import models.products.searchProduct.response.ProductSearchResponseData;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.ProductApiService;
import utils.FileUtil;
import utils.JsonUtils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;


public class TC_001SuccessfulProductSearch extends ApiBaseTest {

    private static final String COUNTRY_CODE = "AUS";
    private ValidatableResponse response;
    private GetProductsQueryParamsRequest searchQueryParams;
    private Object[][] testData;

    @Test
    public void TC_001ProductSearch() throws IOException {
        initTestData();
        sendRequestToApi();
        checkStatusCode();
        checkResponseBodyFields();
        checkResponseBody();
    }

    @Step
    private void initTestData() throws IOException {
        searchQueryParams = new GetProductsQueryParamsRequest()
                .setProductCategory(ProductCategories.RESIDENTIAL_MORTGAGES.getProductCategory())
                .setCountryCode(COUNTRY_CODE)
                .setPageSize(10)
                .setPageNum(1);
        assignExpectedProductDetailsFromCsv();
    }

    @Step
    public void sendRequestToApi() {
        response = new ProductApiService().getProducts(searchQueryParams);
    }

    @Step
    private void checkStatusCode() {
        response.statusCode(HttpURLConnection.HTTP_OK);
    }

    @Step
    private void checkResponseBodyFields() {
        Set actualFields = response.extract().as(HashMap.class).keySet();
        ProductSearchResponseData responseData = response.extract().as(ProductSearchResponseData.class);
        Set expectedFields = JsonUtils.getJsonFieldNames(responseData);
        assertEquals(actualFields, expectedFields);
    }

    @Step
    private void checkResponseBody() {
        JsonPath jsonPathEvaluator = response.extract().body().jsonPath();
        List<Object> responseData = jsonPathEvaluator.get("data");
        for (int i = 0; i < responseData.size(); i++) {
            assertEquals(jsonPathEvaluator.get("data["+ i +"].summary.countryCode"), COUNTRY_CODE);
            Assert.assertEquals(jsonPathEvaluator.get("data["+ i +"].summary.productCategory"),
                    ProductCategories.RESIDENTIAL_MORTGAGES.getProductCategory());
        }
        assertEquals(jsonPathEvaluator.get("data[0].detail.productId"), testData[0][0]);
        assertEquals(jsonPathEvaluator.get("data[0].detail.lastUpdated"), testData[0][1]);
        assertEquals(jsonPathEvaluator.get("data[0].detail.productCategory"), testData[0][2]);
        assertEquals(jsonPathEvaluator.get("data[0].detail.name"), testData[0][3]);
//        assertEquals(jsonPathEvaluator.get("data[0].detail.effectiveFrom"), testData[0][4]);
//        assertEquals(jsonPathEvaluator.get("data[0].detail.description"), testData[0][6]);
//        assertEquals(jsonPathEvaluator.get("data[0].detail.brand"), testData[0][7]);
//        assertEquals(jsonPathEvaluator.get("data[0].detail.isTailored").toString(), testData[0][9]);
    }

    @Step
    private void assignExpectedProductDetailsFromCsv() throws IOException {
        testData = FileUtil
                .getTestDataFromCsv("C:\\Users\\akannangar\\Desktop\\git\\101_digital_api\\src\\test\\resources\\productDetails.csv");
    }
}
