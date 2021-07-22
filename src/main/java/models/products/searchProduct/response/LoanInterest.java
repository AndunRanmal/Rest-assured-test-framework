
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
    "loanInterestTierBandSet",
    "notes"
})
public class LoanInterest {

    @JsonProperty("loanInterestTierBandSet")
    private List<LoanInterestTierBandSet> loanInterestTierBandSet = null;
    @JsonProperty("notes")
    private String notes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("loanInterestTierBandSet")
    public List<LoanInterestTierBandSet> getLoanInterestTierBandSet() {
        return loanInterestTierBandSet;
    }

    @JsonProperty("loanInterestTierBandSet")
    public void setLoanInterestTierBandSet(List<LoanInterestTierBandSet> loanInterestTierBandSet) {
        this.loanInterestTierBandSet = loanInterestTierBandSet;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
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
