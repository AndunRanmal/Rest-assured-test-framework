
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
    "applicationFrequency",
    "calculationFrequency",
    "feeAmount",
    "feeApplicableRange",
    "feeCategory",
    "feeRate",
    "feeRateType",
    "feeType",
    "negotiableIndicator",
    "notes",
    "otherApplicationFrequency",
    "otherCalculationFrequency",
    "otherFeeCategory",
    "otherFeeRateType",
    "otherFeeType"
})
public class FeeChargeDetail {

    @JsonProperty("applicationFrequency")
    private String applicationFrequency;
    @JsonProperty("calculationFrequency")
    private String calculationFrequency;
    @JsonProperty("feeAmount")
    private String feeAmount;
    @JsonProperty("feeApplicableRange")
    private FeeApplicableRange feeApplicableRange;
    @JsonProperty("feeCategory")
    private String feeCategory;
    @JsonProperty("feeRate")
    private String feeRate;
    @JsonProperty("feeRateType")
    private String feeRateType;
    @JsonProperty("feeType")
    private String feeType;
    @JsonProperty("negotiableIndicator")
    private Boolean negotiableIndicator;
    @JsonProperty("notes")
    private List<String> notes = null;
    @JsonProperty("otherApplicationFrequency")
    private OtherApplicationFrequency__3 otherApplicationFrequency;
    @JsonProperty("otherCalculationFrequency")
    private OtherCalculationFrequency__3 otherCalculationFrequency;
    @JsonProperty("otherFeeCategory")
    private OtherFeeCategory otherFeeCategory;
    @JsonProperty("otherFeeRateType")
    private OtherFeeRateType__2 otherFeeRateType;
    @JsonProperty("otherFeeType")
    private OtherFeeType__5 otherFeeType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("applicationFrequency")
    public String getApplicationFrequency() {
        return applicationFrequency;
    }

    @JsonProperty("applicationFrequency")
    public void setApplicationFrequency(String applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    @JsonProperty("calculationFrequency")
    public String getCalculationFrequency() {
        return calculationFrequency;
    }

    @JsonProperty("calculationFrequency")
    public void setCalculationFrequency(String calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    @JsonProperty("feeAmount")
    public String getFeeAmount() {
        return feeAmount;
    }

    @JsonProperty("feeAmount")
    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    @JsonProperty("feeApplicableRange")
    public FeeApplicableRange getFeeApplicableRange() {
        return feeApplicableRange;
    }

    @JsonProperty("feeApplicableRange")
    public void setFeeApplicableRange(FeeApplicableRange feeApplicableRange) {
        this.feeApplicableRange = feeApplicableRange;
    }

    @JsonProperty("feeCategory")
    public String getFeeCategory() {
        return feeCategory;
    }

    @JsonProperty("feeCategory")
    public void setFeeCategory(String feeCategory) {
        this.feeCategory = feeCategory;
    }

    @JsonProperty("feeRate")
    public String getFeeRate() {
        return feeRate;
    }

    @JsonProperty("feeRate")
    public void setFeeRate(String feeRate) {
        this.feeRate = feeRate;
    }

    @JsonProperty("feeRateType")
    public String getFeeRateType() {
        return feeRateType;
    }

    @JsonProperty("feeRateType")
    public void setFeeRateType(String feeRateType) {
        this.feeRateType = feeRateType;
    }

    @JsonProperty("feeType")
    public String getFeeType() {
        return feeType;
    }

    @JsonProperty("feeType")
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    @JsonProperty("negotiableIndicator")
    public Boolean getNegotiableIndicator() {
        return negotiableIndicator;
    }

    @JsonProperty("negotiableIndicator")
    public void setNegotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
    }

    @JsonProperty("notes")
    public List<String> getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @JsonProperty("otherApplicationFrequency")
    public OtherApplicationFrequency__3 getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    @JsonProperty("otherApplicationFrequency")
    public void setOtherApplicationFrequency(OtherApplicationFrequency__3 otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    @JsonProperty("otherCalculationFrequency")
    public OtherCalculationFrequency__3 getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    @JsonProperty("otherCalculationFrequency")
    public void setOtherCalculationFrequency(OtherCalculationFrequency__3 otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
    }

    @JsonProperty("otherFeeCategory")
    public OtherFeeCategory getOtherFeeCategory() {
        return otherFeeCategory;
    }

    @JsonProperty("otherFeeCategory")
    public void setOtherFeeCategory(OtherFeeCategory otherFeeCategory) {
        this.otherFeeCategory = otherFeeCategory;
    }

    @JsonProperty("otherFeeRateType")
    public OtherFeeRateType__2 getOtherFeeRateType() {
        return otherFeeRateType;
    }

    @JsonProperty("otherFeeRateType")
    public void setOtherFeeRateType(OtherFeeRateType__2 otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
    }

    @JsonProperty("otherFeeType")
    public OtherFeeType__5 getOtherFeeType() {
        return otherFeeType;
    }

    @JsonProperty("otherFeeType")
    public void setOtherFeeType(OtherFeeType__5 otherFeeType) {
        this.otherFeeType = otherFeeType;
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
