package com.codingdojo.dojosAndNinjas.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import  com.codingdojo.dojosAndNinjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long>{
	ArrayList<Dojo> findAll();

}
