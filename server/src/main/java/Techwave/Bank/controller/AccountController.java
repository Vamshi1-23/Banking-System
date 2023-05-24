package Techwave.Bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Techwave.Bank.model.dao.serviceImpl.AccountImpl;
import Techwave.Bank.model.pojo.Account;

@RestController
public class AccountController {
	@Autowired
  AccountImpl accountImpl;
	
	@PostMapping("/insertAccount")
	public String insertACcount(@RequestBody Account A)
	{
		return accountImpl.insertAccount(A);
	}
	
	@GetMapping("/getAccountById/{id}")
	public Account getAccountById(@PathVariable("id") int id)
	{
		return accountImpl.getAccountByIds(id);
	}
	/*
	 * @PostMapping("/withdraw/{accId}/{amount}") public String
	 * withdraw(@PathVariable("accId") int accId,@PathVariable("amount") double
	 * amount) { return accountImpl.withdrawAmount(accId, amount); }
	 * 
	 * @GetMapping("/checkbalance/{accId}") public String
	 * checkbalance(@PathVariable("accId") int accId) { return
	 * accountImpl.checkBalance(accId); }
	 * 
	 * @GetMapping("/getAcctById/{accId}") public Account
	 * getAcctById(@PathVariable("accId") int accId) { return
	 * accountImpl.getAccById(accId); }
	 */
}
