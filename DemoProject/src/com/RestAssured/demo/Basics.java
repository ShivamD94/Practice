package com.RestAssured.demo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import payload.AddPlace;
import payload.UpdatePlace;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     RestAssured.baseURI="https://rahulshettyacademy.com";
    String response= given().log().all().queryParams("key", "qaclick123")
     .body(AddPlace.PlacePayload()).when().post("maps/api/place/add/json")
     .then().assertThat().statusCode(200)
     .body("scope", equalTo("APP")).header("Server", equalTo("Apache/2.4.18 (Ubuntu)"))
     .extract().response().asString();
     //Add a place->Update the address of the place->retrieve the address to validate the updates
    System.out.println("================response"+response);
    JsonPath js=new JsonPath(response); //for parsing string to json format
    String placeId=js.getString("place_id");
    //Update address
              given().log().all().queryParams("key", "qaclick123")
    	     .body(UpdatePlace.updateAdd(placeId)).when().put("maps/api/place/update/json")
    	     .then().log().all().assertThat().statusCode(200).assertThat().body("msg", equalTo("Address successfully updated"));
    //Get update address
              given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
              .when().get("maps/api/place/get/json")
              .then().log().all().assertThat().statusCode(200);
              

	}

}
