package Techwave.Bank.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Techwave.Bank.model.pojo.Branch;

public interface Branchrepo extends JpaRepository<Branch,String>{

}
