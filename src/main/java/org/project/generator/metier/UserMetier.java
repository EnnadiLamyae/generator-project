package org.project.generator.metier;

import java.util.List;

import org.project.generator.entities.User;

public interface UserMetier {
	
	public User save(User user);
	public User user(Long id);
	public User update(User user);
	public void delete(User user);
	public List<User> users();

}
