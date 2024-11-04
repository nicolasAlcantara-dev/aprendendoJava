public class ExTwo {
	public static void main(String[] args) {
	int array[] = {5, 10, 20, 30, 40, 33, 4, 99};
	int maxValue = array[1];
	int minValue = array[1];
	for(int i : array) {
		if(i > maxValue) {
		maxValue = i;
		} 
		if(i <minValue) {
		minValue = i;
		}
	}
	System.out.println("O maior número é " + maxValue);
	System.out.println("O menor número é " + minValue);
}	
}