
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
    "featureBenefitGroup",
    "featureBenefitItem"
})
public class FeaturesAndBenefits {

    @JsonProperty("featureBenefitGroup")
    private List<FeatureBenefitGroup> featureBenefitGroup = null;
    @JsonProperty("featureBenefitItem")
    private List<FeatureBenefitItem__1> featureBenefitItem = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("featureBenefitGroup")
    public List<FeatureBenefitGroup> getFeatureBenefitGroup() {
        return featureBenefitGroup;
    }

    @JsonProperty("featureBenefitGroup")
    public void setFeatureBenefitGroup(List<FeatureBenefitGroup> featureBenefitGroup) {
        this.featureBenefitGroup = featureBenefitGroup;
    }

    @JsonProperty("featureBenefitItem")
    public List<FeatureBenefitItem__1> getFeatureBenefitItem() {
        return featureBenefitItem;
    }

    @JsonProperty("featureBenefitItem")
    public void setFeatureBenefitItem(List<FeatureBenefitItem__1> featureBenefitItem) {
        this.featureBenefitItem = featureBenefitItem;
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
