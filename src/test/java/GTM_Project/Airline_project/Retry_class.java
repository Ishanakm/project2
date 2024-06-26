package GTM_Project.Airline_project;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_class implements IRetryAnalyzer
{
	int initial_count=0;
	int total_count=1;
	@Override
	public boolean retry(ITestResult result)
	{
		if(initial_count<total_count)
		{
			initial_count++;
		return true;
		}
		return false;
	}

}
