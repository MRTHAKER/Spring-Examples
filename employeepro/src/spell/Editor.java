package spell;

public class Editor {
private Checker check;
Editor(Checker check) {
	System.out.println("Inside Editor const");
	this.check=check;
}
public void SpellCheck() {
	check.SpellCheck();
}
}
