package dev.dustinwright.springbootsolo.repositories;

import dev.dustinwright.springbootsolo.domain.Automobile;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by DW 06/24/20
 */
public interface AutomobileRepository extends CrudRepository<Automobile, Long> {
}
