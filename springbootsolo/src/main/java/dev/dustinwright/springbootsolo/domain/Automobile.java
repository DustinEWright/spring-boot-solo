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
    @GeneratedValue(GenerationType.AUTO)
    private Long id;
    private String modelName;
    private String stockNumber;
    private Set<Designer> designers;

    public Automobile() {
    }


}
