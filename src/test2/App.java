package test2;

public class App {
	static {
		System.out.println("Loaded App Class");
		e = f = 1;
	}
	final Data b;
	public Data c;
	static int e, f;
	int z;
	App(){
		b = new Data("final");
		c = b;
	}
	public static void main(String[] args) {
		App app = new App();
		app.c.data = "1";
		System.out.println(app.c.data);
	}
}

class A {
	public final int b;
	public A() {
		b = 1;
	}
	public A(int z) {
		b = 1;
	}
	public final void E() {
	}
	public void Z() {
	}
}

final class C {
	public C() {
	}
}

class D extends A {
	public void Z() {
	}
}

class Data {
	public String data;
	Data(String s) {
		data = s;
	}
}