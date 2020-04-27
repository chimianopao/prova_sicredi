package Controller;

public class BaseTest{
	BaseDriver baseDriver;
	
	public void startTest() {
		baseDriver = new BaseDriver();
		baseDriver.startDriver();
	}
	
	public void endTest() {
		baseDriver.stopDriver();
	}
}
