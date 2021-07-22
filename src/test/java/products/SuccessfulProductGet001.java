package products;

import enums.ProductCategories;
import io.qameta.allure.Step;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import models.products.searchProduct.request.GetProductDetailsQueryParamRequest;
import models.products.searchProduct.response.ProductSearchResponseData;
import org.testng.annotations.Test;
import services.ProductApiService;
import utils.JsonUtils;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class SuccessfulProductGet001 {
    private static final String COUNTRY_CODE = "GBR";
    private ValidatableResponse response;
    private GetProductDetailsQueryParamRequest searchQueryParams;
    private Object[][] testData;

    @Test
    public void ProductGet001() {
        initTestData();
        sendRequestToApi();
        checkStatusCode();
        checkResponseBody();
    }

    @Step
    private void initTestData() {
        searchQueryParams = new GetProductDetailsQueryParamRequest()
                .setProductId("BBLT")
                .setBankId("e7df9035-ef15-488c-8b48-6cd0f9bde9d6")
                .setProductCategory(ProductCategories.BUSINESS_LOANS.getProductCategory())
                .setCountryCode(COUNTRY_CODE);
    }

    @Step
    public void sendRequestToApi() {
        response = new ProductApiService().getProductDetails(searchQueryParams);
    }

    @Step
    private void checkStatusCode() {
        response.statusCode(HttpURLConnection.HTTP_OK);
    }

    @Step
    private void checkResponseBody() {
        JsonPath jsonPathEvaluator = response.extract().body().jsonPath();
        assertEquals(jsonPathEvaluator.get("data.Brand[0].BrandName"), "Barclays");
    }
}
