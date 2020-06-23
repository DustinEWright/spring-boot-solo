package dev.dustinwright.springbootsolo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private Set<Designer> designers;

    public Automobile() {
    }

    public Automobile(String modelName, String stockNumber, Set<Designer> designers) {
        this.modelName = modelName;
        this.stockNumber = stockNumber;
        this.designers = designers;
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
}
