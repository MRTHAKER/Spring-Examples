package mst;

public class Employee {
String EmployeeName;
int EmployeeID;
Employee (String EmployeeName,int EmployeeID){
this.EmployeeName=EmployeeName;
this.EmployeeID=EmployeeID;
}
public String getEmployeeName (){
return EmployeeName;
}
public int getEmployeeID(){
return EmployeeID;
}
public String display() {
	return "Name is:"+EmployeeName+" ID is:"+EmployeeID;
}

}