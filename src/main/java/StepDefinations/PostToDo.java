package StepDefinations;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class PostToDo {

	@Test
	public void GetToDos1() {
		JSONObject myjson = new JSONObject();
		myjson.put("title", "Automation");
		myjson.put("body", "Automationbody");
		myjson.put("userId", "1");
		given().header("content-type", "application/json")
				.body(myjson.toJSONString()).
				when().post("https://jsonplaceholder.typicode.com/post").then()
				.statusCode(202).
				log().all();
	}
}
