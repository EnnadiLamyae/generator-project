package org.project.generator.repositories;

import org.project.generator.entities.Dependency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependencyRepository extends JpaRepository<Dependency, Long> {

}
