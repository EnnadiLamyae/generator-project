package org.project.generator.metier;

import java.util.List;

import org.project.generator.entities.Account;
import org.project.generator.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountMetierImpl implements AccountMetier {
	
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account save(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public Account account(Long id) {
		return accountRepository.findOne(id);
	}

	@Override
	public Account update(Account account) {
		return accountRepository.saveAndFlush(account);
	}

	@Override
	public void delete(Account account) {
		accountRepository.delete(account);
	}

	@Override
	public List<Account> accounts() {
		return accountRepository.findAll();
	}

}
