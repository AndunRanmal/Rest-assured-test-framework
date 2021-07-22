
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
    "repaymentFeeChargeCap",
    "repaymentFeeChargeDetail"
})
public class RepaymentFeeCharges {

    @JsonProperty("repaymentFeeChargeCap")
    private List<RepaymentFeeChargeCap> repaymentFeeChargeCap = null;
    @JsonProperty("repaymentFeeChargeDetail")
    private List<RepaymentFeeChargeDetail> repaymentFeeChargeDetail = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("repaymentFeeChargeCap")
    public List<RepaymentFeeChargeCap> getRepaymentFeeChargeCap() {
        return repaymentFeeChargeCap;
    }

    @JsonProperty("repaymentFeeChargeCap")
    public void setRepaymentFeeChargeCap(List<RepaymentFeeChargeCap> repaymentFeeChargeCap) {
        this.repaymentFeeChargeCap = repaymentFeeChargeCap;
    }

    @JsonProperty("repaymentFeeChargeDetail")
    public List<RepaymentFeeChargeDetail> getRepaymentFeeChargeDetail() {
        return repaymentFeeChargeDetail;
    }

    @JsonProperty("repaymentFeeChargeDetail")
    public void setRepaymentFeeChargeDetail(List<RepaymentFeeChargeDetail> repaymentFeeChargeDetail) {
        this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
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
