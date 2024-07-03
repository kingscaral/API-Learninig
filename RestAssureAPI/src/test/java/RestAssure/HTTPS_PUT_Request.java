package RestAssure;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class HTTPS_PUT_Request 
{
	@Test
	public void put()
	{
		/*
{
    "name": "Rams",
    "job": "QA Test Engineer",
    "id": "328",
    "createdAt": "2024-02-21T13:41:04.022Z"
}       */
	// Actually inthe POST class we have posted the above information now we have updating  this into the like  below 
	RestAssured.baseURI="https://reqres.in/api/users/328";//by using this id we are updating while posting the  id will generate defaultly 
	JSONObject j=new JSONObject();
	j.put("name", "Scaral");
	j.put("job", "Selenium Trainer");
	RestAssured.given().header("Content-type","application/json").contentType(ContentType.JSON).body(j.toJSONString()).when().put().then().statusCode(200).log().all();
		
	}
	//this below results are after updating i.e Put
	/*
	 HTTP/1.1 200 OK
Date: Wed, 21 Feb 2024 14:15:26 GMT
Content-Type: application/json; charset=utf-8
Transfer-Encoding: chunked
Connection: keep-alive
Report-To: {"group":"heroku-nel","max_age":3600,"endpoints":[{"url":"https://nel.heroku.com/reports?ts=1708524926&sid=c4c9725f-1ab0-44d8-820f-430df2718e11&s=%2FvPNng6sYZ2K3grw1fcPckyD587VfPtgOxXUEMNC1vk%3D"}]}
Reporting-Endpoints: heroku-nel=https://nel.heroku.com/reports?ts=1708524926&sid=c4c9725f-1ab0-44d8-820f-430df2718e11&s=%2FvPNng6sYZ2K3grw1fcPckyD587VfPtgOxXUEMNC1vk%3D
Nel: {"report_to":"heroku-nel","max_age":3600,"success_fraction":0.005,"failure_fraction":0.05,"response_headers":["Via"]}
X-Powered-By: Express
Access-Control-Allow-Origin: *
Etag: W/"51-MMc3AHenbqZkJglsr1w57Dcn2fI"
Via: 1.1 vegur
CF-Cache-Status: DYNAMIC
Vary: Accept-Encoding
Server: cloudflare
CF-RAY: 858f99f4a8b97efd-MAA
Content-Encoding: gzip

{
    "name": "Scaral",
    "job": "Selenium Trainer",
    "updatedAt": "2024-02-21T14:15:26.421Z"
}
	 */

}
