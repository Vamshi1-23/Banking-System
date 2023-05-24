package Techwave.Bank.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Techwave.Bank.model.pojo.BranchManager;

public interface BranchMgerRepo extends JpaRepository<BranchManager,String> {

}
