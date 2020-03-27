package org.kavus.one.repo;

import org.kavus.one.ntt.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AnimalRepository extends JpaRepository<Animal,Long>, JpaSpecificationExecutor<Animal> {
}
