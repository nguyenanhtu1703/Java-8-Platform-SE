package test7;

public class TestApp {
	protected String name = "pro";
	String name2 = "pro2";
	public void ShowAge() {
		Person person = new Person();
		person.name = "pro";
		System.out.println(name);
		TestExtends testExtends = new TestExtends();
		testExtends.name = "123";
	}
}

