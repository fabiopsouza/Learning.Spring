package com.learning.HelloWorld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.learning.HelloWorld.model.Fabricante;
import com.learning.HelloWorld.service.FabricanteService;

@Controller
@RequestMapping("/fabricante")
public class FabricanteController {

	@Autowired
	private FabricanteService fabricanteService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String index(){
		return "/fabricante/index";
	}
	
	@Transactional
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String create(Fabricante fabricante){
		fabricanteService.create(fabricante);
		return index();
	}
}
