package com.sura.FormatAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sura.FormatAPI.Model.LetterAcute;

@RestController
@RequestMapping("/api")
public class FormatAPIController {
	
	@GetMapping("/format/{Cad}")
	public String format(@PathVariable String Cad) {
		LetterAcute.getInstance();
		
		Cad = formatLetterSmall(Cad, LetterAcute.LETTERS_SMALL_ACUTE);
		Cad = formatLetterCapital(Cad, LetterAcute.LETTERS_CAPITAL_ACUTE);

		return Cad;
	}
	
	private String formatLetterSmall(String Cad, String letters) {
		for (int i = 0; i < letters.length(); i++) {
			String aux = letters.charAt(i)+"";
			if (Cad.contains(aux)) {			
				Cad = Cad.replace(aux, "\\"+LetterAcute.LETTERS_SMALL_ACUTE_UNICODE.get(aux));
			}
		}
		return Cad;
	}
	
	private String formatLetterCapital(String Cad, String letters) {
		for (int i = 0; i < letters.length(); i++) {
			String aux = letters.charAt(i)+"";
			if (Cad.contains(aux)) {			
				Cad = Cad.replace(aux, "\\"+LetterAcute.LETTERS_CAPITAL_ACUTE_UNICODE.get(aux));
			}
		}
		return Cad;
	}
	
}
