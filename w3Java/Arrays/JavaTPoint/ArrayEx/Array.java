public class Array {
	static void myCars(String arg[]){
	// Passsing Array to a Methd in Java

	/*
	We can pass the Java array to the method so that we can reuse the same logic on any array. 
	When we pass an array to a method in Java, we are essentially passing a reference to the array. 
	It means that the method will have access to the same array data as the calling code, 
	and any modifications made to the array within the method will affect the original array.
	*/
	
	for(String i : arg) {
	System.out.println(i);
	}
}
	
	public static void main(String args[]) {
	String cars[] = {"Parati Track&Field", "Gol G2", "Astra", "Corsa Wind", "Vectra", "Golf", "Passat"};
	myCars(cars);
}
}