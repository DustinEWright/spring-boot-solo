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
public class Designer {

    @Id
    @GeneratedValue(GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private Set<Automobile> automobiles;

    public Designer() {
    }

  
}
