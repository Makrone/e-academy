package com.epam.jwd.home.task2.parser.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.epam.jwd.home.task2.domain.TextPart;
import com.epam.jwd.home.task2.parser.Parser;

public class WordParser implements Parser {

	Pattern patternWord = Pattern.compile("\\\\b[^\\\\s]+[\\\\w]");

	@Override
	public List<TextPart> parse(String subSentence) {
		List<TextPart> word= new ArrayList<>();
		
		
		

		return null;
	}

}
