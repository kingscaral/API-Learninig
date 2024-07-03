package ResponseValidations;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class checkForValidReposnse 
{
	@Test
	public void gettingSingleUser()
	{
		RestAssured.baseURI="https://reqres.in/api/users/2";
		//here we are validating response and then status line and the status code
		//here the RequestSpecification is a interface it is a class to make httprequest  with customization also 
		RequestSpecification requestSpecification=RestAssured.given();
		//response is the class to store every response from the server side 
		Response response=requestSpecification.get();
		String contentType=response.getContentType();
		int statusCode=response.getStatusCode();
		String statusLine=response.getStatusLine();
		Assert.assertEquals(200,statusCode);
		Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
		//HTTP/1.1 = Protocol , //200=status code , //OK=request was successful.
		
							
			
			
			
			
			
			
			
			
		
		
		
	  }

}
