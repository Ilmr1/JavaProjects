package model;

import java.util.ArrayList;
public class currency {

    static ArrayList<String> valuutat;

    public currency() {
        valuutat = new ArrayList<String>();
        valuutat.add("EUR");
        valuutat.add("USD");
        valuutat.add("GBP");
    }

    public static ArrayList<String> getValuutat() {
        return valuutat;
    }
}
