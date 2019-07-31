package test5;

import java.util.jar.Attributes.Name;

import test7.*;

public class App extends TestApp {
	public static void main(String[] args) {
		TestInterface testInterface = new TestInterface() {
			public void square(int a) {
				System.out.println(a * a);
			}
		};
		testInterface.square(9);
		testInterface.show();
		App app = new App();
		app.name = "123";
	}
	public void show() {
		name = "1234";
	}
}

interface TestInterface {
	public void square(int a);
	default void show() {
		System.out.println("Default Method Executed");
		TestApp testApp = new TestApp();
	}
}



