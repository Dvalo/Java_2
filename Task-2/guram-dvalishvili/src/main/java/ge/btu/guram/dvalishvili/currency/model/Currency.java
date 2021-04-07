package ge.btu.guram.dvalishvili.currency.model;

public class Currency {
    private String title;
    private double buy, sell;

    public Currency() {}

    public Currency(String title, double buy, double sell) {
        this.title = title;
        this.buy = buy;
        this.sell = sell;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    public static double convertFromGel(double rate, double amount) {
        return amount / rate;
    }

    public static double convertToGel(double rate, double amount) {
        return rate * amount;
    }

}
