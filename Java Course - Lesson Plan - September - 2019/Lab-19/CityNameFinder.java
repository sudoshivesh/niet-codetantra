package q10939;
public class CityNameFinder {
	/**
	 * Create an array which contains given names
	 * 
	 * 
	 * @print the index element
	 * 
	 */ 
	
	public void findElement(int index) {
		//Write your code here
		String[] namesArr={"Mumbai","Delhi","Kolkata","Chennai","Hyderabad","Bangalore"};
		if(index>0 && index<namesArr.length){
			System.out.println(namesArr[index]);
		}else{
			System.out.println("Wrong Index");
		}
		
	}
}
