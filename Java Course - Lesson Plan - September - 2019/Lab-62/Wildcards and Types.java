package q11396;
import java.util.*;
public class WildCardTypesDemo {
	public static void main(String[] args) {
		List<? extends Number> upperList = Arrays.asList(2, 3, 4);
		List<? super Number> lowerList = new ArrayList<>();
		List<Integer> noBoundsList = new ArrayList<>();
		upperBoundedMethod(upperList);
		lowerBoundedMethod(lowerList);
		noBoundedMethod(noBoundsList);
	}
	public static void upperBoundedMethod(List<? extends Number> list) {
		System.out.println("In upperBoundedMethod");
		for (Number number : list) {
			System.out.println(number);
		}
	}
	public static void lowerBoundedMethod(List<? super Integer> list) {
		System.out.println("In lowerBoundedMethod");
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("list : " + list);
	}
	public static void noBoundedMethod(List<Integer> list) {
		System.out.println("In noBoundedMethod");
		list.add(new Integer(8));
		list.add(new Integer(7));
		System.out.println("list : " + list);
	}
}
