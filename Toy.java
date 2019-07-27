
class Toy{
	int health = 10;
	String id;
	
	public Toy(String _id){
		id = _id;
	}

	public boolean play(String _id){
		Boolean played = false;
		if (health < 0) {
			System.out.println("El perro no puede jugar ya arruino su juguete");
		}
		if(id == _id && health > 0){
			health -= 1;
			System.out.println("El perro jugo su jugeute");
			played = true;
		}else{
			System.out.println("No es su juguete");
		}
		return played;
	}
	public String getToyId(){
		return id;
	}

}
//Java c name
// Java Name
