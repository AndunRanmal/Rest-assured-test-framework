
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
    "benefitGroupNominalValue",
    "calculationFrequency",
    "featureBenefitEligibility",
    "featureBenefitItem",
    "fee",
    "name",
    "notes",
    "otherApplicationFrequency",
    "otherCalculationFrequency",
    "otherType",
    "type"
})
public class FeatureBenefitGroup {

    @JsonProperty("applicationFrequency")
    private String applicationFrequency;
    @JsonProperty("benefitGroupNominalValue")
    private String benefitGroupNominalValue;
    @JsonProperty("calculationFrequency")
    private String calculationFrequency;
    @JsonProperty("featureBenefitEligibility")
    private List<FeatureBenefitEligibility> featureBenefitEligibility = null;
    @JsonProperty("featureBenefitItem")
    private List<FeatureBenefitItem> featureBenefitItem = null;
    @JsonProperty("fee")
    private String fee;
    @JsonProperty("name")
    private String name;
    @JsonProperty("notes")
    private List<String> notes = null;
    @JsonProperty("otherApplicationFrequency")
    private OtherApplicationFrequency otherApplicationFrequency;
    @JsonProperty("otherCalculationFrequency")
    private OtherCalculationFrequency otherCalculationFrequency;
    @JsonProperty("otherType")
    private OtherType__4 otherType;
    @JsonProperty("type")
    private String type;
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

    @JsonProperty("benefitGroupNominalValue")
    public String getBenefitGroupNominalValue() {
        return benefitGroupNominalValue;
    }

    @JsonProperty("benefitGroupNominalValue")
    public void setBenefitGroupNominalValue(String benefitGroupNominalValue) {
        this.benefitGroupNominalValue = benefitGroupNominalValue;
    }

    @JsonProperty("calculationFrequency")
    public String getCalculationFrequency() {
        return calculationFrequency;
    }

    @JsonProperty("calculationFrequency")
    public void setCalculationFrequency(String calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    @JsonProperty("featureBenefitEligibility")
    public List<FeatureBenefitEligibility> getFeatureBenefitEligibility() {
        return featureBenefitEligibility;
    }

    @JsonProperty("featureBenefitEligibility")
    public void setFeatureBenefitEligibility(List<FeatureBenefitEligibility> featureBenefitEligibility) {
        this.featureBenefitEligibility = featureBenefitEligibility;
    }

    @JsonProperty("featureBenefitItem")
    public List<FeatureBenefitItem> getFeatureBenefitItem() {
        return featureBenefitItem;
    }

    @JsonProperty("featureBenefitItem")
    public void setFeatureBenefitItem(List<FeatureBenefitItem> featureBenefitItem) {
        this.featureBenefitItem = featureBenefitItem;
    }

    @JsonProperty("fee")
    public String getFee() {
        return fee;
    }

    @JsonProperty("fee")
    public void setFee(String fee) {
        this.fee = fee;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
    public OtherApplicationFrequency getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    @JsonProperty("otherApplicationFrequency")
    public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    @JsonProperty("otherCalculationFrequency")
    public OtherCalculationFrequency getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    @JsonProperty("otherCalculationFrequency")
    public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
    }

    @JsonProperty("otherType")
    public OtherType__4 getOtherType() {
        return otherType;
    }

    @JsonProperty("otherType")
    public void setOtherType(OtherType__4 otherType) {
        this.otherType = otherType;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
