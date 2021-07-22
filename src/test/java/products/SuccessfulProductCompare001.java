package products;

import base.ApiBaseTest;
import enums.ProductCategories;
import io.qameta.allure.Step;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import models.products.searchProduct.request.CompareProductQueryParamsRequest;
import models.products.searchProduct.response.ProductSearchResponseData;
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

public class SuccessfulProductCompare001 extends ApiBaseTest {
    private static final String COUNTRY_CODE = "GBR";
    private ValidatableResponse response;
    private Object[][] testData;
    private CompareProductQueryParamsRequest searchQueryParams;

    @Test
    public void ProductCompare001() throws IOException {
        initTestData();
        sendRequestToApi();
        checkStatusCode();
        checkResponseBodyFields();
        checkResponseBody();
    }

    @Step
    private void initTestData() throws IOException {
        searchQueryParams = new CompareProductQueryParamsRequest()
                .setAmount(5000)
                .setOverdraftAmount(1000)
                .setLoanPeriod(12)
                .setBankId("e7df9035-ef15-488c-8b48-6cd0f9bde9d6")
                .setCountryCode(COUNTRY_CODE)
                .setProductCategory(ProductCategories.BUSINESS_LOANS.getProductCategory())
                .setComparisionRule("APR_RATE")
                .setOrdering("ASCENDING")
                .setPageSize(10)
                .setPageNum(1);
        testData = FileUtil
                .getTestDataFromCsv("C:\\Users\\akannangar\\Desktop\\git\\101_digital_api\\src\\test\\resources\\productCompare.csv");
    }

    @Step
    public void sendRequestToApi() {
        response = new ProductApiService().compareProducts(searchQueryParams);
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
            System.out.println(i);
            assertEquals(jsonPathEvaluator.get("data["+ i +"].bankId"), testData[i][0]);
            assertEquals(jsonPathEvaluator.get("data["+ i +"].bankName"), testData[i][1]);
            assertEquals(jsonPathEvaluator.get("data["+ i +"].productId"), testData[i][2]);
            assertEquals(jsonPathEvaluator.get("data["+ i +"].accountName"), testData[i][3]);
            assertEquals(jsonPathEvaluator.get("data["+ i +"].eligbilityAge").toString(), testData[i][4]);
            assertEquals(jsonPathEvaluator.get("data["+ i +"].accountFee").toString(), testData[i][5]);
            assertEquals(jsonPathEvaluator.get("data["+ i +"].productUrl"), testData[i][6]);
            assertEquals(jsonPathEvaluator.get("data["+ i +"].termsAndCondition"), testData[i][7]);
            assertEquals(jsonPathEvaluator.get("data["+ i +"].aprRate").toString(), testData[i][8]);
            assertEquals(jsonPathEvaluator.get("data["+ i +"].aprRateType"), testData[i][9]);
//            assertEquals(jsonPathEvaluator.get("data["+ i +"].aprNotes").toString(), testData[i][10]);
            assertEquals(jsonPathEvaluator.get("data["+ i +"].monthlyRepaymentAmount").toString(), testData[i][10]);
            assertEquals(jsonPathEvaluator.get("data["+ i +"].totalCostOfCredit").toString(), testData[i][11]);
            assertEquals(jsonPathEvaluator.get("data["+ i +"].totalRepaymentAmount").toString(), testData[i][12]);
        }
    }
}
