
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
    "identification",
    "name",
    "otherSegment",
    "segment",
    "smELoanMarketingState"
})

public class Detail {

    @JsonProperty("identification")
    private String identification;
    @JsonProperty("name")
    private String name;
    @JsonProperty("otherSegment")
    private OtherSegment otherSegment;
    @JsonProperty("segment")
    private String segment;
    @JsonProperty("smELoanMarketingState")
    private List<SmELoanMarketingState> smELoanMarketingState = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("identification")
    public String getIdentification() {
        return identification;
    }

    @JsonProperty("identification")
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("otherSegment")
    public OtherSegment getOtherSegment() {
        return otherSegment;
    }

    @JsonProperty("otherSegment")
    public void setOtherSegment(OtherSegment otherSegment) {
        this.otherSegment = otherSegment;
    }

    @JsonProperty("segment")
    public String getSegment() {
        return segment;
    }

    @JsonProperty("segment")
    public void setSegment(String segment) {
        this.segment = segment;
    }

    @JsonProperty("smELoanMarketingState")
    public List<SmELoanMarketingState> getSmELoanMarketingState() {
        return smELoanMarketingState;
    }

    @JsonProperty("smELoanMarketingState")
    public void setSmELoanMarketingState(List<SmELoanMarketingState> smELoanMarketingState) {
        this.smELoanMarketingState = smELoanMarketingState;
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
