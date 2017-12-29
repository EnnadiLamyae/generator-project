package org.project.generator.metier;

import java.util.List;

import org.project.generator.entities.User;
import org.project.generator.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMetierImpl implements UserMetier {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User user(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public User update(User user) {
		return userRepository.saveAndFlush(user);
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}

	@Override
	public List<User> users() {
		return userRepository.findAll();
	}

}
