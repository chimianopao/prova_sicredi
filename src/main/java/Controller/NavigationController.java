package Controller;

import org.openqa.selenium.Keys;
import Mappings.AddCustomerPage;
import Mappings.CustomersPage;

public class NavigationController extends BaseDriver {
	
	CustomersPage customer;
	AddCustomerPage addCustomer;
	
	public NavigationController() {
		customer = new CustomersPage();
		addCustomer = new AddCustomerPage();
	}
	public void changeVersion() {
		customer.getSwitchVersionMenu().click();
		customer.getSwitchVersionMenu().sendKeys("Bootstrap V4 Theme" + Keys.ENTER);
	}
	
	public void addCustomerFlow() throws InterruptedException {
		changeVersion();
		waitForLoad();
		customer.getAddCustomerButton().click();
		addCustomer.name().sendKeys("Teste Sicredi");
		addCustomer.lastName().sendKeys("Teste");
		addCustomer.contactFirstName().sendKeys("seu nome");
		addCustomer.phone().sendKeys("51 9999-9999");
		addCustomer.addressLine1().sendKeys("Av Assis Brasil, 3970");
		addCustomer.addressLine2().sendKeys("Torre D");
		addCustomer.city().sendKeys("Porto Alegre");
		addCustomer.state().sendKeys("RS");
		addCustomer.postalCode().sendKeys("91000-000");
		addCustomer.country().sendKeys("Brasil");
		addCustomer.fromEmployeer("Fixter");
		addCustomer.creditLimit().sendKeys("2000");
		addCustomer.saveButton().click();
		waitForLoad();
		assert(addCustomer.alertMessage().getText().toString().contains("Your data has been successfully stored into the database.")) : "Failed to Add Customer.";
	}
	
	public void deleteCustomerFlow() throws InterruptedException {
		addCustomer.goBackToListButton().click();
		customer.searchNameInput().sendKeys("Teste Sicredi");
		waitForLoad();
		customer.selectAllCheckbox().click();
		customer.deleteSelectedButton().click();
		assert(customer.confirmationMessage().getText().contains("Are you sure that you want to delete this 1 item?")) : "Confirmation message incorrect.";
		customer.confirmationDeleteButton().click();
		waitForLoad();
		assert(customer.confirmationResultMessage().getText().contains("Your data has been successfully deleted from the database.")) : "Error when trying to delete customer.";
	}

}
