package com.jilit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jilit.entity.Department;


@Repository
public interface DepartmentRepository extends 
JpaRepository<Department, Integer> {

	
}
