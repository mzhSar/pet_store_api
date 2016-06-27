package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Pet;

@RestController
public class PetController {
   
	@RequestMapping("/pet")
	public Pet findPetById(@RequestParam(value="id") String name){
		return new Pet(1, null, "dog", null, null, null);
	}
}
