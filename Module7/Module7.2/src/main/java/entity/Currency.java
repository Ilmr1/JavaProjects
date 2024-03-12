package entity;

public class Currency {

    private String name;
    private double rate;

    public Currency(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }
    public double getId() {
        return rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return name;
    }

    public double convert(double amount, Currency toCurrency) {
        return amount * this.rate / toCurrency.getRate();
    }

    public double convert(double amount, double rate) {
        return amount * this.rate / rate;
    }

    public double convert(double amount, double fromRate, double toRate) {
        return amount * fromRate / toRate;
    }

    public double convert(double amount, Currency fromCurrency, Currency toCurrency) {
        return amount * fromCurrency.getRate() / toCurrency.getRate();
    }

    public double convert(double amount, Currency fromCurrency, double toRate) {
        return amount * fromCurrency.getRate() / toRate;
    }

    public double convert(double amount, double fromRate, Currency toCurrency) {
        return amount * fromRate / toCurrency.getRate();
    }

    public static void main(String[] args) {
        Currency eur = new Currency("EUR", 1);
        Currency usd = new Currency("USD", 0.92);
        Currency gbp = new Currency("GBP", 0.93);

        System.out.println(eur.convert(100, usd));
        System.out.println(eur.convert(100, 0.92));
        System.out.println(eur.convert(100, 0.92, 0.93));
        System.out.println(eur.convert(100, usd, gbp));
        System.out.println(eur.convert(100, usd, 0.93));
        System.out.println(eur.convert(100, 0.92, gbp));
    }
}
