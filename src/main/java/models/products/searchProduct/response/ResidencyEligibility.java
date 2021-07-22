
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
    "notes",
    "otherResidencyType",
    "residencyIncluded",
    "residencyType"
})
public class ResidencyEligibility {

    @JsonProperty("notes")
    private List<String> notes = null;
    @JsonProperty("otherResidencyType")
    private OtherResidencyType otherResidencyType;
    @JsonProperty("residencyIncluded")
    private String residencyIncluded;
    @JsonProperty("residencyType")
    private String residencyType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("notes")
    public List<String> getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @JsonProperty("otherResidencyType")
    public OtherResidencyType getOtherResidencyType() {
        return otherResidencyType;
    }

    @JsonProperty("otherResidencyType")
    public void setOtherResidencyType(OtherResidencyType otherResidencyType) {
        this.otherResidencyType = otherResidencyType;
    }

    @JsonProperty("residencyIncluded")
    public String getResidencyIncluded() {
        return residencyIncluded;
    }

    @JsonProperty("residencyIncluded")
    public void setResidencyIncluded(String residencyIncluded) {
        this.residencyIncluded = residencyIncluded;
    }

    @JsonProperty("residencyType")
    public String getResidencyType() {
        return residencyType;
    }

    @JsonProperty("residencyType")
    public void setResidencyType(String residencyType) {
        this.residencyType = residencyType;
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
