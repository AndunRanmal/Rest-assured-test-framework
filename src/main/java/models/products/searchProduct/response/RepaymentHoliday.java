
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
    "maxHolidayLength",
    "maxHolidayPeriod",
    "notes"
})
public class RepaymentHoliday {

    @JsonProperty("maxHolidayLength")
    private Integer maxHolidayLength;
    @JsonProperty("maxHolidayPeriod")
    private String maxHolidayPeriod;
    @JsonProperty("notes")
    private List<String> notes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("maxHolidayLength")
    public Integer getMaxHolidayLength() {
        return maxHolidayLength;
    }

    @JsonProperty("maxHolidayLength")
    public void setMaxHolidayLength(Integer maxHolidayLength) {
        this.maxHolidayLength = maxHolidayLength;
    }

    @JsonProperty("maxHolidayPeriod")
    public String getMaxHolidayPeriod() {
        return maxHolidayPeriod;
    }

    @JsonProperty("maxHolidayPeriod")
    public void setMaxHolidayPeriod(String maxHolidayPeriod) {
        this.maxHolidayPeriod = maxHolidayPeriod;
    }

    @JsonProperty("notes")
    public List<String> getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(List<String> notes) {
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
