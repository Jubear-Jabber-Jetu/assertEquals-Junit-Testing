package one;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class one {
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(testcase.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println("Result=="+result.wasSuccessful());
	   }
	} 