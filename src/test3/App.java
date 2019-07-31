package test3;

public class App {
	public static void main(String[] args) {
		B a = new B(1);
		C c = new C() {
		};
	}
}

abstract class A {
	public int a;
	public A(int z) {
		System.out.println("Abstract class A constructor 2");
	}
}

class B extends A {
	public B(int z) {
		super(z);
	}
}

interface C {
	static int a = 1;
	public int aa = 5;
}

class D implements C {
}

