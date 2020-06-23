package dev.dustinwright.springbootsolo.domain;

import java.util.Set;

public class Automobile {
    private long id;
    private String modelName;
    private String stockNumber;
    private Set<Designer> designers;

    public Automobile() {
    }

    public Automobile(long id, String modelName, String stockNumber, Set<Designer> designers) {
        this.id = id;
        this.modelName = modelName;
        this.stockNumber = stockNumber;
        this.designers = designers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
