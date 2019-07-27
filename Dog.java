
class Dog{
	int health = 100, limit;
	String ownerName;
	Toy dogToy;
	
	public Dog(int chooseLimit, String name, String _toyId){
		limit = chooseLimit;
		ownerName = name;
		dogToy = new Toy(_toyId);
	}

	public void atack(String name){
		if (name == ownerName) {
			System.out.println("Ataco");
		}
	}

	public void bark(String name){
		String text = (health < 0) ? "Ataca" : (name == ownerName) ? "Guauu!" : (health >= limit) ? "Guauu" : "Ataca";
		System.out.println(text);
	}
	// JUEGA CON PERSONA
	public void play(String name){
		String text = (name == ownerName) ? "Juega con persona!" : "No hace nada";
		System.out.println(text);
	}
	
	// JUEGA CON JUGUETE ALTERA SU FELICIDAD LO HACE SOLO POR LO CUAL NO NECESITA QUE DUENO SE LO DE
	public void playWithToy(String toyId){
		health = (dogToy.play(toyId)) ? health + 5 : health;
	}
	
	public void giveCookie(int value){
		health += 5 * value;
	}	

	public void hit(int times){
		health -= 5 * times;
	}

	public String getToyId(){
		return dogToy.getToyId();
	}


}
//Java c name
// Java Name
