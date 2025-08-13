package _02_SmartPhone;

abstract public class Phone {

	private String owner;
	
	Phone(String owner){
		this.owner = owner;
	};
	
	abstract void hangUp();
	abstract void hangOut();
	
	String getOwner(){
		return owner;
	}
}
