
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
    "fixedVariableInterestRateType",
    "identification",
    "loanInterestFeesCharges",
    "loanProviderInterestRate",
    "loanProviderInterestRateType",
    "maxTermPeriod",
    "minTermPeriod",
    "notes",
    "otherLoanProviderInterestRateType",
    "repAPR",
    "tierValueMaxTerm",
    "tierValueMaximum",
    "tierValueMinTerm",
    "tierValueMinimum"
})
public class LoanInterestTierBand {

    @JsonProperty("fixedVariableInterestRateType")
    private String fixedVariableInterestRateType;
    @JsonProperty("identification")
    private String identification;
    @JsonProperty("loanInterestFeesCharges")
    private List<LoanInterestFeesCharge__1> loanInterestFeesCharges = null;
    @JsonProperty("loanProviderInterestRate")
    private String loanProviderInterestRate;
    @JsonProperty("loanProviderInterestRateType")
    private String loanProviderInterestRateType;
    @JsonProperty("maxTermPeriod")
    private String maxTermPeriod;
    @JsonProperty("minTermPeriod")
    private String minTermPeriod;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("otherLoanProviderInterestRateType")
    private OtherLoanProviderInterestRateType otherLoanProviderInterestRateType;
    @JsonProperty("repAPR")
    private String repAPR;
    @JsonProperty("tierValueMaxTerm")
    private Integer tierValueMaxTerm;
    @JsonProperty("tierValueMaximum")
    private String tierValueMaximum;
    @JsonProperty("tierValueMinTerm")
    private Integer tierValueMinTerm;
    @JsonProperty("tierValueMinimum")
    private String tierValueMinimum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fixedVariableInterestRateType")
    public String getFixedVariableInterestRateType() {
        return fixedVariableInterestRateType;
    }

    @JsonProperty("fixedVariableInterestRateType")
    public void setFixedVariableInterestRateType(String fixedVariableInterestRateType) {
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    }

    @JsonProperty("identification")
    public String getIdentification() {
        return identification;
    }

    @JsonProperty("identification")
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @JsonProperty("loanInterestFeesCharges")
    public List<LoanInterestFeesCharge__1> getLoanInterestFeesCharges() {
        return loanInterestFeesCharges;
    }

    @JsonProperty("loanInterestFeesCharges")
    public void setLoanInterestFeesCharges(List<LoanInterestFeesCharge__1> loanInterestFeesCharges) {
        this.loanInterestFeesCharges = loanInterestFeesCharges;
    }

    @JsonProperty("loanProviderInterestRate")
    public String getLoanProviderInterestRate() {
        return loanProviderInterestRate;
    }

    @JsonProperty("loanProviderInterestRate")
    public void setLoanProviderInterestRate(String loanProviderInterestRate) {
        this.loanProviderInterestRate = loanProviderInterestRate;
    }

    @JsonProperty("loanProviderInterestRateType")
    public String getLoanProviderInterestRateType() {
        return loanProviderInterestRateType;
    }

    @JsonProperty("loanProviderInterestRateType")
    public void setLoanProviderInterestRateType(String loanProviderInterestRateType) {
        this.loanProviderInterestRateType = loanProviderInterestRateType;
    }

    @JsonProperty("maxTermPeriod")
    public String getMaxTermPeriod() {
        return maxTermPeriod;
    }

    @JsonProperty("maxTermPeriod")
    public void setMaxTermPeriod(String maxTermPeriod) {
        this.maxTermPeriod = maxTermPeriod;
    }

    @JsonProperty("minTermPeriod")
    public String getMinTermPeriod() {
        return minTermPeriod;
    }

    @JsonProperty("minTermPeriod")
    public void setMinTermPeriod(String minTermPeriod) {
        this.minTermPeriod = minTermPeriod;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("otherLoanProviderInterestRateType")
    public OtherLoanProviderInterestRateType getOtherLoanProviderInterestRateType() {
        return otherLoanProviderInterestRateType;
    }

    @JsonProperty("otherLoanProviderInterestRateType")
    public void setOtherLoanProviderInterestRateType(OtherLoanProviderInterestRateType otherLoanProviderInterestRateType) {
        this.otherLoanProviderInterestRateType = otherLoanProviderInterestRateType;
    }

    @JsonProperty("repAPR")
    public String getRepAPR() {
        return repAPR;
    }

    @JsonProperty("repAPR")
    public void setRepAPR(String repAPR) {
        this.repAPR = repAPR;
    }

    @JsonProperty("tierValueMaxTerm")
    public Integer getTierValueMaxTerm() {
        return tierValueMaxTerm;
    }

    @JsonProperty("tierValueMaxTerm")
    public void setTierValueMaxTerm(Integer tierValueMaxTerm) {
        this.tierValueMaxTerm = tierValueMaxTerm;
    }

    @JsonProperty("tierValueMaximum")
    public String getTierValueMaximum() {
        return tierValueMaximum;
    }

    @JsonProperty("tierValueMaximum")
    public void setTierValueMaximum(String tierValueMaximum) {
        this.tierValueMaximum = tierValueMaximum;
    }

    @JsonProperty("tierValueMinTerm")
    public Integer getTierValueMinTerm() {
        return tierValueMinTerm;
    }

    @JsonProperty("tierValueMinTerm")
    public void setTierValueMinTerm(Integer tierValueMinTerm) {
        this.tierValueMinTerm = tierValueMinTerm;
    }

    @JsonProperty("tierValueMinimum")
    public String getTierValueMinimum() {
        return tierValueMinimum;
    }

    @JsonProperty("tierValueMinimum")
    public void setTierValueMinimum(String tierValueMinimum) {
        this.tierValueMinimum = tierValueMinimum;
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
