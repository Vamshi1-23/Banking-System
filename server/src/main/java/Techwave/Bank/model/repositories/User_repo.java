package Techwave.Bank.model.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import Techwave.Bank.model.pojo.User;

public interface User_repo extends JpaRepository<User,Integer>{
	public int maximumUserId();
	public int maximumpassword();
	public User findByaadhar(String aadhar);
}
