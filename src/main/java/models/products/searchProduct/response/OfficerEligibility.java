
package models.products.searchProduct.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "maxAmount",
    "minAmount",
    "notes",
    "officerType",
    "otherOfficerType"
})
public class OfficerEligibility {

    @JsonProperty("maxAmount")
    private Integer maxAmount;
    @JsonProperty("minAmount")
    private Integer minAmount;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("officerType")
    private String officerType;
    @JsonProperty("otherOfficerType")
    private OtherOfficerType otherOfficerType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("maxAmount")
    public Integer getMaxAmount() {
        return maxAmount;
    }

    @JsonProperty("maxAmount")
    public void setMaxAmount(Integer maxAmount) {
        this.maxAmount = maxAmount;
    }

    @JsonProperty("minAmount")
    public Integer getMinAmount() {
        return minAmount;
    }

    @JsonProperty("minAmount")
    public void setMinAmount(Integer minAmount) {
        this.minAmount = minAmount;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("officerType")
    public String getOfficerType() {
        return officerType;
    }

    @JsonProperty("officerType")
    public void setOfficerType(String officerType) {
        this.officerType = officerType;
    }

    @JsonProperty("otherOfficerType")
    public OtherOfficerType getOtherOfficerType() {
        return otherOfficerType;
    }

    @JsonProperty("otherOfficerType")
    public void setOtherOfficerType(OtherOfficerType otherOfficerType) {
        this.otherOfficerType = otherOfficerType;
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
