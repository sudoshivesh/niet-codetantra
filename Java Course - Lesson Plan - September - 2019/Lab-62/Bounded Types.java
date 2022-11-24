package q11395;
import java.util.*;
public class BoundedTypeExample {
	public static void main(String[] args) {
		List<String> namesList = new ArrayList<>();
		namesList.add("Ganga");
		namesList.add("Godavari");
		namesList.add("Krishna");
		Set<String> namesSet = new LinkedHashSet<>();
		namesSet.add("Ganga");
		namesSet.add("Godavari");
		namesSet.add("Krishna");
		namesSet.add("Yamuna");
		namesSet.add("Narmada");
		System.out.println("largerCollection : " + largerCollection(namesList, namesSet));
	}
	public static <T extends Collection> T largerCollection(T collection1, T collection2) {
		return (collection1.size() > collection2.size())? collection1 : collection2;
	}
}
