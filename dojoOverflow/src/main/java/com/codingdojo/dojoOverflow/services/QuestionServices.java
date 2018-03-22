package com.codingdojo.dojoOverflow.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codingdojo.dojoOverflow.models.Question;
import com.codingdojo.dojoOverflow.repositories.QuestionRepo;




@Service
public class QuestionServices {
	
	private QuestionRepo questionRepo;
	
	public QuestionServices (QuestionRepo questionRepo) {
		this.questionRepo = questionRepo;
	}
	
	public ArrayList<Question> getAll(){
		return questionRepo.findAll();
	}
	
	public Question findQuestion(Long id) {
		return questionRepo.findOne(id);
	}
	
	public void addQuestion(Question question) {
		questionRepo.save(question);
	}
}
