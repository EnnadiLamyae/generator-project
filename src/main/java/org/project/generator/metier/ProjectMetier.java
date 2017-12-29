package org.project.generator.metier;

import java.util.List;

import org.project.generator.entities.Project;

public interface ProjectMetier {

	public Project save(Project project);
	public Project project(Long id);
	public Project update(Project project);
	public void delete(Project project);
	public List<Project> projects();
}
