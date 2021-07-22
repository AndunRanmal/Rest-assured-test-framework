
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
    "earlyPaymentFeeApplicable",
    "fullEarlyRepaymentAllowedIndicator",
    "loanApplicationFeeChargeType",
    "notes",
    "overPaymentFeeApplicable",
    "overpaymentAllowedIndicator",
    "productDescription",
    "productURL",
    "salesAccessChannels",
    "servicingAccessChannels",
    "tcsAndCsURL"
})
public class CoreProduct {

    @JsonProperty("earlyPaymentFeeApplicable")
    private Boolean earlyPaymentFeeApplicable;
    @JsonProperty("fullEarlyRepaymentAllowedIndicator")
    private Boolean fullEarlyRepaymentAllowedIndicator;
    @JsonProperty("loanApplicationFeeChargeType")
    private String loanApplicationFeeChargeType;
    @JsonProperty("notes")
    private List<String> notes = null;
    @JsonProperty("overPaymentFeeApplicable")
    private Boolean overPaymentFeeApplicable;
    @JsonProperty("overpaymentAllowedIndicator")
    private Boolean overpaymentAllowedIndicator;
    @JsonProperty("productDescription")
    private String productDescription;
    @JsonProperty("productURL")
    private String productURL;
    @JsonProperty("salesAccessChannels")
    private String salesAccessChannels;
    @JsonProperty("servicingAccessChannels")
    private String servicingAccessChannels;
    @JsonProperty("tcsAndCsURL")
    private String tcsAndCsURL;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("earlyPaymentFeeApplicable")
    public Boolean getEarlyPaymentFeeApplicable() {
        return earlyPaymentFeeApplicable;
    }

    @JsonProperty("earlyPaymentFeeApplicable")
    public void setEarlyPaymentFeeApplicable(Boolean earlyPaymentFeeApplicable) {
        this.earlyPaymentFeeApplicable = earlyPaymentFeeApplicable;
    }

    @JsonProperty("fullEarlyRepaymentAllowedIndicator")
    public Boolean getFullEarlyRepaymentAllowedIndicator() {
        return fullEarlyRepaymentAllowedIndicator;
    }

    @JsonProperty("fullEarlyRepaymentAllowedIndicator")
    public void setFullEarlyRepaymentAllowedIndicator(Boolean fullEarlyRepaymentAllowedIndicator) {
        this.fullEarlyRepaymentAllowedIndicator = fullEarlyRepaymentAllowedIndicator;
    }

    @JsonProperty("loanApplicationFeeChargeType")
    public String getLoanApplicationFeeChargeType() {
        return loanApplicationFeeChargeType;
    }

    @JsonProperty("loanApplicationFeeChargeType")
    public void setLoanApplicationFeeChargeType(String loanApplicationFeeChargeType) {
        this.loanApplicationFeeChargeType = loanApplicationFeeChargeType;
    }

    @JsonProperty("notes")
    public List<String> getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @JsonProperty("overPaymentFeeApplicable")
    public Boolean getOverPaymentFeeApplicable() {
        return overPaymentFeeApplicable;
    }

    @JsonProperty("overPaymentFeeApplicable")
    public void setOverPaymentFeeApplicable(Boolean overPaymentFeeApplicable) {
        this.overPaymentFeeApplicable = overPaymentFeeApplicable;
    }

    @JsonProperty("overpaymentAllowedIndicator")
    public Boolean getOverpaymentAllowedIndicator() {
        return overpaymentAllowedIndicator;
    }

    @JsonProperty("overpaymentAllowedIndicator")
    public void setOverpaymentAllowedIndicator(Boolean overpaymentAllowedIndicator) {
        this.overpaymentAllowedIndicator = overpaymentAllowedIndicator;
    }

    @JsonProperty("productDescription")
    public String getProductDescription() {
        return productDescription;
    }

    @JsonProperty("productDescription")
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @JsonProperty("productURL")
    public String getProductURL() {
        return productURL;
    }

    @JsonProperty("productURL")
    public void setProductURL(String productURL) {
        this.productURL = productURL;
    }

    @JsonProperty("salesAccessChannels")
    public String getSalesAccessChannels() {
        return salesAccessChannels;
    }

    @JsonProperty("salesAccessChannels")
    public void setSalesAccessChannels(String salesAccessChannels) {
        this.salesAccessChannels = salesAccessChannels;
    }

    @JsonProperty("servicingAccessChannels")
    public String getServicingAccessChannels() {
        return servicingAccessChannels;
    }

    @JsonProperty("servicingAccessChannels")
    public void setServicingAccessChannels(String servicingAccessChannels) {
        this.servicingAccessChannels = servicingAccessChannels;
    }

    @JsonProperty("tcsAndCsURL")
    public String getTcsAndCsURL() {
        return tcsAndCsURL;
    }

    @JsonProperty("tcsAndCsURL")
    public void setTcsAndCsURL(String tcsAndCsURL) {
        this.tcsAndCsURL = tcsAndCsURL;
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
