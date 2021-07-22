package models.products.searchProduct.request;

public class CompareProductQueryParamsRequest {
    private double amount;
    private double overdraftAmount;
    private int loanPeriod;
    private String bankId;
    private String countryCode;
    private String productCategory;
    private String comparisionRule;
    private String ordering;
    private int pageSize;
    private int pageNum;

    public double getAmount() {
        return amount;
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public String getBankId() {
        return bankId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getComparisionRule() {
        return comparisionRule;
    }

    public String getOrdering() {
        return ordering;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public CompareProductQueryParamsRequest setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public CompareProductQueryParamsRequest setOverdraftAmount(double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
        return this;
    }

    public CompareProductQueryParamsRequest setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
        return this;
    }

    public CompareProductQueryParamsRequest setBankId(String bankId) {
        this.bankId = bankId;
        return this;
    }

    public CompareProductQueryParamsRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public CompareProductQueryParamsRequest setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    public CompareProductQueryParamsRequest setComparisionRule(String comparisionRule) {
        this.comparisionRule = comparisionRule;
        return this;
    }

    public CompareProductQueryParamsRequest setOrdering(String ordering) {
        this.ordering = ordering;
        return this;
    }

    public CompareProductQueryParamsRequest setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public CompareProductQueryParamsRequest setPageNum(int pageNum) {
        this.pageNum = pageNum;
        return this;
    }
}
