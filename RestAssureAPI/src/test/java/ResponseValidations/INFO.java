package ResponseValidations;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class INFO 
{
/*Every request in rest assured library is represented by the interface called request specification 
 *these interface allows to modify the request like adding headers or adding authentication details  */
  //every request contains the body header,body ,response 
	@Test
	public void gettingsingleuser()
	{
		//Response contains the body and headers and headers are  always in the key-value pairs body in the language like HTMLor JSON or XML
		/*and the header contain the multiple values 
		 *)Report-to
		 *)NEl
		 *)Vary
		 *)Server
		 *)CF-ray
		 *) content- encoding /these are all keys and there also values are also there /
		 */
		//and the response  conatain the response code contains the status code and error status code 
		RestAssured.baseURI="https://reqres.in/api/users/2";
		//Getting request specification 
		RequestSpecification res=RestAssured.given();
		//RequestSpecification:-  
		/*RequestSpecification it is part of the java rest api testing library and i t using to make and send the http request and validate the response 
		 * it provide various methods to make request with different parameters they are headers,query parameters and body and cookies authentication etc.. 
		 * */
		Response r=res.get();
		
		int code=r.getStatusCode();
		Assert.assertEquals(code, 200);
		/*
		 n RestAssured, RequestSpecification, Response, and RestAssured are key components that help in making HTTP requests, handling responses, and configuring the test environment. Let's look at each of them and their methods:

RequestSpecification:

Description:
RequestSpecification is used for building and sending HTTP requests. It is the starting point for any RestAssured test.
Methods and Usage:
given(): Initiates a request specification.
request(Method method): Specifies the HTTP method (GET, POST, PUT, DELETE, etc.).
header(String name, Object value): Adds headers to the request.
headers(Map<String, ?> headers): Adds multiple headers using a Map.
param(String name, Object value): Adds query parameters.
queryParams(Map<String, ?> parameters): Adds multiple query parameters using a Map.
body(Object body): Sets the request body.
auth().basic(username, password): Adds basic authentication.
auth().oauth2(oauth2Token): Adds OAuth2 token authentication.
Example:
java
Copy code
given().header("Content-Type", "application/json")
       .param("key1", "value1")
       .body("{ \"name\": \"John\" }")
Response:

Description:
Response is the representation of the HTTP response received after making a request. It allows extracting and validating response details.
Methods and Usage:
asString(): Retrieves the response body as a String.
asByteArray(): Retrieves the response body as a byte array.
statusCode(): Retrieves the HTTP status code.
statusLine(): Retrieves the status line of the response.
jsonPath(): Allows parsing and querying the response using JSONPath.
header(String name): Retrieves the value of a specific header.
Example:
java
Copy code
Response response = get("/api/user/123");
String responseBody = response.asString();
int statusCode = response.statusCode();
RestAssured:

Description:
RestAssured is the main entry point that provides configuration options and global settings for RestAssured tests.
Methods and Usage:
baseURI(String uri): Sets the base URI for all requests.
basePath(String path): Sets the base path for all requests.
port(int port): Sets the port for all requests.
authentication(): Provides methods for authentication configuration.
filters(Filter filter, Filter... additionalFilters): Adds filters to the request/response pipeline.
enableLoggingOfRequestAndResponseIfValidationFails(): Enables logging if validation fails.
Example:
java
Copy code
RestAssured.baseURI = "https://api.example.com";
RestAssured.port = 8080;
RestAssured.authentication = basic("username", "password");
When to Use:

Use RequestSpecification when building and customizing HTTP requests.
Use Response when handling and validating the HTTP response.
Use RestAssured for global configurations and settings that apply to all requests in a test suite.

		 * */
		
		
	}
}
