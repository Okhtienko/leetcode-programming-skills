package task_459;

public class Main {
	public static void main(String[] args) {
		final String str = "abaababaab";
		System.out.println(repeatedSubstringPattern(str));
	}

	public static boolean repeatedSubstringPattern(final String str) {
		String pattern = str + str;
		return pattern.substring(1, pattern.length() - 1).contains(str);
	}
}
