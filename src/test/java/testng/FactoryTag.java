package testng;

import org.testng.annotations.Factory;

public class FactoryTag {

	@Factory
	public Object[] getTestClasses() {
		Object[] tests = new Object[2];
		tests[0] = new BasicTags();
		tests[1] = new Invocation();

		return tests;
	}

}
