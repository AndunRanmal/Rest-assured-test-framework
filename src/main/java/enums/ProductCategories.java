package enums;

public enum ProductCategories {
    CRED_AND_CHRG_CARDS("CRED_AND_CHRG_CARDS"),
    BUSINESS_TRANS_ACCOUNTS("BUSINESS_TRANS_ACCOUNTS"),
    RESIDENTIAL_MORTGAGES("RESIDENTIAL_MORTGAGES"),
    BUSINESS_LOANS("BUSINESS_LOANS"),
    TERM_DEPOSITS("TERM_DEPOSITS"),
    TRANS_AND_SAVINGS_ACCOUNTS("TRANS_AND_SAVINGS_ACCOUNTS");

    private String productCategory;

    ProductCategories(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductCategory() {
        return productCategory;
    }
}
