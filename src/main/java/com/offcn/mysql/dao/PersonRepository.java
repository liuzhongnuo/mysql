package com.offcn.mysql.dao;

import com.offcn.mysql.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "myuser")
public interface PersonRepository extends JpaRepository<Person,Long> {

}
