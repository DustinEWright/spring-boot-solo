package dev.dustinwright.springbootsolo.repositories;

import dev.dustinwright.springbootsolo.domain.Brand;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by DW 06/24/20
 */
public interface BrandRepository extends CrudRepository<Brand, Long> {
}
