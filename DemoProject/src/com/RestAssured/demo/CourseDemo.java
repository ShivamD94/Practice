package com.RestAssured.demo;

import io.restassured.path.json.JsonPath;
import payload.CoursePayload;

public class CourseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonPath js = new JsonPath(CoursePayload.coursePay());
		int count=js.getInt("courses.size()");
		System.out.println(count);
		
		System.out.println(js.getInt("dashboard.purchaseAmount"));
		
		System.out.println("CourseName="+js.getString("courses[0].title")+"::"+"Prices="+js.getInt("courses[0].price"));
		
		System.out.println("CourseName="+js.getString("courses[1].title")+"::"+"Prices="+js.getInt("courses[1].price"));
		
		System.out.println("CourseName="+js.getString("courses[2].title")+"::"+"Prices="+js.getInt("courses[2].price"));
		
		//printing course title using loops :for dynamic arrays with changing data
		for(int i=0;i<count;i++)
		{
			System.out.println("Course Name="+js.getString("courses["+i+"].title"));
		}
	}

}
