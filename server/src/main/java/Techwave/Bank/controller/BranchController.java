package Techwave.Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Techwave.Bank.model.dao.serviceImpl.BranchImpl;
import Techwave.Bank.model.pojo.Branch;
@RestController
public class BranchController {

	@Autowired
	BranchImpl branchImpl;
	

	@GetMapping("getBranch")
	public List<Branch> getallbranches()
	{
		return branchImpl.getallBranches();
	}
}
