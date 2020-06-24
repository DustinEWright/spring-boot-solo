package dev.dustinwright.springbootsolo.repositories;

import dev.dustinwright.springbootsolo.domain.Designer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by DW 06/24/20
 */

public interface DesignerRepository extends CrudRepository<Designer, Long> {
}
