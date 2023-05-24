package Techwave.Bank.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Techwave.Bank.model.pojo.Account;

public interface AccountRepo extends JpaRepository<Account, Integer>{
	public int maximumAccId();
}
