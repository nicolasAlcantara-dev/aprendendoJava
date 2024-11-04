public class Conditions {
    public static void main(String[] args) {
        int day = 6;
	/*
	There is also a short-hand if else, 
	which is known as the ternary operator because it consists 
	of three operands.
	*/
	String result = (day != 6) ? "Falta muito pra sexta??" : "Hoje é sexta krlll";

	        
	System.out.println(result);
        if (day == 1) {
            System.out.println("Domingo");
        } else if (day == 2) {
            System.out.println("Segunda");
        } else if (day == 3) {
            System.out.println("Terça");
        } else if (day == 4) {
            System.out.println("Quarta");
        } else if (day == 5) {
            System.out.println("Quinta");
        } else if (day == 6) {
            System.out.println("Sexta");
        } else {
            System.out.println("Sábado");
        }
    }
}
