package com.example.APIs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@Autowired
	private RESTClientService rest;

	@GetMapping("/api")
	public String pokemon(Model model) {
		model.addAttribute("pokemon", rest.getPokemon(""));
		return "api";
	}

	@PostMapping("/pokemon")
	public String showPokemon(Model model, @ModelAttribute Pokemon pokemon) {

		model.addAttribute("error", "No Pokemon found");
		Pokemon newPokemon = rest.getPokemon(pokemon.getName());
		if (newPokemon.getHeight() == null) {
			model.addAttribute("pokemon", newPokemon);

			return "api";
		} else {
			model.addAttribute("pokemon", newPokemon);
			return "pokemon";
		}

	}

}
