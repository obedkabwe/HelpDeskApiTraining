package com.obed.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obed.helpdesk.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
