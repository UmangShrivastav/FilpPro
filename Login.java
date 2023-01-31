package utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{
	@Given("^user provide browser name as \"([^\"]*)\" and exe location as \"([^\"]*)\"$")
	public void bLaunch(String name, String location)
	{
		Object[] input=new Object[2];
		input[0]=name;
		input[1]=location;
		SeleniumOperations.browserLaunch(input);
	}


@Given("^user entered url as \"([^\"]*)\"$")
public void openApp(String url)
{
	Object[] input1=new Object[1];
	 input1[0]=url;
	 SeleniumOperations.openApplication(input1);
}

@Given("^user cancle initial Login window$")
public void openApp()
{
	 Object[] input2=new Object[1];
	 input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	 SeleniumOperations.clickOnElement(input2);
}
@When("^user navigate on Login tab$")
public void clickOn1()
{
	 Object[] input3=new Object[1];
	 input3[0]="//*[@class='_1_3w1N']";
	 SeleniumOperations.mouseOverAction(input3); 
}
@When("^user click on MyProfile$")
public void myPof()
{
	Object[] input4=new Object[1];
	 input4[0]="(//*[@class='_3vhnxf'])[1]";
	 SeleniumOperations.clickOnElement(input4); 
}
@When("^user enter \"([^\"]*)\" as username$") 
public void sendText(String id) throws InterruptedException
{
	 Thread.sleep(2000);
	 Object[] input5=new Object[2];
	 input5[0]="//*[@class='_2IX_2- VJZDxU']";
	 input5[1]=id;
	 SeleniumOperations.sendText(input5); 
	
	
}
@When("^user enter \"([^\"]*)\" as password$")
public void app(String pass)
{
	 Object[] input6=new Object[2];
	 input6[0]="//*[@type='password']";
	 input6[1]=pass;
	 SeleniumOperations.sendText(input6); 
}
@When("^user click on Login button$")
public void click()
{
	 Object[] input7=new Object[1];
	 input7[0]="(//*[@type='submit'])[2]";
	 SeleniumOperations.clickOnElement(input7); 

}






}
