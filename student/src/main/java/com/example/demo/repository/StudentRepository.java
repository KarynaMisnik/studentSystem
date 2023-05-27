package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository
public interface StudentRepository extends JpaRepository<Person, Integer>{

}