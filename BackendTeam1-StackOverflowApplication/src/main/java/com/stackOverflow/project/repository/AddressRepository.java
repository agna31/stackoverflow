package com.stackOverflow.project.repository;

import com.stackOverflow.project.model.Address;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AddressRepository extends JpaRepository<Address, Long>{
    
}
