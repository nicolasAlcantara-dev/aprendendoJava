class Shinobi {
	String name;
	String jutsu;
	//Constructor
	public Shinobi(String name, String jutsu) {
	this.name = name;
	this.jutsu = jutsu;
}

	void displayInformation() {
	System.out.print(name + " ");
	System.out.println(jutsu);

}
}

class Main {
	public static void main(String args[]){
	Shinobi ninja1 = new Shinobi("Naruto Uzumaki", "Rasengan");
	Shinobi ninja2 = new Shinobi("Sasuke Uchiha", "Chidori");
	Shinobi ninja3 = new Shinobi("Sakura Haruno", "I do not know");
	ninja1.displayInformation();
	ninja2.displayInformation();
	ninja3.displayInformation();
}
}