
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
    "cappingPeriod",
    "feeCapAmount",
    "feeCapOccurrence",
    "feeType",
    "minMaxType",
    "notes",
    "otherFeeType"
})
public class FeeChargeCap {

    @JsonProperty("cappingPeriod")
    private String cappingPeriod;
    @JsonProperty("feeCapAmount")
    private String feeCapAmount;
    @JsonProperty("feeCapOccurrence")
    private Integer feeCapOccurrence;
    @JsonProperty("feeType")
    private List<String> feeType = null;
    @JsonProperty("minMaxType")
    private String minMaxType;
    @JsonProperty("notes")
    private List<String> notes = null;
    @JsonProperty("otherFeeType")
    private List<OtherFeeType__4> otherFeeType = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cappingPeriod")
    public String getCappingPeriod() {
        return cappingPeriod;
    }

    @JsonProperty("cappingPeriod")
    public void setCappingPeriod(String cappingPeriod) {
        this.cappingPeriod = cappingPeriod;
    }

    @JsonProperty("feeCapAmount")
    public String getFeeCapAmount() {
        return feeCapAmount;
    }

    @JsonProperty("feeCapAmount")
    public void setFeeCapAmount(String feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
    }

    @JsonProperty("feeCapOccurrence")
    public Integer getFeeCapOccurrence() {
        return feeCapOccurrence;
    }

    @JsonProperty("feeCapOccurrence")
    public void setFeeCapOccurrence(Integer feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
    }

    @JsonProperty("feeType")
    public List<String> getFeeType() {
        return feeType;
    }

    @JsonProperty("feeType")
    public void setFeeType(List<String> feeType) {
        this.feeType = feeType;
    }

    @JsonProperty("minMaxType")
    public String getMinMaxType() {
        return minMaxType;
    }

    @JsonProperty("minMaxType")
    public void setMinMaxType(String minMaxType) {
        this.minMaxType = minMaxType;
    }

    @JsonProperty("notes")
    public List<String> getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @JsonProperty("otherFeeType")
    public List<OtherFeeType__4> getOtherFeeType() {
        return otherFeeType;
    }

    @JsonProperty("otherFeeType")
    public void setOtherFeeType(List<OtherFeeType__4> otherFeeType) {
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
