package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before(value = "@tag1", order = 0)
	public void beforeHook1() {
		System.out.println("Execute before tag1 ........1");
	}

	@Before(value = "@tag1", order = 1)
	public void beforeHook12() {
		System.out.println("Execute before tag1 ........2");
	}

	@Before(value = "@tag2,@tag3", order = 1)
	public void beforeHook2() {
		System.out.println("Execute before tag2 and tag3 ........1");
	}

	@Before(value = "@tag2,@tag3", order = 0)
	public void beforeHook22() {
		System.out.println("Execute before tag2 and tag3 ........2");
	}

	@After(value = "@tag1", order = 1)
	public void afterHook1() {
		System.out.println("Execute after tag1...1");
	}

	@After(value = "@tag1", order = 0)
	public void afterHook11() {
		System.out.println("Execute after tag1...2");
	}

	@After(value = "@tag2,@tag3", order = 0)
	public void afterHook2() {
		System.out.println("Execute after tag2 and tag3........1");
	}

	@After(value = "@tag2,@tag3", order = 1)
	public void afterHook22() {
		System.out.println("Execute after tag2 and tag3........2");
	}

}
