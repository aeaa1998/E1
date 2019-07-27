
class Owner{
	String name;
	public Dog myDog;
	
	public Owner(String _name, String _toyId, int _chooseLimit){
		name = _name;
		myDog = new Dog(_chooseLimit, _name, _toyId);
	}

	public String getName(){
		return name;
	}
}
//Java c name
// Java Name
