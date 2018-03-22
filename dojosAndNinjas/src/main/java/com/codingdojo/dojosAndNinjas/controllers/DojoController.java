package com.codingdojo.dojosAndNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojosAndNinjas.models.Dojo;
import com.codingdojo.dojosAndNinjas.models.Ninja;
import com.codingdojo.dojosAndNinjas.services.DojoServices;





@Controller
@RequestMapping("/dojo")
public class DojoController {
	
	private DojoServices dojoServices;
	public DojoController(DojoServices dojoServices) {
		this.dojoServices = dojoServices;
	}

	
	@RequestMapping("/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	@PostMapping("/new")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}else {
			dojoServices.addDojo(dojo);
			return "redirect:/";
		}
	}
	@RequestMapping("/{id}")
	public String selectedDojo(Model model,@PathVariable("id") Long id) {
		List<Ninja> ninjas = DojoServices.getDojo(id).getNinjas();
		model.addAttribute("dojo", DojoServices.getDojo(id));
		model.addAttribute("ninjas", ninjas);
		return "showDojoNinjas.jsp";
	}
	

}