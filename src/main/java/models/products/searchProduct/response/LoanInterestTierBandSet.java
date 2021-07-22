
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
    "calculationMethod",
    "identification",
    "loanInterestFeesCharges",
    "loanInterestTierBand",
    "notes",
    "tierBandMethod"
})
public class LoanInterestTierBandSet {

    @JsonProperty("calculationMethod")
    private String calculationMethod;
    @JsonProperty("identification")
    private String identification;
    @JsonProperty("loanInterestFeesCharges")
    private List<LoanInterestFeesCharge> loanInterestFeesCharges = null;
    @JsonProperty("loanInterestTierBand")
    private List<LoanInterestTierBand> loanInterestTierBand = null;
    @JsonProperty("notes")
    private List<String> notes = null;
    @JsonProperty("tierBandMethod")
    private String tierBandMethod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("calculationMethod")
    public String getCalculationMethod() {
        return calculationMethod;
    }

    @JsonProperty("calculationMethod")
    public void setCalculationMethod(String calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    @JsonProperty("identification")
    public String getIdentification() {
        return identification;
    }

    @JsonProperty("identification")
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @JsonProperty("loanInterestFeesCharges")
    public List<LoanInterestFeesCharge> getLoanInterestFeesCharges() {
        return loanInterestFeesCharges;
    }

    @JsonProperty("loanInterestFeesCharges")
    public void setLoanInterestFeesCharges(List<LoanInterestFeesCharge> loanInterestFeesCharges) {
        this.loanInterestFeesCharges = loanInterestFeesCharges;
    }

    @JsonProperty("loanInterestTierBand")
    public List<LoanInterestTierBand> getLoanInterestTierBand() {
        return loanInterestTierBand;
    }

    @JsonProperty("loanInterestTierBand")
    public void setLoanInterestTierBand(List<LoanInterestTierBand> loanInterestTierBand) {
        this.loanInterestTierBand = loanInterestTierBand;
    }

    @JsonProperty("notes")
    public List<String> getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @JsonProperty("tierBandMethod")
    public String getTierBandMethod() {
        return tierBandMethod;
    }

    @JsonProperty("tierBandMethod")
    public void setTierBandMethod(String tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
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
