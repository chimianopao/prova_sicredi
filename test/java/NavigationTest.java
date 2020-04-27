import org.junit.Test;
import Controller.BaseTest;
import Controller.NavigationController;

public class NavigationTest extends BaseTest {

	@Test
	public void Challenge1() throws InterruptedException {
		startTest();
		NavigationController controller = new NavigationController();
		
		controller.addCustomerFlow();
		
		endTest();
	}
	
	@Test
	public void Challenge2() throws InterruptedException {
		startTest();
		NavigationController controller = new NavigationController();
		
		controller.addCustomerFlow();
		controller.deleteCustomerFlow();
		
		endTest();
	}
}
