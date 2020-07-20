package blfc;

public class Custom {
private String name;
public Custom() {System.out.println("custructor of bean");}
public void customInit() {
	System.out.println("Custom init");
}
public void customDestroy() {
	System.out.println("Custom Destroy");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
