package org.project.generator.services;

import java.util.List;

import org.project.generator.entities.Project;
import org.project.generator.metier.ProjectMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectRestService {
	
	@Autowired
	private ProjectMetier projectMetier;

	@RequestMapping(value="/projects",method=RequestMethod.POST)
	public Project save(@RequestBody Project project) {
		return projectMetier.save(project);
	}
	@RequestMapping(value="/projects/{id}",method=RequestMethod.GET)
	public Project project(@PathVariable Long id) {
		return projectMetier.project(id);
	}
	@RequestMapping(value="/projects",method=RequestMethod.PUT)
	public Project update(@RequestBody Project project) {
		return projectMetier.update(project);
	}
	@RequestMapping(value="/projects",method=RequestMethod.DELETE)
	public void delete(@RequestBody Project project) {
		projectMetier.delete(project);
	}
	@RequestMapping(value="/projects",method=RequestMethod.GET)
	public List<Project> projects() {
		return projectMetier.projects();
	}
}
