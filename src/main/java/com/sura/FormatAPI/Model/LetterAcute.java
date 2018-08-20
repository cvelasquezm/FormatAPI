package com.sura.FormatAPI.Model;

import java.util.HashMap;
import java.util.Map;

public class LetterAcute {
	
	public static Map<String,String> LETTERS_SMALL_ACUTE_UNICODE = new HashMap<String,String>();
	public static Map<String,String> LETTERS_CAPITAL_ACUTE_UNICODE = new HashMap<String,String>();
	public static String LETTERS_SMALL_ACUTE = "áéíóú";
	public static String LETTERS_CAPITAL_ACUTE = "ÁÉÍÓÚ";
	
	private static  LetterAcute INSTANCE = null;
	
	public static LetterAcute getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LetterAcute();
		}
		return INSTANCE;
	}
	
	private LetterAcute() {
		LETTERS_SMALL_ACUTE_UNICODE.put(LETTERS_SMALL_ACUTE.charAt(0)+"", "U00E1");
		LETTERS_SMALL_ACUTE_UNICODE.put(LETTERS_SMALL_ACUTE.charAt(1)+"", "U00E9");
		LETTERS_SMALL_ACUTE_UNICODE.put(LETTERS_SMALL_ACUTE.charAt(2)+"", "U00ED");
		LETTERS_SMALL_ACUTE_UNICODE.put(LETTERS_SMALL_ACUTE.charAt(3)+"", "U00F3");
		LETTERS_SMALL_ACUTE_UNICODE.put(LETTERS_SMALL_ACUTE.charAt(4)+"", "U00FA");
		LETTERS_CAPITAL_ACUTE_UNICODE.put(LETTERS_CAPITAL_ACUTE.charAt(0)+"", "U00C1");
		LETTERS_CAPITAL_ACUTE_UNICODE.put(LETTERS_CAPITAL_ACUTE.charAt(1)+"", "U00C9");
		LETTERS_CAPITAL_ACUTE_UNICODE.put(LETTERS_CAPITAL_ACUTE.charAt(2)+"", "U00CD");
		LETTERS_CAPITAL_ACUTE_UNICODE.put(LETTERS_CAPITAL_ACUTE.charAt(3)+"", "U00D3");
		LETTERS_CAPITAL_ACUTE_UNICODE.put(LETTERS_CAPITAL_ACUTE.charAt(4)+"", "U00DA");
	}
	
}
