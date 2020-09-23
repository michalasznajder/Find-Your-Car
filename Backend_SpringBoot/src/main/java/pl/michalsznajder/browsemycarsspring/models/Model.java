package pl.michalsznajder.browsemycarsspring.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.util.List;

@Entity
public class Model {
    @Id
    @GeneratedValue
    @Column(name = "model_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "mark_id", nullable = false)
    private Mark mark;


    @OneToMany(mappedBy = "model")
    @JsonBackReference
    private List<Car> cars;


    public Model() {
    }

    public Model(String name, Mark mark) {
        this.name = name;
        this.mark = mark;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

}
