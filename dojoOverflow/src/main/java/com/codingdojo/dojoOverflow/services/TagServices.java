package com.codingdojo.dojoOverflow.services;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codingdojo.dojoOverflow.models.Tag;
import com.codingdojo.dojoOverflow.repositories.TagRepo;



@Service
public class TagServices {
	
	private TagRepo tagRepo;
	public TagServices(TagRepo tagRepo) {
		this.tagRepo = tagRepo;
	}
	
	public ArrayList<Tag> getAll(){
		return tagRepo.findAll();
	}
	
	public Tag findTag(Long id) {
		return tagRepo.findOne(id);
	}
	
	public void addTag(Tag tag) {
		tagRepo.save(tag);
	}

}
