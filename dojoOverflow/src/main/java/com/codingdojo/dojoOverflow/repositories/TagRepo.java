package com.codingdojo.dojoOverflow.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dojoOverflow.models.Tag;


@Repository
public interface TagRepo extends CrudRepository<Tag, Long> {
	ArrayList<Tag> findAll();
}