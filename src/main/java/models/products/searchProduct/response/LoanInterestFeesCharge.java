
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
    "loanInterestFeeChargeCap",
    "loanInterestFeeChargeDetail"
})
public class LoanInterestFeesCharge {

    @JsonProperty("loanInterestFeeChargeCap")
    private List<LoanInterestFeeChargeCap> loanInterestFeeChargeCap = null;
    @JsonProperty("loanInterestFeeChargeDetail")
    private List<LoanInterestFeeChargeDetail> loanInterestFeeChargeDetail = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("loanInterestFeeChargeCap")
    public List<LoanInterestFeeChargeCap> getLoanInterestFeeChargeCap() {
        return loanInterestFeeChargeCap;
    }

    @JsonProperty("loanInterestFeeChargeCap")
    public void setLoanInterestFeeChargeCap(List<LoanInterestFeeChargeCap> loanInterestFeeChargeCap) {
        this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
    }

    @JsonProperty("loanInterestFeeChargeDetail")
    public List<LoanInterestFeeChargeDetail> getLoanInterestFeeChargeDetail() {
        return loanInterestFeeChargeDetail;
    }

    @JsonProperty("loanInterestFeeChargeDetail")
    public void setLoanInterestFeeChargeDetail(List<LoanInterestFeeChargeDetail> loanInterestFeeChargeDetail) {
        this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
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
