package entity;

import jakarta.persistence.*;

@Entity
@Table(name="currency")
public class Currency {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private double rate;

    public Currency(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Currency() {

    }

    // getters and setters
}