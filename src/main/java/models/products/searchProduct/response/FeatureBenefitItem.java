
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
    "amount",
    "featureBenefitEligibility",
    "identification",
    "indicator",
    "name",
    "notes",
    "otherType",
    "textual",
    "type"
})
public class FeatureBenefitItem {

    @JsonProperty("amount")
    private String amount;
    @JsonProperty("featureBenefitEligibility")
    private List<FeatureBenefitEligibility__1> featureBenefitEligibility = null;
    @JsonProperty("identification")
    private String identification;
    @JsonProperty("indicator")
    private Boolean indicator;
    @JsonProperty("name")
    private String name;
    @JsonProperty("notes")
    private List<String> notes = null;
    @JsonProperty("otherType")
    private OtherType__3 otherType;
    @JsonProperty("textual")
    private String textual;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("featureBenefitEligibility")
    public List<FeatureBenefitEligibility__1> getFeatureBenefitEligibility() {
        return featureBenefitEligibility;
    }

    @JsonProperty("featureBenefitEligibility")
    public void setFeatureBenefitEligibility(List<FeatureBenefitEligibility__1> featureBenefitEligibility) {
        this.featureBenefitEligibility = featureBenefitEligibility;
    }

    @JsonProperty("identification")
    public String getIdentification() {
        return identification;
    }

    @JsonProperty("identification")
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @JsonProperty("indicator")
    public Boolean getIndicator() {
        return indicator;
    }

    @JsonProperty("indicator")
    public void setIndicator(Boolean indicator) {
        this.indicator = indicator;
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

    @JsonProperty("otherType")
    public OtherType__3 getOtherType() {
        return otherType;
    }

    @JsonProperty("otherType")
    public void setOtherType(OtherType__3 otherType) {
        this.otherType = otherType;
    }

    @JsonProperty("textual")
    public String getTextual() {
        return textual;
    }

    @JsonProperty("textual")
    public void setTextual(String textual) {
        this.textual = textual;
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
