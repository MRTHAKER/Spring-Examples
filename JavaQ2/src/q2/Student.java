package q2;

import java.util.ArrayList;

public class Student {
public ArrayList<String> name;
public ArrayList<Integer> marks;
public ArrayList<Integer> id;

public String getName() {
	return this.name.get(0);
}
public void setName(String name) {
	this.name.add(name);
}
public Student() {
	super();
	this.name=new ArrayList<String>();
	this.marks = new ArrayList<Integer>();
	this.id = new ArrayList<Integer>();
}
public Student(String name,int marks,int id) {
	super();
	this.name=new ArrayList<String>();
	this.marks = new ArrayList<Integer>();
	this.id = new ArrayList<Integer>();
	this.name.add(name);
	this.id.add(id);
	this.marks.add(marks);
}
public int getMarks() {
	return marks.get(0);
}
public void setMarks(int marks) {
	this.marks.add(marks); 
}
public int getId() {
	return id.get(0);
}
public void setId(int id) {
	this.id.add(id);
}
}
