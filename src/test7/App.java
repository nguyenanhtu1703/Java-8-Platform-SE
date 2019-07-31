package test7;

class Person {
	protected String name = "John";
	public void ShowName() {
		System.out.println(name);
	}
}

public class App {
	protected String name = "John";
	public static void main(String[] args) {
		TestApp testApp = new TestApp();
		System.out.println(testApp.name);
	}
}


