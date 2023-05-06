package streamspackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClass {
	public static void main(String[] args) {
//		List<String> list = Arrays.asList("Java", "Pyuthon");
//		Stream<String> myStream = list.stream();
		
//		String[] arr = {"Java", "Python","Angular"};
//		Stream<String> myStreamArr = Arrays.stream(arr);
//		
//		Stream<Integer> intStream = Stream.of(1,2,3);
//		
//		Stream<Integer> limit = Stream.iterate(0, n->n+1).limit(10);
//		
//		Stream<String> limitString = Stream.generate(() -> "Wiley").limit(5);
//		
//		Stream<Integer> limitRandom = Stream.generate(() -> (int) Math.random()*100).limit(5);
		List<Integer> list = Arrays.asList(1,2,34,54,56,213,22,341,11,3123,123,1235);
//		List<Integer> filteredData = list.stream().filter(x->x%2==0).collect(Collectors.toList());
//		System.out.println(filteredData);
//		List<Integer> mappedList = filteredData.stream().map(n->n/2).collect(Collectors.toList());
//		System.out.println(mappedList);
		List<Integer> filteredData = list.stream().filter(x->x%2==0).map(n->n/2).distinct().limit(2).sorted((a,b)->b-a).collect(Collectors.toList());
		System.out.println(filteredData);
 	}
}
