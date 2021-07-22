
package models.products.searchProduct.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coreProduct",
    "eligibility",
    "featuresAndBenefits",
    "firstMarketedDate",
    "identification",
    "lastMarketedDate",
    "loanInterest",
    "marketingState",
    "notes",
    "otherFeesCharges",
    "predecessorID",
    "repayment",
    "stateTenureLength",
    "stateTenurePeriod"
})
public class SmELoanMarketingState {

    @JsonProperty("coreProduct")
    private CoreProduct coreProduct;
    @JsonProperty("eligibility")
    private Eligibility eligibility;
    @JsonProperty("featuresAndBenefits")
    private FeaturesAndBenefits featuresAndBenefits;
    @JsonProperty("firstMarketedDate")
    private String firstMarketedDate;
    @JsonProperty("identification")
    private String identification;
    @JsonProperty("lastMarketedDate")
    private String lastMarketedDate;
    @JsonProperty("loanInterest")
    private LoanInterest loanInterest;
    @JsonProperty("marketingState")
    private String marketingState;
    @JsonProperty("notes")
    private List<String> notes = null;
    @JsonProperty("otherFeesCharges")
    private OtherFeesCharges otherFeesCharges;
    @JsonProperty("predecessorID")
    private String predecessorID;
    @JsonProperty("repayment")
    private List<Repayment> repayment = null;
    @JsonProperty("stateTenureLength")
    private Integer stateTenureLength;
    @JsonProperty("stateTenurePeriod")
    private String stateTenurePeriod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("coreProduct")
    public CoreProduct getCoreProduct() {
        return coreProduct;
    }

    @JsonProperty("coreProduct")
    public void setCoreProduct(CoreProduct coreProduct) {
        this.coreProduct = coreProduct;
    }

    @JsonProperty("eligibility")
    public Eligibility getEligibility() {
        return eligibility;
    }

    @JsonProperty("eligibility")
    public void setEligibility(Eligibility eligibility) {
        this.eligibility = eligibility;
    }

    @JsonProperty("featuresAndBenefits")
    public FeaturesAndBenefits getFeaturesAndBenefits() {
        return featuresAndBenefits;
    }

    @JsonProperty("featuresAndBenefits")
    public void setFeaturesAndBenefits(FeaturesAndBenefits featuresAndBenefits) {
        this.featuresAndBenefits = featuresAndBenefits;
    }

    @JsonProperty("firstMarketedDate")
    public String getFirstMarketedDate() {
        return firstMarketedDate;
    }

    @JsonProperty("firstMarketedDate")
    public void setFirstMarketedDate(String firstMarketedDate) {
        this.firstMarketedDate = firstMarketedDate;
    }

    @JsonProperty("identification")
    public String getIdentification() {
        return identification;
    }

    @JsonProperty("identification")
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @JsonProperty("lastMarketedDate")
    public String getLastMarketedDate() {
        return lastMarketedDate;
    }

    @JsonProperty("lastMarketedDate")
    public void setLastMarketedDate(String lastMarketedDate) {
        this.lastMarketedDate = lastMarketedDate;
    }

    @JsonProperty("loanInterest")
    public LoanInterest getLoanInterest() {
        return loanInterest;
    }

    @JsonProperty("loanInterest")
    public void setLoanInterest(LoanInterest loanInterest) {
        this.loanInterest = loanInterest;
    }

    @JsonProperty("marketingState")
    public String getMarketingState() {
        return marketingState;
    }

    @JsonProperty("marketingState")
    public void setMarketingState(String marketingState) {
        this.marketingState = marketingState;
    }

    @JsonProperty("notes")
    public List<String> getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @JsonProperty("otherFeesCharges")
    public OtherFeesCharges getOtherFeesCharges() {
        return otherFeesCharges;
    }

    @JsonProperty("otherFeesCharges")
    public void setOtherFeesCharges(OtherFeesCharges otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
    }

    @JsonProperty("predecessorID")
    public String getPredecessorID() {
        return predecessorID;
    }

    @JsonProperty("predecessorID")
    public void setPredecessorID(String predecessorID) {
        this.predecessorID = predecessorID;
    }

    @JsonProperty("repayment")
    public List<Repayment> getRepayment() {
        return repayment;
    }

    @JsonProperty("repayment")
    public void setRepayment(List<Repayment> repayment) {
        this.repayment = repayment;
    }

    @JsonProperty("stateTenureLength")
    public Integer getStateTenureLength() {
        return stateTenureLength;
    }

    @JsonProperty("stateTenureLength")
    public void setStateTenureLength(Integer stateTenureLength) {
        this.stateTenureLength = stateTenureLength;
    }

    @JsonProperty("stateTenurePeriod")
    public String getStateTenurePeriod() {
        return stateTenurePeriod;
    }

    @JsonProperty("stateTenurePeriod")
    public void setStateTenurePeriod(String stateTenurePeriod) {
        this.stateTenurePeriod = stateTenurePeriod;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
