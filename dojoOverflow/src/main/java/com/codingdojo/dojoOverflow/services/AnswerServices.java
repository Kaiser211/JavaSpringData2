package com.codingdojo.dojoOverflow.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codingdojo.dojoOverflow.models.Answer;
import com.codingdojo.dojoOverflow.repositories.AnswerRepo;


@Service
public class AnswerServices {

	private AnswerRepo answerRepo;
	public AnswerServices(AnswerRepo answerRepo) {
		this.answerRepo = answerRepo;
	}
	
	public ArrayList<Answer> getAll(){
		return answerRepo.findAll();
	}
	
	public Answer findAnswer(Long id) {
		return answerRepo.findOne(id);
	}
	public void addAnswer(Answer answer) {
		answerRepo.save(answer);
	}
	
}
