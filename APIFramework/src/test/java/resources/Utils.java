package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utils {
	public static RequestSpecification req;
	public static ResponseSpecification responsespec;
	public static Response response;
	public RequestSpecification requestSpec() throws IOException
	{
	  if(req==null)
	  {
		PrintStream log=new PrintStream(new File("logging.txt"));
		req =new RequestSpecBuilder().setBaseUri(getGlobalValues("baseURI")).addQueryParam("key", "qaclick123")
				.addFilter(RequestLoggingFilter.logRequestTo(log))  //to add logs of request body
				.addFilter(ResponseLoggingFilter.logResponseTo(log)) //to add logs of response body
			    .setContentType(ContentType.JSON).build();
		return req;
	  }
	    return req;
	}
	
	public static String getGlobalValues(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\practice\\APIFramework\\src\\test\\java\\resources\\GlobalValues.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	public static void setJsonValues(String key , String value) throws IOException
	{
		Properties proper=new Properties();
		FileOutputStream fos=new FileOutputStream("D:\\practice\\APIFramework\\src\\test\\java\\resources\\JsonVals.properties",true);
		
	    proper.put(key, value);
	  
	    proper.store(fos, "Json Property file");
	}
	
	
	public static String getJsonValues(String key ) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\practice\\APIFramework\\src\\test\\java\\resources\\JsonVals.properties");
		prop.load(fis);
		System.out.println(prop.getProperty(key)+"-----------");
	   return prop.getProperty(key);
	}
	
	}


