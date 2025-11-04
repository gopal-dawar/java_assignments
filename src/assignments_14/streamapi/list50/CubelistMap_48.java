package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CubelistMap_48 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(42, 17, 89, 3, 76, 58, 24, 91, 6, 33, 70, 12, 65, 99, 8, 47, 29, 84, 19, 53,
				42, 99, 17, 6, 84);

		Map<Integer, Integer> cubeMap = list.stream().collect(Collectors.toMap(x -> x, y -> (y * y * y), (a, y) -> a));
		System.out.println(cubeMap);
	}
}
