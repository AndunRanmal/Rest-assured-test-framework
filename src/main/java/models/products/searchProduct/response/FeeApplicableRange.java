
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
    "maximumAmount",
    "maximumRate",
    "minimumAmount",
    "minimumRate"
})
public class FeeApplicableRange {

    @JsonProperty("maximumAmount")
    private String maximumAmount;
    @JsonProperty("maximumRate")
    private String maximumRate;
    @JsonProperty("minimumAmount")
    private String minimumAmount;
    @JsonProperty("minimumRate")
    private String minimumRate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("maximumAmount")
    public String getMaximumAmount() {
        return maximumAmount;
    }

    @JsonProperty("maximumAmount")
    public void setMaximumAmount(String maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    @JsonProperty("maximumRate")
    public String getMaximumRate() {
        return maximumRate;
    }

    @JsonProperty("maximumRate")
    public void setMaximumRate(String maximumRate) {
        this.maximumRate = maximumRate;
    }

    @JsonProperty("minimumAmount")
    public String getMinimumAmount() {
        return minimumAmount;
    }

    @JsonProperty("minimumAmount")
    public void setMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    @JsonProperty("minimumRate")
    public String getMinimumRate() {
        return minimumRate;
    }

    @JsonProperty("minimumRate")
    public void setMinimumRate(String minimumRate) {
        this.minimumRate = minimumRate;
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
