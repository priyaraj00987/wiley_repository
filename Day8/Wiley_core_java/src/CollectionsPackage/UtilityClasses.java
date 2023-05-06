package CollectionsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UtilityClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,4,2};
			
		Arrays.sort(arr);
		for(int a: arr) {
			System.out.println(a);
		}
		ArrayList<Integer> al= new ArrayList<>();
		
		al.add(2);

		al.add(6);
		al.add(7);
		al.add(8);
		al.add(2);
		
		Collections.sort(al);
		System.out.println(al);
	}

}
