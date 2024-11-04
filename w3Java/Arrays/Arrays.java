public class Arrays{
	public static void main(String[] args){
	// Arrays are used to store values in a single variable
	int[] myNum = {10, 20, 30, 40};
	String[] cars = {"Gol G3", "Astra", "Civic G6"};

	for(int i = 0; i < cars.length; i++) {
	System.out.println(cars[i]);
	}
	
	for(int n : myNum) {
	System.out.println(n);
	}
	
}
}