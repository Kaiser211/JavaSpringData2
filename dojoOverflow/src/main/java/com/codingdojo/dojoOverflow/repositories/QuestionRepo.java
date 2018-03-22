package com.codingdojo.dojoOverflow.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dojoOverflow.models.Question;



@Repository
public interface QuestionRepo extends CrudRepository<Question, Long>{
	ArrayList<Question> findAll();
}
