package services;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import models.products.searchProduct.request.CompareProductQueryParamsRequest;
import models.products.searchProduct.request.GetProductDetailsQueryParamRequest;
import models.products.searchProduct.request.GetProductsQueryParamsRequest;
import utils.RestAssuredUtils;

import static constants.Constants.BANKING_PRODUCT_INFO_SERVICE_URL_PART;
import static constants.Constants.BASE_URL;

public class ProductApiService {
    public static final String PRODUCTS_URL_PART = "/products";
    public static final String PRODUCTS_COMPARE_URL_PART = "/products/compare";

    public ValidatableResponse getProducts(GetProductsQueryParamsRequest requestData) {
        RequestSpecification request = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setBasePath(BANKING_PRODUCT_INFO_SERVICE_URL_PART + PRODUCTS_URL_PART)
                .addQueryParam("productCategory", requestData.getProductCategory())
                .addQueryParam("countryCode", requestData.getCountryCode())
                .addQueryParam("pageSize", requestData.getPageSize())
                .addQueryParam("pageNum", requestData.getPageNum())
                .setContentType(ContentType.JSON)
                .build();
        return RestAssuredUtils.get(request);
    }

    public ValidatableResponse compareProducts(CompareProductQueryParamsRequest requestData) {
        RequestSpecification request = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setBasePath(BANKING_PRODUCT_INFO_SERVICE_URL_PART + PRODUCTS_COMPARE_URL_PART)
                .addQueryParam("amount", requestData.getAmount())
                .addQueryParam("overdraftAmount", requestData.getOverdraftAmount())
                .addQueryParam("loanPeriod", requestData.getLoanPeriod())
                .addQueryParam("bankId", requestData.getBankId())
                .addQueryParam("countryCode", requestData.getCountryCode())
                .addQueryParam("productCategory", requestData.getProductCategory())
                .addQueryParam("comparisionRule", requestData.getComparisionRule())
                .addQueryParam("ordering", requestData.getOrdering())
                .addQueryParam("pageSize", requestData.getPageSize())
                .addQueryParam("pageNum", requestData.getPageNum())
                .setContentType(ContentType.JSON)
                .build();
        return RestAssuredUtils.get(request);
    }

    public ValidatableResponse getProductDetails(GetProductDetailsQueryParamRequest requestData) {
        RequestSpecification request = new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .setBasePath(BANKING_PRODUCT_INFO_SERVICE_URL_PART + PRODUCTS_URL_PART + "/" + requestData.getProductId())
                .addQueryParam("bankId", requestData.getBankId())
                .addQueryParam("productCategory", requestData.getProductCategory())
                .addQueryParam("countryCode", requestData.getCountryCode())
                .setContentType(ContentType.JSON)
                .build();
        return RestAssuredUtils.get(request);
    }
}
