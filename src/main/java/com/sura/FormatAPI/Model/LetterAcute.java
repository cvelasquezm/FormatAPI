package com.sura.FormatAPI.Model;

import java.util.HashMap;
import java.util.Map;

public class LetterAcute {
	
	public static Map<String,String> LETTERS_SMALL_ACUTE = new HashMap<String,String>();
	private static Map<String,String> LETTERS_CAPITAL_ACUTE = new HashMap<String,String>();
	
	private static  LetterAcute INSTANCE = null;
	
	public static LetterAcute getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LetterAcute();
		}
		return INSTANCE;
	}
	
	private LetterAcute() {
		LETTERS_SMALL_ACUTE.put("á", "U00E1");
		LETTERS_SMALL_ACUTE.put("é", "U00E9");
		LETTERS_SMALL_ACUTE.put("í", "U00ED");
		LETTERS_SMALL_ACUTE.put("ó", "U00F3");
		LETTERS_SMALL_ACUTE.put("ú", "U00FA");
	}
	
}
