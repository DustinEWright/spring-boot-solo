package dev.dustinwright.springbootsolo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by DW 06/23/20
 */
@Entity
public class Automobile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String modelName;
    private String stockNumber;

    @ManyToMany
    @JoinTable(name = "designer_automobile", joinColumns = @JoinColumn("automobile_id"),
            inverseJoinColumns = @JoinColumn(name = "designer_id"))
    private Set<Designer> designers = new HashSet<>();

    public Automobile() {
    }

    public Automobile(String modelName, String stockNumber) {
        this.modelName = modelName;
        this.stockNumber = stockNumber;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public Set<Designer> getDesigners() {
        return designers;
    }

    public void setDesigners(Set<Designer> designers) {
        this.designers = designers;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", stockNumber='" + stockNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //Automobile that = (Automobile) o; what originally generated, why is unknown
        Automobile automobile = (Automobile) o;
        //return id != null ? id.equals(that.id) : that.id == null;

        return id != null ? id.equals(automobile.id) : automobile.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
