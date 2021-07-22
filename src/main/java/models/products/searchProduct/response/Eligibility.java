
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
    "ageEligibility",
    "creditCheckEligibility",
    "idEligibility",
    "industryEligibility",
    "legalStructureEligibility",
    "officerEligibility",
    "otherEligibility",
    "residencyEligibility",
    "tradingHistoryEligibility"
})

public class Eligibility {

    @JsonProperty("ageEligibility")
    private AgeEligibility ageEligibility;
    @JsonProperty("creditCheckEligibility")
    private CreditCheckEligibility creditCheckEligibility;
    @JsonProperty("idEligibility")
    private IdEligibility idEligibility;
    @JsonProperty("industryEligibility")
    private IndustryEligibility industryEligibility;
    @JsonProperty("legalStructureEligibility")
    private List<LegalStructureEligibility> legalStructureEligibility = null;
    @JsonProperty("officerEligibility")
    private List<OfficerEligibility> officerEligibility = null;
    @JsonProperty("otherEligibility")
    private List<OtherEligibility> otherEligibility = null;
    @JsonProperty("residencyEligibility")
    private List<ResidencyEligibility> residencyEligibility = null;
    @JsonProperty("tradingHistoryEligibility")
    private List<TradingHistoryEligibility> tradingHistoryEligibility = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ageEligibility")
    public AgeEligibility getAgeEligibility() {
        return ageEligibility;
    }

    @JsonProperty("ageEligibility")
    public void setAgeEligibility(AgeEligibility ageEligibility) {
        this.ageEligibility = ageEligibility;
    }

    @JsonProperty("creditCheckEligibility")
    public CreditCheckEligibility getCreditCheckEligibility() {
        return creditCheckEligibility;
    }

    @JsonProperty("creditCheckEligibility")
    public void setCreditCheckEligibility(CreditCheckEligibility creditCheckEligibility) {
        this.creditCheckEligibility = creditCheckEligibility;
    }

    @JsonProperty("idEligibility")
    public IdEligibility getIdEligibility() {
        return idEligibility;
    }

    @JsonProperty("idEligibility")
    public void setIdEligibility(IdEligibility idEligibility) {
        this.idEligibility = idEligibility;
    }

    @JsonProperty("industryEligibility")
    public IndustryEligibility getIndustryEligibility() {
        return industryEligibility;
    }

    @JsonProperty("industryEligibility")
    public void setIndustryEligibility(IndustryEligibility industryEligibility) {
        this.industryEligibility = industryEligibility;
    }

    @JsonProperty("legalStructureEligibility")
    public List<LegalStructureEligibility> getLegalStructureEligibility() {
        return legalStructureEligibility;
    }

    @JsonProperty("legalStructureEligibility")
    public void setLegalStructureEligibility(List<LegalStructureEligibility> legalStructureEligibility) {
        this.legalStructureEligibility = legalStructureEligibility;
    }

    @JsonProperty("officerEligibility")
    public List<OfficerEligibility> getOfficerEligibility() {
        return officerEligibility;
    }

    @JsonProperty("officerEligibility")
    public void setOfficerEligibility(List<OfficerEligibility> officerEligibility) {
        this.officerEligibility = officerEligibility;
    }

    @JsonProperty("otherEligibility")
    public List<OtherEligibility> getOtherEligibility() {
        return otherEligibility;
    }

    @JsonProperty("otherEligibility")
    public void setOtherEligibility(List<OtherEligibility> otherEligibility) {
        this.otherEligibility = otherEligibility;
    }

    @JsonProperty("residencyEligibility")
    public List<ResidencyEligibility> getResidencyEligibility() {
        return residencyEligibility;
    }

    @JsonProperty("residencyEligibility")
    public void setResidencyEligibility(List<ResidencyEligibility> residencyEligibility) {
        this.residencyEligibility = residencyEligibility;
    }

    @JsonProperty("tradingHistoryEligibility")
    public List<TradingHistoryEligibility> getTradingHistoryEligibility() {
        return tradingHistoryEligibility;
    }

    @JsonProperty("tradingHistoryEligibility")
    public void setTradingHistoryEligibility(List<TradingHistoryEligibility> tradingHistoryEligibility) {
        this.tradingHistoryEligibility = tradingHistoryEligibility;
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
