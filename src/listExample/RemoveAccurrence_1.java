package listExample;

import java.util.Arrays;
import java.util.List;

public class RemoveAccurrence_1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5);

		boolean[] visited = new boolean[list.size()];
		for (int i = 0; i < list.size(); i++) {
			if (visited[i]) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(list.get(i) + " is apperars : " + count);
		}

	}
}
