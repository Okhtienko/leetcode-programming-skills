package task_1768;

public class Main {
	public static void main(String[] args) {
		final String firstWord = "abcd";
		final String secondWord = "pq";
		System.out.println(mergeAlternately(firstWord, secondWord));
	}

	public static String mergeAlternately(final String firstWord, final String secondWord) {
		StringBuilder mergedString = new StringBuilder();
		final int length = Math.min(firstWord.length(), secondWord.length());

		for (int i = 0; i < length; i++) {
			mergedString.append(firstWord.charAt(i));
			mergedString.append(secondWord.charAt(i));
		}

		mergedString.append(firstWord.substring(length));
		mergedString.append(secondWord.substring(length));

		return mergedString.toString();
	}
}
