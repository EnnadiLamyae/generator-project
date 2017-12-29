package org.project.generator.metier;

import java.util.List;

import org.project.generator.entities.Project;
import org.project.generator.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectMetierImpl implements ProjectMetier {
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project save(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public Project project(Long id) {
		return projectRepository.findOne(id);
	}

	@Override
	public Project update(Project project) {
		return projectRepository.saveAndFlush(project);
	}

	@Override
	public void delete(Project project) {
		projectRepository.delete(project);
	}

	@Override
	public List<Project> projects() {
		return projectRepository.findAll();
	}

}
