package org.cutwordsjavafox;

public class WordCuter {

	public static void main(String[] args) {

		String source = "Hello, world! My name is";
		String[] words = source.split(" ");

		for (int i = 0; i < words.length; i++) {
			char[] letters = words[i].toCharArray();
			System.out.println("There are " + letters.length + " letters in the word: " + "\"" + words[i] + "\"");

		}

	}

}
