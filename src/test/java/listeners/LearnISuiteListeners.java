package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class LearnISuiteListeners implements ISuiteListener {

	public void onStart(ISuite suite) {
		System.out.println("Suite STarted:"+suite.getName());
	}

	public void onFinish(ISuite suite) {
		System.out.println("Suite Finished:"+suite.getName());
	}

	
	
	
}
