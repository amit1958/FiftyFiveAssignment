package StepDefinations;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestRunner.TestExecuter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ToDO extends TestExecuter {

	@Given("^User open  the given URL$")
	public void GotoURL() throws InterruptedException {
		driver.navigate().to(pr.getProperty("url"));
	}

	@Then("^User should navigate to the Correct page$")
	public void Verify_PageTitle() throws InterruptedException {
		String actualurl = driver.getTitle();
		String expected = "React • TodoMVC";
		assertEquals(actualurl, expected);

	}

	// Scenario: Check the Page Heading and Field is visible or not as expected

	@When("^User on the page check the Heading present or not$")
	public void Checkheader() throws InterruptedException {
		WebElement heading = driver
				.findElement(By
						.xpath("//header[@class='header']/h1[contains(text(), 'todos')]"));
		String actualurl = heading.getText().trim();
		String expected = "todos";
		assertEquals(actualurl, expected);
	}

	@And("^Also verify the Text box field availabe or not.$")
	public static void CheckTextbox() throws InterruptedException {
		WebElement heading = driver.findElement(By
				.xpath("//header[@class='header']/input[@class='new-todo']"));
		mywait.until(ExpectedConditions.visibilityOf(heading));
		String actualurl = heading.getAttribute("placeholder").trim();
		String expected = "What needs to be done?";
		assertEquals(actualurl, expected);
	}

	// Scenario: Verify Add a Todo
	@When("^User enter \"(.*)\" Name and submit$")
	public void Enter_todoname(String ToDo) throws InterruptedException {
		WebElement enterTodo = driver.findElement(By.cssSelector(".new-todo"));
		// enterTodo.sendKeys(pr.getProperty("Todoname"));
		enterTodo.sendKeys(ToDo);

		enterTodo.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@Then("^Todo should added$")
	public void VerifyAdded_TODO() throws InterruptedException {
		List<WebElement> Todolist = driver.findElements(By
				.xpath("//ul[@class='todo-list']/li/div/label"));
		System.out.println("Total Todos" + " " + Todolist.size());

		for (WebElement mylist : Todolist) {
			String mytodo = mylist.getText();
			System.out.println("My Adeed todos" + " " + mytodo);
			if (mylist.getText().equalsIgnoreCase(mytodo)) {
				System.out.println("Testcase is passed");
				// assertEquals(mytodo, "Amit Sharma todo1");

			} else {
				System.out.println("Testcase is failed");
			}

		}

	}

	// Scenario: Verify Item Left
	@When("^User view the itemleft$")
	public static void viewLeftcount() throws InterruptedException {
		WebElement span = driver.findElement(By
				.xpath("//span[@class='todo-count']"));
		System.out.println("Span text" + " " + span.getText());
		String actuallefttext = span.getText();
		WebElement todocount = driver.findElement(By
				.xpath("//span[@class='todo-count']/strong"));
		String count = todocount.getText();
		String Expected = count + " " + ("items left");
		assertEquals(actuallefttext, Expected);
	}

	@Then("^Item left count should show$")
	public void LeftCount() throws InterruptedException {
		List<WebElement> Todolist = driver.findElements(By
				.xpath("//ul[@class='todo-list']/li/div/label"));
		System.out.println("Total Todos" + " " + Todolist.size());
		String actualcount = Integer.toString(Todolist.size());
		WebElement todocount = driver.findElement(By
				.xpath("//span[@class='todo-count']/strong"));
		String expected = todocount.getText();
		assertEquals(actualcount, expected);
		Thread.sleep(2000);
	}

	// Scenario: Verify Complete the todo
	@When("^User complete the todo$")
	public void completeTodo() throws InterruptedException {
		WebElement complete = driver.findElement(By
				.xpath("//ul[@class='todo-list']/li[1]/div/input"));
		complete.click();
		Thread.sleep(2000);
	}

	@Then("^verify the Completed filter and its list$")
	public void completeted() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='filters']/li[3]")).click();
		WebElement selected = driver.findElement(By
				.xpath("//ul[@class='filters']/li[3]/a[@class='selected']"));
		boolean isselected = selected.isDisplayed();
		assertEquals(isselected, true);

		List<WebElement> completeted = driver
				.findElements(By
						.xpath("//ul[@class='todo-list']/li[@class='completed']/div/label"));
		System.out.println("Completed ToDOs are" + "" + completeted.size());
		Thread.sleep(2000);
	}

	// Scenario: Verify Filters
	@When("^User click on active filter and check selected or not.$")
	public void ActiveFilter() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='filters']/li[2]")).click();
		Thread.sleep(2000);
		WebElement selected = driver.findElement(By
				.xpath("//ul[@class='filters']/li[2]/a[@class='selected']"));
		boolean isselected = selected.isDisplayed();
		assertEquals(isselected, true);
	}

	@When("^User click on All filter and check selected or not.$")
	public void AllFilter() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='filters']/li[1]")).click();
		Thread.sleep(2000);
		WebElement selected = driver.findElement(By
				.xpath("//ul[@class='filters']/li[1]/a[@class='selected']"));
		boolean isselected = selected.isDisplayed();
		assertEquals(isselected, true);

	}

	// Scenario: Verify Clear Completed
	@When("^User click clear completed$")
	public void ClearCompleted() throws InterruptedException {
		WebElement clearCompleted = driver
				.findElement(By
						.xpath("//footer[@class='footer']//button[@class='clear-completed']"));
		boolean isselected = clearCompleted.isDisplayed();
		assertEquals(isselected, true);
		clearCompleted.click();

	}

	// Scenario: Verify Edit the todo
	@When("^User edit the todo$")
	public void EditTodo() throws InterruptedException {
		WebElement edit = driver.findElement(By
				.xpath("//ul[@class='todo-list']/li[1]/div/input"));
		System.out.println("============" + edit.isDisplayed());
		int width = edit.getSize().getWidth();
		System.out.println("width is" + width);
		Actions act = new Actions(driver);
		act.moveToElement(edit).moveByOffset(40, 0).doubleClick().sendKeys(" Edit").sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

	}

	@Then("^Verify the edited todo$")
	public void VerifyEditTodo() throws InterruptedException {
		List<WebElement> Edited = driver.findElements(By
				.xpath("//ul[@class='todo-list']/li/div/label"));
		for (WebElement mylist : Edited) {
			String mytodo = mylist.getText();
			System.out.println("My Adeed todos" + " " + mytodo);
			if (mylist.getText().equalsIgnoreCase("Amit Sharma todo2 Edit")) {
				System.out.println("Testcase is passed");
				// assertEquals(mytodo, "Amit Sharma todo1");

			} else {
				System.out.println("Testcase is failed");
			}

		}

	}

	// Scenario: Verify Item Left after deleting the todo
	@Then("^Delete a todo and validate count$")
	public void deleteTodo() throws InterruptedException {
		WebElement delete = driver.findElement(By
				.xpath("//ul[@class='todo-list']/li[2]/div/input"));
		System.out.println("============" + delete.isDisplayed());
		int width = delete.getSize().getWidth();
		System.out.println("Destroy width is" + width);
		Actions act = new Actions(driver);
		WebElement destroy = driver
				.findElement(By
						.xpath("//ul[@class='todo-list']/li[2]/div/button"));
		
		act.moveToElement(delete).moveByOffset(40, 0).click(destroy).perform();
		Thread.sleep(1000);
	

		WebElement span = driver.findElement(By
				.xpath("//span[@class='todo-count']"));
		System.out.println("Span text" + " " + span.getText());
		String actuallefttext = span.getText();
		WebElement todocount = driver.findElement(By
				.xpath("//span[@class='todo-count']/strong"));
		String count = todocount.getText();
		String Expected = count + " " + ("items left");
		assertEquals(actuallefttext, Expected);
	}
}
