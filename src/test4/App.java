package test4;

public class App {
	public static void main(String[] args) {
		E m = new E(1);
		m.EOk();
	}
}

class M {
	String name;
	int age;
	M(){
		//this("Beginninersbook.com");
		System.out.println("M()");
	}
	M(String s) {
		this(s, 6);
	}
	M(String s, int age){
		this.name = s;
		this.age = age;
		Ok();
	}
	public void Ok() {
		System.out.println(name + " , " + age);
	}
}

class E extends M {
	E() {
		System.out.println("E()");
	}
	E(int z){
		super("1");
	}
	public void EOk() {
		System.out.println("E.Ok()");
	}
}
