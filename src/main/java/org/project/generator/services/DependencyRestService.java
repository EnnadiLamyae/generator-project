package org.project.generator.services;

import java.util.List;

import org.project.generator.entities.Dependency;
import org.project.generator.metier.DependencyMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependencyRestService {
	
	@Autowired
	private DependencyMetier dependencyMetier;

	@RequestMapping(value="/dependencies",method=RequestMethod.POST)
	public Dependency save(@RequestBody Dependency dependency) {
		return dependencyMetier.save(dependency);
	}
	@RequestMapping(value="/dependencies{id}",method=RequestMethod.GET)
	public Dependency dependency(@PathVariable Long id) {
		return dependencyMetier.dependency(id);
	}
	@RequestMapping(value="/dependencies",method=RequestMethod.PUT)
	public Dependency update(@RequestBody Dependency dependency) {
		return dependencyMetier.update(dependency);
	}
	@RequestMapping(value="/dependencies",method=RequestMethod.DELETE)
	public void delete(@RequestBody Dependency dependency) {
		dependencyMetier.delete(dependency);
	}
	@RequestMapping(value="/dependencies",method=RequestMethod.GET)
	public List<Dependency> dependencies() {
		return dependencyMetier.dependencies();
	}

}
