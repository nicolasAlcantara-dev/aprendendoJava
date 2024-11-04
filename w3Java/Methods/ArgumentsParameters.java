public class ArgumentsParameters {
	public static void main(String[] args) {
	String name = "Nicolas";
	String lastName = "Alcantara";
	int age = myAge(2005);
	sayName(name, lastName);
	System.out.println(age);
}

	static void sayName(String name, String lastName) {
	System.out.println("My name is " + name + " " + lastName);
}

	static int myAge(int x) {
	return 2024 - x;
	}
} //end of Class