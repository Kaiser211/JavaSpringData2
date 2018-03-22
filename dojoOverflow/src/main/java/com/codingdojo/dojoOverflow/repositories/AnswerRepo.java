package com.codingdojo.dojoOverflow.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dojoOverflow.models.Answer;



@Repository
public interface AnswerRepo extends CrudRepository<Answer,Long>{
	ArrayList<Answer> findAll();
}
