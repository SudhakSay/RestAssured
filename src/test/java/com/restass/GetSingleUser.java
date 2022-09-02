package com.restass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetSingleUser {
	public static void main(String[] args) {

		RequestSpecification reqSpec;

		reqSpec = RestAssured.given();

		reqSpec = reqSpec.header("content-type", "application/json");

		Response response = reqSpec.get("https://reqres.in/api/users/2");

		int statusCode = response.getStatusCode();

		String asString = response.asString();

		String prettyPrint = response.prettyPrint();

		System.out.println(statusCode + "\n" + asString + "\n" + prettyPrint);

	}
}
