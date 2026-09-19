package com.example.boot1.repository;
import com.example.boot1.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<BankAccount, Integer> {
}
