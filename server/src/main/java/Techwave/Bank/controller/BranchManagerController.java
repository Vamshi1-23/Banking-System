package Techwave.Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Techwave.Bank.model.dao.serviceImpl.BranchManagerImpl;
import Techwave.Bank.model.pojo.BranchManager;
@RestController
public class BranchManagerController {
	
	@Autowired
	BranchManagerImpl branchManagerImpl;
	
	@GetMapping("getBranchManagers")
	public List<BranchManager> getall()
	{
		return branchManagerImpl.getAllB_Mgr();
	}
	

}
