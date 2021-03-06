package com.codingdojo.relationships.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.relationships.models.LicenseModel;


@Repository
public interface LicenseRepository extends CrudRepository<LicenseModel,Long>{
	ArrayList<LicenseModel> findByPersonIdContaining(long id);
}