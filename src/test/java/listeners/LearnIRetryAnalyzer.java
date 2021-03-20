package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class LearnIRetryAnalyzer implements IRetryAnalyzer {

	private int retryCnt = 0;
	private int maxRetryCount = 3;

	public boolean retry(ITestResult result) {

		if (retryCnt <= maxRetryCount) {
			System.out.println("Retrying " + result.getName() + " again and count is " + (retryCnt + 1));
			retryCnt++;
			return true;
		} else
			return false;
	}

}
