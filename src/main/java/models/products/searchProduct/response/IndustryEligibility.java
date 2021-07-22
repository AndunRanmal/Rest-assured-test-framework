
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
    "otherSICCodeExluded",
    "otherSICCodeIncluded",
    "siCCodeExcluded",
    "siCCodeIncluded"
})
public class IndustryEligibility {

    @JsonProperty("notes")
    private List<String> notes = null;
    @JsonProperty("otherSICCodeExluded")
    private List<OtherSICCodeExluded> otherSICCodeExluded = null;
    @JsonProperty("otherSICCodeIncluded")
    private List<OtherSICCodeIncluded> otherSICCodeIncluded = null;
    @JsonProperty("siCCodeExcluded")
    private List<String> siCCodeExcluded = null;
    @JsonProperty("siCCodeIncluded")
    private List<String> siCCodeIncluded = null;
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

    @JsonProperty("otherSICCodeExluded")
    public List<OtherSICCodeExluded> getOtherSICCodeExluded() {
        return otherSICCodeExluded;
    }

    @JsonProperty("otherSICCodeExluded")
    public void setOtherSICCodeExluded(List<OtherSICCodeExluded> otherSICCodeExluded) {
        this.otherSICCodeExluded = otherSICCodeExluded;
    }

    @JsonProperty("otherSICCodeIncluded")
    public List<OtherSICCodeIncluded> getOtherSICCodeIncluded() {
        return otherSICCodeIncluded;
    }

    @JsonProperty("otherSICCodeIncluded")
    public void setOtherSICCodeIncluded(List<OtherSICCodeIncluded> otherSICCodeIncluded) {
        this.otherSICCodeIncluded = otherSICCodeIncluded;
    }

    @JsonProperty("siCCodeExcluded")
    public List<String> getSiCCodeExcluded() {
        return siCCodeExcluded;
    }

    @JsonProperty("siCCodeExcluded")
    public void setSiCCodeExcluded(List<String> siCCodeExcluded) {
        this.siCCodeExcluded = siCCodeExcluded;
    }

    @JsonProperty("siCCodeIncluded")
    public List<String> getSiCCodeIncluded() {
        return siCCodeIncluded;
    }

    @JsonProperty("siCCodeIncluded")
    public void setSiCCodeIncluded(List<String> siCCodeIncluded) {
        this.siCCodeIncluded = siCCodeIncluded;
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
