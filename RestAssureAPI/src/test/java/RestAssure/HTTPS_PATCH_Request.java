package RestAssure;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class HTTPS_PATCH_Request 
{
	@Test 
	public void patch()
	{
		//already in the putt class we have udated based id now here also we are doing the same thing 
		RestAssured.baseURI="https://reqres.in/api/users/328";
		JSONObject j=new JSONObject();
		j.put("name", "RamsScaral");
		j.put("job", "Manual Test Engineer");
		RestAssured.given().header("Content-type","application/json").contentType(ContentType.JSON).body(j.toJSONString()).when().patch().then().statusCode(200).log().all();
		
		
	}
	//then the results are udated to the 
	/*
	 HTTP/1.1 200 OK
Date: Wed, 21 Feb 2024 14:31:01 GMT
Content-Type: application/json; charset=utf-8
Transfer-Encoding: chunked
Connection: keep-alive
Report-To: {"group":"heroku-nel","max_age":3600,"endpoints":[{"url":"https://nel.heroku.com/reports?ts=1708525861&sid=c4c9725f-1ab0-44d8-820f-430df2718e11&s=TCliCB8OenInTi5lZ2b1W44QWBdXFbHvlT326JqssBg%3D"}]}
Reporting-Endpoints: heroku-nel=https://nel.heroku.com/reports?ts=1708525861&sid=c4c9725f-1ab0-44d8-820f-430df2718e11&s=TCliCB8OenInTi5lZ2b1W44QWBdXFbHvlT326JqssBg%3D
Nel: {"report_to":"heroku-nel","max_age":3600,"success_fraction":0.005,"failure_fraction":0.05,"response_headers":["Via"]}
X-Powered-By: Express
Access-Control-Allow-Origin: *
Etag: W/"59-6fgLFmoOSHOpfZihzYBNOIPwTSo"
Via: 1.1 vegur
CF-Cache-Status: DYNAMIC
Server: cloudflare
CF-RAY: 858fb0c67f2a7f1f-MAA
Content-Encoding: gzip

{
    "name": "RamsScaral",
    "job": "Manual Test Engineer",
    "updatedAt": "2024-02-21T14:31:01.130Z"
}
	 */

}
