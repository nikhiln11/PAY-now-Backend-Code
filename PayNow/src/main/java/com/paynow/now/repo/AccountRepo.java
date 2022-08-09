package com.paynow.now.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.paynow.now.model.Account;

public interface AccountRepo extends JpaRepository<Account, String> {

}
