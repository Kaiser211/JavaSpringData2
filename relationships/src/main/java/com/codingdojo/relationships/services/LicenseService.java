package com.codingdojo.relationships.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.codingdojo.relationships.models.LicenseModel;
import com.codingdojo.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	private LicenseRepository licenseRepository;
	
	public LicenseService(LicenseRepository licenseRepository){
		this.licenseRepository = licenseRepository;
	}

	public String genLicense(){
		return String.format("%06d",this.all().size()+1);
	}
	
	public ArrayList<LicenseModel> all(){
		return (ArrayList<LicenseModel>) licenseRepository.findAll();
	}
	
	public LicenseModel findByIndex(long id){
		return licenseRepository.findOne(id);
	}
	
	public void create(LicenseModel license){
		license.setNumber(this.genLicense());
		licenseRepository.save(license);
	}
	public void update(LicenseModel license){
		licenseRepository.save(license);}
	public void destroy(long id){
		licenseRepository.delete(id);}


}