
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
    "legalStructure",
    "notes",
    "otherLegalStructure"
})
public class LegalStructureEligibility {

    @JsonProperty("legalStructure")
    private String legalStructure;
    @JsonProperty("notes")
    private List<String> notes = null;
    @JsonProperty("otherLegalStructure")
    private OtherLegalStructure otherLegalStructure;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("legalStructure")
    public String getLegalStructure() {
        return legalStructure;
    }

    @JsonProperty("legalStructure")
    public void setLegalStructure(String legalStructure) {
        this.legalStructure = legalStructure;
    }

    @JsonProperty("notes")
    public List<String> getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @JsonProperty("otherLegalStructure")
    public OtherLegalStructure getOtherLegalStructure() {
        return otherLegalStructure;
    }

    @JsonProperty("otherLegalStructure")
    public void setOtherLegalStructure(OtherLegalStructure otherLegalStructure) {
        this.otherLegalStructure = otherLegalStructure;
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
