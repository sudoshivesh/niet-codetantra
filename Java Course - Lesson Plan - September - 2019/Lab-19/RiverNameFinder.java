package q10938;
public class RiverNameFinder {
	public void findElement(int index) {
		String[] namesArr = { "Ganga", "Yamuna", "Godavari", "Krishna", "Narmada", "Kaveri" };
		if (index >= 0 && index < namesArr.length) {
			System.out.println(namesArr[index]);
		}
	}
}
