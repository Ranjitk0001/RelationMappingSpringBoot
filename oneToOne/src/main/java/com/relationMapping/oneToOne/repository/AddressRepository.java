package com.relationMapping.oneToOne.repository;

import com.relationMapping.oneToOne.entity.Address;
import com.relationMapping.oneToOne.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
