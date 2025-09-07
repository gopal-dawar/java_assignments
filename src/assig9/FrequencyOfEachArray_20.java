package assig9;

public class FrequencyOfEachArray_20 {
	public static void main(String[] args) {
		
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 8 };
		boolean[] visited = new boolean[numbers.length];
		
		 
		for (int i = 0; i < numbers.length; i++) {
			if (visited[i]) { 
				continue;
			}
 
			int input = numbers[i];

			int count = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == input) {
					count++;
					visited[j] = true;
				}
			}

			System.out.println(input + " = " + count);
		}
	}
}
