package kodlama.io.kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService languageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService languageService) {

		this.languageService = languageService;
	}
	
	@GetMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		
		languageService.create(programmingLanguage);
	}
	
	@PutMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage) {
		languageService.update(programmingLanguage);
	}
	
	@GetMapping("/delete")
	public void delete(@RequestParam int id) {
		languageService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(@RequestParam int id) {
		return languageService.getById(id);
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){

		return languageService.getAll();
	}
}
