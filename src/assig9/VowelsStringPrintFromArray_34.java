package assig9;

public class VowelsStringPrintFromArray_34 {
	public static void main(String[] args) {
		String[] arrStrings = { "Ubantu", "Gopal", "Dawar", "abc", "exyz", "azy", "India" };
		String[] arr2 = new String[arrStrings.length];

		String empty = "";
		int a = 0;
		for (int i = 0; i < arrStrings.length; i++) {
			empty = arrStrings[i];
			char ch = Character.toLowerCase(empty.charAt(0));
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				arr2[a] = arrStrings[i];
				a++;
			}
		}

		System.out.print("Strings in array which is start from vowels : ");
		for (int i = 0; i < a; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
