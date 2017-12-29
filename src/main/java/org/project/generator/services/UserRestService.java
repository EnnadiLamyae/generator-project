package org.project.generator.services;

import java.util.List;

import org.project.generator.entities.User;
import org.project.generator.metier.UserMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestService {

	@Autowired
	private UserMetier userMetier;

	@RequestMapping(value="/users",method=RequestMethod.POST)
	public User save(@RequestBody User user) {
		return userMetier.save(user);
	}
	@RequestMapping(value="/users/{id}",method=RequestMethod.GET)
	public User user(@PathVariable Long id) {
		return userMetier.user(id);
	}
	@RequestMapping(value="/users",method=RequestMethod.PUT)
	public User update(@RequestBody User user) {
		return userMetier.update(user);
	}
	@RequestMapping(value="/users",method=RequestMethod.DELETE)
	public void delete(@RequestBody User user) {
		userMetier.delete(user);
	}
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public List<User> users() {
		return userMetier.users();
	}
}
