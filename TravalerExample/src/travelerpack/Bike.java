package travelerpack;

public class Bike {
	public Bike(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}
	String name;
	int speed;
	public String getName() {
		return name;
	}
	public int getSpeed() {
		return speed;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name of Bike is: "+getName()+" and Speed is: "+getSpeed();
	}

}
