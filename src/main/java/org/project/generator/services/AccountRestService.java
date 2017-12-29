package org.project.generator.services;

import java.util.List;

import org.project.generator.entities.Account;
import org.project.generator.metier.AccountMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestService {

	@Autowired
	private AccountMetier accountMetier;

	@RequestMapping(value="/accounts",method=RequestMethod.POST)
	public Account save(@RequestBody Account account) {
		return accountMetier.save(account);
	}

	@RequestMapping(value="/accounts/{id}",method=RequestMethod.GET)
	public Account account(@PathVariable Long id) {
		return accountMetier.account(id);
	}
	@RequestMapping(value="/accounts",method=RequestMethod.PUT)
	public Account update(@RequestBody Account account) {
		return accountMetier.update(account);
	}
	@RequestMapping(value="/accounts",method=RequestMethod.DELETE)
	public void delete(@RequestBody Account account) {
		accountMetier.delete(account);
	}
	@RequestMapping(value="/accounts",method=RequestMethod.GET)
	public List<Account> accounts() {
		return accountMetier.accounts();
	}
}
