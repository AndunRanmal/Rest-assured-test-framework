package models.products.searchProduct.request;

public class GetProductDetailsQueryParamRequest {
    private String productId;
    private String bankId;
    private String productCategory;
    private String countryCode;

    public String getProductId() {
        return productId;
    }

    public String getBankId() {
        return bankId;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public GetProductDetailsQueryParamRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }

    public GetProductDetailsQueryParamRequest setBankId(String bankId) {
        this.bankId = bankId;
        return this;
    }

    public GetProductDetailsQueryParamRequest setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    public GetProductDetailsQueryParamRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
}
