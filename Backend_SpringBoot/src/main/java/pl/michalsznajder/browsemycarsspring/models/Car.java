package pl.michalsznajder.browsemycarsspring.models;

import pl.michalsznajder.browsemycarsspring.assets.Fuel;

import javax.persistence.*;
import java.util.List;

@Entity
public class Car {
    @Id
    @GeneratedValue
    @Column(name = "car_id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "model_id", nullable = false)
    private Model model;

    @Column(nullable = false)
    private int yearOfProduction;
    @Column(nullable = false)
    private Fuel fuel;
    @Column(nullable = false)
    private Boolean used;
    @Column(nullable = false)
    private int horsepower;
    @Column(nullable = false)
    private int mileage;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private String description;

    public Car() {
    }

    public Car(Model model, int yearOfProduction, Fuel fuel, Boolean used, int horsepower, int mileage, int price, String description) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.fuel = fuel;
        this.used = used;
        this.horsepower = horsepower;
        this.mileage = mileage;
        this.price = price;
        this.description = description;
    }

    @OneToMany(mappedBy = "car")
    private List<Picture> pictures;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }
}