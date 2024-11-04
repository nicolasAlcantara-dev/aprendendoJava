public class ExFour{
	public static void main(String[] args) {
	int array[] = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	for(int i : array) {
		if(i % 2 == 0) {
		System.out.println(i + " é par");
		}
	

	}
System.out.println("*************");
		for(int o : array) {
		if(o % 2 != 0) {
		System.out.println(o + " é impar");	
		}
	}
}
}