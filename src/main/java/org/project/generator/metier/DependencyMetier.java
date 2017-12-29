package org.project.generator.metier;

import java.util.List;

import org.project.generator.entities.Dependency;

public interface DependencyMetier {

	public Dependency save(Dependency dependency);
	public Dependency dependency(Long id);
	public Dependency update(Dependency dependency);
	public void delete(Dependency dependency);
	public List<Dependency> dependencies();
}
