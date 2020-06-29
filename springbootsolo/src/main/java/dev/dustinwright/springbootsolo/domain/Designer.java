package dev.dustinwright.springbootsolo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by DW 06/23/20
 */
@Entity
public class Designer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "designers")
    private Set<Automobile> automobiles = new HashSet<>();

    public Designer() {
    }

    public Designer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public String toString() {
        return "Designer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Designer designer = (Designer) o;

        return id != null ? id.equals(designer.id) : designer.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
