package org.cutwordsjavafox;

public class WordCuter {

	public static void main(String[] args) {

		String source = "Hello, world! My name is";
		String[] words = source.split(" ");
		StringBuilder recoverSource = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			char[] letters = words[i].toCharArray();

			for (int j = 0; j < letters.length; j++) {
				recoverSource.append(letters[j]);
			}

			recoverSource.append(" ");

			System.out.println(recoverSource);
			System.out.println("There are " + letters.length + " letters in the word: " + "\"" + words[i] + "\"");

		}


	}

}
