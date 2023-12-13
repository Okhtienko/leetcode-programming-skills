package task_58;

public class Main {
	public static void main(String[] args) {
		final String str = "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(str));
	}

	public static int lengthOfLastWord(final String str) {
		final String[] words = str.split(" ");
		return words[words.length - 1].length();
	}
}
