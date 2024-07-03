package RestAssure;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class HTTPS_POST_Request
{
	@Test
	public void post()
	{
		RestAssured.baseURI="https://reqres.in/api/users";
		JSONObject postjson=new JSONObject();
		postjson.put("name", "Rams");
		postjson.put("job", "QA Test Engineer");
		RestAssured.given()
		.header("Content-type","application/json")
		.contentType(ContentType.JSON)
		.body(postjson.toJSONString())
		.when().post().then().statusCode(201).log().all();
		//here log().all() it record every thing like below
		/*
		 P/1.1 201 Created
Date: Wed, 21 Feb 2024 13:41:04 GMT
Content-Type: application/json; charset=utf-8
Content-Length: 90
Connection: keep-alive
Report-To: {"group":"heroku-nel","max_age":3600,"endpoints":[{"url":"https://nel.heroku.com/reports?ts=1708522864&sid=c4c9725f-1ab0-44d8-820f-430df2718e11&s=kXuL3hLa%2F5n3LbkVhssyK%2BAhJd3YNpoBFG2pJO7C3xw%3D"}]}
Reporting-Endpoints: heroku-nel=https://nel.heroku.com/reports?ts=1708522864&sid=c4c9725f-1ab0-44d8-820f-430df2718e11&s=kXuL3hLa%2F5n3LbkVhssyK%2BAhJd3YNpoBFG2pJO7C3xw%3D
Nel: {"report_to":"heroku-nel","max_age":3600,"success_fraction":0.005,"failure_fraction":0.05,"response_headers":["Via"]}
X-Powered-By: Express
Access-Control-Allow-Origin: *
Etag: W/"5a-UAtrD9ZjKiFC3KO/hb16/1sv5Do"
Via: 1.1 vegur
CF-Cache-Status: DYNAMIC
Server: cloudflare
CF-RAY: 858f679a7b541792-MAA

{
    "name": "Rams",
    "job": "QA Test Engineer",
    "id": "137",
    "createdAt": "2024-02-21T13:41:04.022Z"
}
		 */
		
		
		
	}

}
//based on this id=137 value we have to to POST or PUT Actions
