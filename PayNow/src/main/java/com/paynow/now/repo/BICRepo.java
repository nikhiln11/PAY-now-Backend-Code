package com.paynow.now.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paynow.now.model.BIC;

public interface BICRepo extends JpaRepository<BIC, String> {

}
