package RestAssure;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class HTTPS_GET_Request 
{
	@Test
	public void test1()
	{
		/*1xx Informational
		100 Continue: The server has received the request headers and the client should proceed with the request.
		101 Switching Protocols: The requester has asked the server to switch protocols.
		
		2xx Success
		200 OK: The request was successful.
		201 Created: The request was successful, and a resource was created.
		204 No Content: The request was successful, but there is no additional information to send back.
		206 Partial Content: The server is delivering only part of the resource due to a range header sent by the client.
		207 Multi-Status (WebDAV): The message body contains a XML message and can contain a number of separate response codes.
		
		3xx Redirection
		301 Moved Permanently: The requested page has been permanently moved to another location.
		302 Found (Temporary Redirect): The requested page has been temporarily moved to another location.
		304 Not Modified: Indicates that the resource has not been modified since the version specified by the request headers.
		307 Temporary Redirect: Similar to 302, but it is intended to prevent the HTTP method changing when the redirect is followed.
		308 Permanent Redirect: Permanent redirect, like 301.
		
		4xx Client Errors
		400 Bad Request: The server could not understand the request.
		401 Unauthorized: The request requires user authentication.
		403 Forbidden: The server understood the request, but it refuses to authorize it.
		404 Not Found: The requested resource could not be found on the server.
		405 Method Not Allowed: The request method is not supported for the requested resource.
		429 Too Many Requests: The user has sent too many requests in a given amount of time.
		
		5xx Server Errors
		500 Internal Server Error: A generic error message returned when the server encounters an unexpected condition.
		502 Bad Gateway: The server, while acting as a gateway or proxy, received an invalid response from an inbound server.
		503 Service Unavailable: The server is not ready to handle the request.
		504 Gateway Timeout: The server, while acting as a gateway or proxy, did not receive a timely response from an upstream server.
		These status codes are part of the HTTP/1.1 standard and are used to indicate the result of a client's request. The first digit of the status code defines the class of response, and the last two digits do not have any categorization role.
		n the context of a URL, a query parameter is a set of key-value pairs attached to the end of a URL, usually after a question mark (?). Query parameters are used to send additional information to a web server along with the request. Each parameter is separated by an ampersand (&), and the key and value are separated by an equals sign (=).

Here's an example URL with query parameters:

bash
Copy code
https://example.com/search?q=query&sort=asc&page=2
In this URL:

https://example.com/search is the base URL.
? indicates the start of the query parameters.
q=query, sort=asc, and page=2 are individual query parameters.
In this example:

q, sort, and page are keys.
query, asc, and 2 are values associated with the respective keys.

		*/
		Response res= RestAssured.get("https://reqres.in/api/users/2");
		//this get() method return the response  in JSON format and we have to use to Response interface  to store  this 
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());//it return the status code 
		System.out.println("Header :-"+res.getHeader("Content-Type"));
		System.out.println("TIme :-"+res.getTime());
		System.out.println("Body :-"+res.getBody().asString());
		int s=4;
		
		
	}
		//writing in BDD Format
		@Test
		public void bdd()
		{
			System.out.println("with BDD");
			//given -> When -> then 
			RestAssured.baseURI="https://reqres.in/api/users";
			RestAssured.given().queryParam("age", 2).when().get().then().statusCode(200);
			
		}

		

		
		
	}
	

