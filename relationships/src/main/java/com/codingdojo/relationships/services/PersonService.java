package com.codingdojo.relationships.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.relationships.models.LicenseModel;
import com.codingdojo.relationships.models.PersonModel;
import com.codingdojo.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	private PersonRepository personRepository;
	@Autowired
	private LicenseService licenseService;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public void create(PersonModel person) {
		personRepository.save(person);}
	public void update(PersonModel person) {
		personRepository.save(person);}
	public void destroy(long id) {
		personRepository.delete(id);}
	
	public ArrayList<PersonModel> all(){
		return (ArrayList<PersonModel>) personRepository.findAll();	
	}
	public PersonModel findByIndex(long id) {
		return personRepository.findOne(id);
	}
	public ArrayList<PersonModel> noLicense(){
		ArrayList<PersonModel> people = this.all();
		ArrayList<LicenseModel> licenses = licenseService.all();
		
		for(int i=0; i<people.size(); i++) {
			for(int j=0; j<licenses.size(); j++) {
				if(people.get(i).getId() == licenses.get(j).getPerson().getId()) {
					
				}
			}
		}
		return people;
	}
}














