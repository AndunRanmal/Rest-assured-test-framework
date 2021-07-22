
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
    "description",
    "indicator",
    "name",
    "notes",
    "otherType",
    "period",
    "textual",
    "type"
})
public class OtherEligibility {

    @JsonProperty("amount")
    private String amount;
    @JsonProperty("description")
    private String description;
    @JsonProperty("indicator")
    private Boolean indicator;
    @JsonProperty("name")
    private String name;
    @JsonProperty("notes")
    private List<String> notes = null;
    @JsonProperty("otherType")
    private OtherType otherType;
    @JsonProperty("period")
    private String period;
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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
    public OtherType getOtherType() {
        return otherType;
    }

    @JsonProperty("otherType")
    public void setOtherType(OtherType otherType) {
        this.otherType = otherType;
    }

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
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
