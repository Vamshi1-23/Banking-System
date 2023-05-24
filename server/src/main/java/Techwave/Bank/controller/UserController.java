package Techwave.Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Techwave.Bank.model.dao.serviceImpl.UserImpl;
import Techwave.Bank.model.pojo.Account;
import Techwave.Bank.model.pojo.NewUser;
import Techwave.Bank.model.pojo.User;
import Techwave.Bank.model.repositories.newUser_repo;

@RestController
public class UserController {
	@Autowired
	UserImpl userImpl;
	
	
	
	@PostMapping("insertUser")
	public String insertUser(@RequestBody User u)
	{
		//sign up page
		Account a = new Account();
		String msg=userImpl.insertaccount(a);
		return userImpl.insertuser(u,a);
	}
	
	
	@PostMapping("insertNewUser")
	public String insertNewUser(@RequestBody NewUser u)
	{
		//sign up page
		return userImpl.insertnewuser(u);
	}
	
	@GetMapping("getnewuserbyId/{id}")
	public NewUser getnewuserbyId(@PathVariable("id") int id)
	{
		return userImpl.getnewuserbyId(id);
	}
	@GetMapping("getnewuser")
	public List<NewUser> getallnewusers()
	{
		return userImpl.getnewusers();
	}
	
	//Admin or branch manager can delete user
	@DeleteMapping("deleteUser")
	public String deleteUser(@RequestBody User u)
	{
		return userImpl.deleteUser(u);
	}
	
	@DeleteMapping("deletenewUser/{id}")
	public void deleteUser(@PathVariable("id") int id)
	{
		userImpl.deletenewUser(id);
	}
	
	
	//admin can see all user details
	@GetMapping("getUser")
	public List<User> getUser()
	{
		return userImpl.getUser();
	}

	@GetMapping("getPassword/{id}")
	public int getPassword(@PathVariable("id") int id)
	{
		return userImpl.getPassword(id);
	}
	
	@GetMapping("getUserById/{id}")
	public User getUserById(@PathVariable("id") int id)
	{
		return userImpl.getUserById(id);
	}
	
	@GetMapping("newUserExistsById/{id}")
	public Boolean newUserExistsById(@PathVariable("id") int id)
	{
		return userImpl.newUserExistsById(id);
	}
	

	@GetMapping("getExistsById/{id}")
	public Boolean getExistsById(@PathVariable("id") int id)
	{
		return userImpl.existById(id);
	}
	
	
	@GetMapping("findByaadhar/{aadhar}")
	public User findByaadhar(@PathVariable("aadhar") String id)
	{
		return userImpl.findByaadhar(id);
	}
	
}
