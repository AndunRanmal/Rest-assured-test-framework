package models.products.searchProduct.request;

public class GetProductsQueryParamsRequest {
    private String productCategory;
    private String countryCode;
    private int pageSize;
    private int pageNum;

    public String getProductCategory() {
        return productCategory;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public GetProductsQueryParamsRequest setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    public GetProductsQueryParamsRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public GetProductsQueryParamsRequest setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public GetProductsQueryParamsRequest setPageNum(int pageNum) {
        this.pageNum = pageNum;
        return this;
    }
}
