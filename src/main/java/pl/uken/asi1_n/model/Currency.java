package pl.uken.asi1_n.model;

public class Currency {

    private String table;
    private String no;
    private String tradingDate;
    private String effectiveDate;
    private Rate[] rates;

    public Currency() {}

    public Currency(String table, String no, String tradingDate, String effectiveDate, Rate[] rates) {
        this.table = table;
        this.no = no;
        this.tradingDate = tradingDate;
        this.effectiveDate = effectiveDate;
        this.rates = rates;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getTradingDate() {
        return tradingDate;
    }

    public void setTradingDate(String tradingDate) {
        this.tradingDate = tradingDate;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Rate[] getRates() {
        return rates;
    }

    public void setRates(Rate[] rates) {
        this.rates = rates;
    }
}
