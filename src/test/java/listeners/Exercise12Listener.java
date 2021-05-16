package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Exercise12Listener implements IRetryAnalyzer{

	private int retrycnt = 1;
	private int maxRetrycnt = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(retrycnt <= maxRetrycnt) {
			System.out.println("Retry");
			retrycnt++;
			return true;
		}
		
		return false;
	}

}
