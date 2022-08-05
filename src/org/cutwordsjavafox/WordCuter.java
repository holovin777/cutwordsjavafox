package org.cutwordsjavafox;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class WordCuter {

	public static void main(String[] args) {

		String source = "Hello, world! My name is";
		String[] wordsAfterSplit = source.split(" ");
		List<String> words = new ArrayList<>(Arrays.asList(wordsAfterSplit));
		StringBuilder recoverSource = new StringBuilder();

		for (int i = 0; i < words.size(); i++) {
			List<String> letters = new ArrayList<>();
			letters.add(words.get(i));

			for (int j = 0; j < letters.size(); j++) {
				recoverSource.append(letters.get(j));
			}

			recoverSource.append(" ");

			System.out.println(recoverSource);
			System.out.println("There are " + letters.size() + " letters in the word: " + "\"" + words.get(i) + "\"");

		}


	}

}
