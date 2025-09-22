package assig8;

public class Checkanagrams_19 {
	public static void main(String[] args) {
		String fString = "Gopal";
		String sString = "Dopal";

		fString = fString.toLowerCase();
		sString = sString.toLowerCase();

		if (fString.length() != sString.length()) {
			System.out.println("Not anagrams (length mismatch)");
			return;
		}

		int[] freq1 = new int[26];
		int[] freq2 = new int[26];

		for (int i = 0; i < fString.length(); i++) {
			freq1[fString.charAt(i) - 'a']++;
			freq2[sString.charAt(i) - 'a']++;
		}

		boolean isAnagram = true;
		for (int i = 0; i < 26; i++) {
			if (freq1[i] != freq2[i]) {
				isAnagram = false;
				break;
			}
		}

		if (isAnagram)
			System.out.println("Given strings are anagrams");
		else
			System.out.println("Given strings are not anagrams");
	}
}
