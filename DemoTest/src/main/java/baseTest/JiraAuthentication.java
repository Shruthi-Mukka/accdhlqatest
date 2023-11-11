package baseTest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.specification.RequestSpecification;

/*public class JiraAuthentication {

	static String url="https://jira.dhl.com";
	//static String projectId="26735";

	public void jiraAPIAuth() {
		
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type", "application/json");
		request.header("Authorization","Bearer NjI2NzcwOTQzNDA5OiNRs2sblpxntx0YYukh+VOBOIDv");
		String issueEndpoint="https://jira.dhl.com/rest/api/latest/issue/TCP-318";
		int code=request.get(issueEndpoint).getStatusCode();
		System.out.println(code);
		
		//String issueId=request.get(issueEndpoint).getBody().jsonPath().get("id").toString();
		//System.out.println(issueId); 
	}
	
	public static void main(String[] args) {
		JiraAuthentication ja=new JiraAuthentication();
		ja.jiraAPIAuth();
		
		/*
		 * RestAssured.baseURI=
		 * "https://mukkasunitha4433.atlassian.net/rest/api/3/users/";
		 * 
		 * given().header("Authorization",
		 * "bXVra2FzdW5pdGhhNDQzM0BnbWFpbC5jb206ZDdmYzk0MzctODgyNy00YzA4LWEwMTUtNzhkYzQ3ZmQzMDAw")
		 * .when().get("emailAddress").then().assertThat().statusCode(200).log().all();
		 */
	
	/* String url="https://mukkasunitha4433.atlassian.net/";
	RequestSpecification issueIdRequest=RestAssured.given();
	issueIdRequest.get(url);
	issueIdRequest.header("Content-Type", "application/json");
	
	issueIdRequest.header("Authorization","Basic c2hydXRoaS5tdWtrYUBhY2NlbnR1cmUuY29tOk5qSTJOemN3T1RRek5EQTVPaU5SczJzYmxweG50eDBZWXVraCtWT0JPSUR2");
	
	String issueEndpoint="rest/api/3/users/";
	//String s="https://mukkasunitha4433.atlassian.net/rest/api/3/project/10002";
	int code=issueIdRequest.get(issueEndpoint).getStatusCode();
	System.out.println(code);
	 */
	
//} 
//} 
