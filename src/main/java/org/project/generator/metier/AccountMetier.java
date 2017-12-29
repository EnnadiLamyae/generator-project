package org.project.generator.metier;

import java.util.List;

import org.project.generator.entities.Account;

public interface AccountMetier {
	
	public Account save(Account account);
	public Account account(Long id);
	public Account update(Account account);
	public void delete(Account account);
	public List<Account> accounts();
}
