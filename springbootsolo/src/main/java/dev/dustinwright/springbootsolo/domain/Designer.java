package dev.dustinwright.springbootsolo.domain;

import java.util.Set;

/**
 * Created by DW 06/23/20
 */
public class Designer {

    private long id;

    private String firstName;
    private String lastName;
    private Set<Automobile> automobiles;

    public Designer() {
    }

    public Designer(long id, String firstName, String lastName, Set<Automobile> automobiles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.automobiles = automobiles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Automobile> getAutomobiles() {
        return automobiles;
    }

    public void setAutomobiles(Set<Automobile> automobiles) {
        this.automobiles = automobiles;
    }
}
