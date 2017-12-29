package org.project.generator.metier;

import java.util.List;

import org.project.generator.entities.Dependency;
import org.project.generator.repositories.DependencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DependencyMetierImpl implements DependencyMetier {
	
	@Autowired
	private DependencyRepository dependencyRepository;

	@Override
	public Dependency save(Dependency dependency) {
		return dependencyRepository.save(dependency);
	}

	@Override
	public Dependency dependency(Long id) {
		return dependencyRepository.findOne(id);
	}

	@Override
	public Dependency update(Dependency dependency) {
		return dependencyRepository.saveAndFlush(dependency);
	}

	@Override
	public void delete(Dependency dependency) {
		dependencyRepository.delete(dependency);
	}

	@Override
	public List<Dependency> dependencies() {
		return dependencyRepository.findAll();
	}

}
