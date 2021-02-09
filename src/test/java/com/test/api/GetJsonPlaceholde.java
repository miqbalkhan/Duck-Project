package com.test.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetJsonPlaceholde {

	
	@Test
	public void testResponsecode()
	{
	Response resp = RestAssured.get("https://jsonplaceholder.typicode.com/posts");

	int code=resp.getStatusCode();

	String responseBody=resp.asString();

	System.out.println("Response ::: "+responseBody);

	System.out.println("Status code ::: "+code);

	Assert.assertEquals(code, 200);
	}
	}
	
	
	
	
	
	
	
	
	
	

