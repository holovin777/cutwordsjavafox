package org.cutwordsjavafox;

public class WordCuter {

	public static void main(String[] args) {

		String source = "Hello, world!";
		String[] words = source.split(" ");
		System.out.println(words[0]);
		System.out.println(words[1]);
		char[] letters1 = words[0].toCharArray();
		char[] letters2 = words[1].toCharArray();
		System.out.println(letters1.length);
		System.out.println(letters2.length);
		String[][] words2d = {{words[0]}, {words[1]}};
		System.out.println(words2d.length);
		System.out.println(words2d[0][0]);
		System.out.println(words2d[1][0]);

		System.out.println("- Exercises");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
			char[] letters = words[i].toCharArray();
			for (int u = 0; u < letters.length; u++) {
				System.out.println(letters[u]);
			}
		}

	}

}
