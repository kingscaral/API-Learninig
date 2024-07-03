package RestAssure;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class HTTPS_DELETE_Request 
{
	@Test
	public void delete()
	{
		RestAssured.baseURI="https://reqres.in/api/users/137";
		RestAssured.given().when().delete().then().statusCode(204).log().all();
		
		
	}

}
