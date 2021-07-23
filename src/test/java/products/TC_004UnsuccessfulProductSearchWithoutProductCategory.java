package products;

import io.qameta.allure.Step;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import models.products.searchProduct.request.GetProductsQueryParamsRequest;
import org.testng.annotations.Test;
import services.ProductApiService;

import java.net.HttpURLConnection;

import static org.testng.Assert.assertEquals;

public class TC_004UnsuccessfulProductSearchWithoutProductCategory {
    private static final String COUNTRY_CODE = "AUS";
    private ValidatableResponse response;
    private GetProductsQueryParamsRequest searchQueryParams;
    private Object[][] testData;

    @Test
    public void TC_002ProductSearch() {
        initTestData();
        sendRequestToApi();
        checkStatusCode();
        checkResponseBody();
    }

    @Step
    private void initTestData() {
        searchQueryParams = new GetProductsQueryParamsRequest()
                .setCountryCode(COUNTRY_CODE)
                .setPageSize(10)
                .setPageNum(1);
    }

    @Step
    public void sendRequestToApi() {
        response = new ProductApiService().getProducts(searchQueryParams);
    }

    @Step
    private void checkStatusCode() {
        response.statusCode(HttpURLConnection.HTTP_INTERNAL_ERROR);
    }

    @Step
    private void checkResponseBody() {
        JsonPath jsonPathEvaluator = response.extract().body().jsonPath();
        assertEquals(jsonPathEvaluator.get("errors[0].message"), "Something went wrong");
    }
}
