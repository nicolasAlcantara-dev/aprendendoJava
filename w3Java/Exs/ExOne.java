public class ExOne {
	public static void main(String[] args) {
	int array[] = {33,3,4,5, 10};
	int value = 0;
	for(int i : array) {
	// System.out.println(i);
	value += i;
	}
	System.out.println("Somando os valores do array temos " + value);
}	
}