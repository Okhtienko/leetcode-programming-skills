package task_28;

public class Main {
	public static void main(String[] args) {
		final String haystack = "sadbutsad";
		final String needle = "sad";
		System.out.println(findIndexOfFirstOccurrenceInString(haystack, needle));
	}

	public static int findIndexOfFirstOccurrenceInString(final String haystack, final String needle) {
		return haystack.indexOf(needle);
	}
}
