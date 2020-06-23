package dev.dustinwright.springbootsolo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by DW 06/23/20
 */
@Entity
public class Brand {
    @Id
    @GeneratedValue(GenerationType.AUTO)
    private Long id;

    private String name;
    private String addressLine1;
    private String city;
    private String state;
    private String zip;

    public Brand() {
    }

}
