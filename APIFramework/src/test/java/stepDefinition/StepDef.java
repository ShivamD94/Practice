package stepDefinition;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.ResAddPlace;
import resources.APIEndpoints;
import resources.AddPlace_TestData;
import resources.Utils;

public class StepDef extends Utils {

	RequestSpecification request;	
	ResponseSpecification responsespec;
	Response response;
	AddPlace_TestData data=new AddPlace_TestData();
	@Given("Add Place Payload with {string} {string} {string}")
	public void add_Place_Payload_with(String name, String language, String address) throws IOException {
	   
		  request=given().spec(requestSpec())
		 .body(data.addPlacePayload(name, language, address));
		 
	}

	@When("User calls {string} with {string} http request")
	public void user_calls_with_http_request(String endPointName, String reqType) {
		responsespec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build(); 

		switch(reqType){
			case "Post":
				response=request.when().post(APIEndpoints.valueOf(endPointName).getResource());
				         
				break;
				
			case "Get":
				response=request.when().get(APIEndpoints.valueOf(endPointName).getResource());
				        
				break;
			case "Delete":
				response=request.when().delete(APIEndpoints.valueOf(endPointName).getResource());
				         
				break;
				
		}
		
		/*
		 * response =request.when().post("/maps/api/place/add/json").
		 * then().spec(responsespec).extract().response();
		 */

	}

	@Then("APi call is success with status code {int}")
	public void api_call_is_success_with_status_code(Integer int1) {
	    assertEquals(response.getStatusCode(), 200);
	  
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String string2) {
	 //8 ResAddPlace rsp1=response.as(ResAddPlace.class);
		String rsp=response.asString();
		JsonPath js=new JsonPath(rsp);
	   String val=js.get(key);
	   assertEquals(val, string2);
	}

	@Then("put {string} in Map")
	public void put_in_Map(String key) throws IOException {
		String rsp=response.asString();
		
		JsonPath js=new JsonPath(rsp);
	   String val=js.get(key);
	   setJsonValues(key, val);
	   System.out.println("ssjs".toUpperCase());
	}
	
	@Given("GetPlace Payload with {string}")
	public void getplace_Payload_with(String key) throws IOException {
		System.out.println(key);
		 request=given().spec(requestSpec()).queryParam(key, getJsonValues(key));
				
	}

}
