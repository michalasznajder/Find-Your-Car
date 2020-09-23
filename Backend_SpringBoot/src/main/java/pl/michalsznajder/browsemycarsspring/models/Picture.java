package pl.michalsznajder.browsemycarsspring.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Picture {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String url;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    public Picture() {
    }

    public Picture(String url, Car car) {
        this.url = url;
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
