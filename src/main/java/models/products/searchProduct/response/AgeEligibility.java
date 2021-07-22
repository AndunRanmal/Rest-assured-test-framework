
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
    "maximumAge",
    "minimumAge",
    "notes"
})
public class AgeEligibility {

    @JsonProperty("maximumAge")
    private Integer maximumAge;
    @JsonProperty("minimumAge")
    private Integer minimumAge;
    @JsonProperty("notes")
    private String notes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("maximumAge")
    public Integer getMaximumAge() {
        return maximumAge;
    }

    @JsonProperty("maximumAge")
    public void setMaximumAge(Integer maximumAge) {
        this.maximumAge = maximumAge;
    }

    @JsonProperty("minimumAge")
    public Integer getMinimumAge() {
        return minimumAge;
    }

    @JsonProperty("minimumAge")
    public void setMinimumAge(Integer minimumAge) {
        this.minimumAge = minimumAge;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
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
