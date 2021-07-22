
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
    "amount",
    "indicator",
    "minMaxType",
    "notes",
    "otherTradingType",
    "period",
    "textual",
    "tradingType"
})
public class TradingHistoryEligibility {

    @JsonProperty("amount")
    private String amount;
    @JsonProperty("indicator")
    private Boolean indicator;
    @JsonProperty("minMaxType")
    private String minMaxType;
    @JsonProperty("notes")
    private String notes;
    @JsonProperty("otherTradingType")
    private OtherTradingType otherTradingType;
    @JsonProperty("period")
    private String period;
    @JsonProperty("textual")
    private String textual;
    @JsonProperty("tradingType")
    private String tradingType;
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

    @JsonProperty("indicator")
    public Boolean getIndicator() {
        return indicator;
    }

    @JsonProperty("indicator")
    public void setIndicator(Boolean indicator) {
        this.indicator = indicator;
    }

    @JsonProperty("minMaxType")
    public String getMinMaxType() {
        return minMaxType;
    }

    @JsonProperty("minMaxType")
    public void setMinMaxType(String minMaxType) {
        this.minMaxType = minMaxType;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("otherTradingType")
    public OtherTradingType getOtherTradingType() {
        return otherTradingType;
    }

    @JsonProperty("otherTradingType")
    public void setOtherTradingType(OtherTradingType otherTradingType) {
        this.otherTradingType = otherTradingType;
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

    @JsonProperty("tradingType")
    public String getTradingType() {
        return tradingType;
    }

    @JsonProperty("tradingType")
    public void setTradingType(String tradingType) {
        this.tradingType = tradingType;
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
