package com.codingdojo.dojosAndNinjas.services;


import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosAndNinjas.models.Dojo;
import com.codingdojo.dojosAndNinjas.repositories.DojoRepository;

@Service
public class DojoServices {
	private static DojoRepository dojoRepository;
	
	public DojoServices(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	public ArrayList<Dojo> getAll(){
		return dojoRepository.findAll();
	}
	public static Dojo getDojo(Long id) {
		return dojoRepository.findOne(id);
	}
	public void addDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	

}
