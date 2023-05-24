package Techwave.Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Techwave.Bank.model.dao.serviceImpl.AdminImpl;
import Techwave.Bank.model.pojo.Admin;
import Techwave.Bank.model.repositories.Adminrepo;
@RestController

public class AdminController {
	@Autowired
	AdminImpl adminimpl;	
	

	@GetMapping("getAdmin/{id}")
	public Admin getAdmin(@PathVariable("id") String id)
	{
		return adminimpl.getAdmin(id);
	}
	
	@GetMapping("existAdmin/{id}")
	public Boolean existAdmin(@PathVariable("id") String id)
	{
		return adminimpl.existAdmin(id);
	}
	
}
