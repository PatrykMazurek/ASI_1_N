package pl.uken.asi1_n.model;

public class Rate {

    private String currency;
    private String code;
    private double bid;
    private double ask;

    public Rate() {}

    public Rate(String currency, String code, double bid, double ask) {
        this.currency = currency;
        this.code = code;
        this.bid = bid;
        this.ask = ask;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public double getAsk() {
        return ask;
    }

    public void setAsk(double ask) {
        this.ask = ask;
    }
}
