package com.codingdojo.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.relationships.models.LicenseModel;
import com.codingdojo.relationships.services.LicenseService;
import com.codingdojo.relationships.services.PersonService;

@Controller
@RequestMapping("/licenses")
public class LicenseController{	
	@Autowired
	private LicenseService licenseService;
	@Autowired
	private PersonService personService;
	
	public LicenseController(LicenseService licenseService){
		this.licenseService = licenseService;
	}
	
	@RequestMapping("/new")
	public String _new(Model model){
		model.addAttribute("license",new LicenseModel());
		model.addAttribute("persons",personService.noLicense());
		
		return "new_license";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("license") LicenseModel license,BindingResult res,RedirectAttributes re){
		
		if(res.hasErrors()){
			re.addFlashAttribute("errs",res.getAllErrors());
			return "redirect:/licenses/new";
		}else{
			licenseService.create(license);
			return "redirect:/";
		}
	}
}