
package mst;
public class Employee {
	int id;
	String Name;
	Address add;
	Employee(int id,String Name,Address add){
		this.id=id;
		this.Name=Name;
		this.add=add;
	}
	public void printAll() {
		System.out.println("ID is: "+id+" Name is: "+Name);
		System.out.println("Address is: "+add.toString());
	}

}
