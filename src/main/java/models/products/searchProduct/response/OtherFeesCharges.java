
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
    "feeChargeCap",
    "feeChargeDetail"
})
public class OtherFeesCharges {

    @JsonProperty("feeChargeCap")
    private List<FeeChargeCap> feeChargeCap = null;
    @JsonProperty("feeChargeDetail")
    private List<FeeChargeDetail> feeChargeDetail = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("feeChargeCap")
    public List<FeeChargeCap> getFeeChargeCap() {
        return feeChargeCap;
    }

    @JsonProperty("feeChargeCap")
    public void setFeeChargeCap(List<FeeChargeCap> feeChargeCap) {
        this.feeChargeCap = feeChargeCap;
    }

    @JsonProperty("feeChargeDetail")
    public List<FeeChargeDetail> getFeeChargeDetail() {
        return feeChargeDetail;
    }

    @JsonProperty("feeChargeDetail")
    public void setFeeChargeDetail(List<FeeChargeDetail> feeChargeDetail) {
        this.feeChargeDetail = feeChargeDetail;
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
