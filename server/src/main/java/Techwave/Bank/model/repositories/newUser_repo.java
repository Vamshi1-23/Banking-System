package Techwave.Bank.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Techwave.Bank.model.pojo.NewUser;

public interface newUser_repo extends JpaRepository<NewUser, Integer>{
	public int maximumUserId();
}
