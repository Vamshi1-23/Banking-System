package Techwave.Bank.controller;

import Techwave.Bank.model.dao.serviceImpl.TransactionImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Techwave.Bank.model.pojo.Transactions;


@RestController
public class TransactionController {

	@Autowired
	TransactionImpl transactionImpl;
	
	@PostMapping("insertTransaction")
	public String insertTransaction(@RequestBody Transactions t)
	{
		return transactionImpl.insertTransaction(t);
	}
	
	@GetMapping("getAllTransactions")
	public List<Transactions> getAllTransactions()
	{
		return transactionImpl.getAllTransactions();
	}
	
	@GetMapping("getAllTransactionsForUser/{accno}")
	public List<Transactions> getAllTransactionsForUser(@PathVariable("accno") int accno)
	{
		return transactionImpl.getAllTransactionsForUser(accno);
	}
	
}
