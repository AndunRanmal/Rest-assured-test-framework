
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
    "amountType",
    "notes",
    "otherAmountType",
    "otherRepaymentFrequency",
    "otherRepaymentType",
    "repaymentFeeCharges",
    "repaymentFrequency",
    "repaymentHoliday",
    "repaymentType"
})
public class Repayment {

    @JsonProperty("amountType")
    private String amountType;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("otherAmountType")
    private OtherAmountType otherAmountType;
    @JsonProperty("otherRepaymentFrequency")
    private OtherRepaymentFrequency otherRepaymentFrequency;
    @JsonProperty("otherRepaymentType")
    private OtherRepaymentType otherRepaymentType;
    @JsonProperty("repaymentFeeCharges")
    private RepaymentFeeCharges repaymentFeeCharges;
    @JsonProperty("repaymentFrequency")
    private String repaymentFrequency;
    @JsonProperty("repaymentHoliday")
    private List<RepaymentHoliday> repaymentHoliday = null;
    @JsonProperty("repaymentType")
    private String repaymentType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("amountType")
    public String getAmountType() {
        return amountType;
    }

    @JsonProperty("amountType")
    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("otherAmountType")
    public OtherAmountType getOtherAmountType() {
        return otherAmountType;
    }

    @JsonProperty("otherAmountType")
    public void setOtherAmountType(OtherAmountType otherAmountType) {
        this.otherAmountType = otherAmountType;
    }

    @JsonProperty("otherRepaymentFrequency")
    public OtherRepaymentFrequency getOtherRepaymentFrequency() {
        return otherRepaymentFrequency;
    }

    @JsonProperty("otherRepaymentFrequency")
    public void setOtherRepaymentFrequency(OtherRepaymentFrequency otherRepaymentFrequency) {
        this.otherRepaymentFrequency = otherRepaymentFrequency;
    }

    @JsonProperty("otherRepaymentType")
    public OtherRepaymentType getOtherRepaymentType() {
        return otherRepaymentType;
    }

    @JsonProperty("otherRepaymentType")
    public void setOtherRepaymentType(OtherRepaymentType otherRepaymentType) {
        this.otherRepaymentType = otherRepaymentType;
    }

    @JsonProperty("repaymentFeeCharges")
    public RepaymentFeeCharges getRepaymentFeeCharges() {
        return repaymentFeeCharges;
    }

    @JsonProperty("repaymentFeeCharges")
    public void setRepaymentFeeCharges(RepaymentFeeCharges repaymentFeeCharges) {
        this.repaymentFeeCharges = repaymentFeeCharges;
    }

    @JsonProperty("repaymentFrequency")
    public String getRepaymentFrequency() {
        return repaymentFrequency;
    }

    @JsonProperty("repaymentFrequency")
    public void setRepaymentFrequency(String repaymentFrequency) {
        this.repaymentFrequency = repaymentFrequency;
    }

    @JsonProperty("repaymentHoliday")
    public List<RepaymentHoliday> getRepaymentHoliday() {
        return repaymentHoliday;
    }

    @JsonProperty("repaymentHoliday")
    public void setRepaymentHoliday(List<RepaymentHoliday> repaymentHoliday) {
        this.repaymentHoliday = repaymentHoliday;
    }

    @JsonProperty("repaymentType")
    public String getRepaymentType() {
        return repaymentType;
    }

    @JsonProperty("repaymentType")
    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
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
