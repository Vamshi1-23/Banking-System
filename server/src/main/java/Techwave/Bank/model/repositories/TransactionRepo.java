package Techwave.Bank.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PatchMapping;

import Techwave.Bank.model.pojo.Transactions;

public interface TransactionRepo extends JpaRepository<Transactions, String> {
public int maximumTransId();
public List<Transactions> transactionsForUser(@Param("acno") int accno);

}
