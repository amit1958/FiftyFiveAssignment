package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import static org.hamcrest.Matchers.*;
public class GetToDo {

	RequestSpecification request;
	Response response;

	@Given("^User sets the API request (.*)$")
	public void user_sets_the_api_request(String url) {
		RestAssured.baseURI = url;
		request = given().header("content-type", "Application/json");
	}

	@When("^User sends the api Request to get a todos$")
	public void user_sends_the_api_request_to_get_all_todos() {
		String path = "/todos/1";
		response = request.get(path).then().log().all().extract().response();
		System.out.println("Response is " + " "+ response.asString());
	}

	@Then("^A todo should come in response with status (.*)$")
	public void Validte_Repsone(int code) {
		assertEquals(response.getStatusCode(), code);
		
	 
	}

}
