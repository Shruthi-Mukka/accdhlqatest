package baseTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/*public class ExecutionStatusUpdate {

	static String url="https://jira.dhl.com/";
	static String projectId="26735";
	static String versionId="-1";
	static String issueKey="TCP-318";
	//static String issueId="1159622"; (232921-execution id), https://jira.dhl.com/rest/zapi/latest/traceability/executionsByTest?testIdOrKey=TCP-88
	static String cycleId="-1";
	public static void main(String[] args) throws JSONException {
		
		
		// fetch issueid from issuekey	
				
		RequestSpecification idReq=RestAssured.given();
		idReq.header("Content-Type", "application/json");	
		idReq.header("Authorization","Bearer NjI2NzcwOTQzNDA5OiNRs2sblpxntx0YYukh+VOBOIDv");
		String issueEndpoint="https://jira.dhl.com/rest/api/latest/issue/"+issueKey;
		int code=idReq.get(issueEndpoint).getStatusCode();
		System.out.println(code);
		String issueId=idReq.get(issueEndpoint).getBody().jsonPath().get("id").toString();
		System.out.println(issueId); 
		
				
		 //create execution id 
			
		RequestSpecification execIdRequest=RestAssured.given();
		execIdRequest.header("Content-Type", "application/json");	
		execIdRequest.header("Authorization","Bearer NjI2NzcwOTQzNDA5OiNRs2sblpxntx0YYukh+VOBOIDv");
		String execEndpoint="https://jira.dhl.com/rest/zapi/latest/execution"; 
		//233110 -created execution id
		HashMap<String,String> requestBody=new HashMap<String, String>(); 
		requestBody.put("issueId",issueId); 
		requestBody.put("cycleId", cycleId); 
		requestBody.put("versionId",versionId); 
		requestBody.put("projectId", projectId);
		//requestBody.put("cycleName", "QAAutoTestCycle01");
		
		execIdRequest.body(requestBody); 

		/*
		 * int statusCode=execIdRequest.post(execEndpoint).getStatusCode();
		 * System.out.println(statusCode);
		 */
		
		//String executionId=execIdRequest.post(execEndpoint).getBody().asString().split(":")[0].replace("\"","").replace("{",""); 
		//System.out.println(executionId); 
		/*
		 * String
		 * executionIdResBody=execIdRequest.post(execEndpoint).getBody().asString();
		 * System.out.println(executionIdResBody);
		 */
		
		
		
//update the status
		/*String execId="232921";
		 RequestSpecification updateRequest=RestAssured.given();
		 updateRequest.header("Content-Type", "application/json");
		 	
		 updateRequest.header("Authorization","Bearer NjI2NzcwOTQzNDA5OiNRs2sblpxntx0YYukh+VOBOIDv");
		 
		String updateEndpoint="https://jira.dhl.com/rest/zapi/latest/execution/"+execId+"/execute";
		 HashMap<String, String> updateRequestBody=new HashMap<String, String>();
		  updateRequestBody.put("status", "3"); //for WIP
		 
		  updateRequest.body(updateRequestBody);			
			 
		  int statuscode=updateRequest.put(updateEndpoint).getStatusCode();
			 System.out.println(statuscode);*/
			
		
		  
		
		//Create a test case
		//1. create issuetype id
	/*	String baseURL="https://jira.dhl.com";
		RequestSpecification rs=RestAssured.given();
		rs.header("content-type","application/json");
		rs.header("Authorization","Bearer NjI2NzcwOTQzNDA5OiNRs2sblpxntx0YYukh+VOBOIDv");
		String issuetypeurl=baseURL+"/rest/zapi/latest/util/zephyrTestIssueType";
		String res1=rs.get(issuetypeurl).getStatusLine();
		System.out.println(res1);
		
		String testcaseIssueTypeId= rs.get(issuetypeurl).getBody().jsonPath().get("testcaseIssueTypeId").toString();
				//.asString().split(":")[0].replace("\"","").replace("{","");
		System.out.println(testcaseIssueTypeId);*/
		
		//2.create testcase
	/*	RequestSpecification createReq=RestAssured.given();
		createReq.header("content-type","application/json");
		createReq.header("Authorization","Bearer NjI2NzcwOTQzNDA5OiNRs2sblpxntx0YYukh+VOBOIDv");
		String testcasecreateurl="https://jira.dhl.com/rest/api/2/issue";
		
		JSONObject jsonRequest = new JSONObject();
		JSONObject fieldsJSON = new JSONObject(); 
		JSONObject projectJSON = new JSONObject();
		JSONObject issueTypeJSON = new JSONObject();
		issueTypeJSON.put("id", "10203"); //give issuetypeid 
		fieldsJSON.put("issuetype",issueTypeJSON);
		projectJSON.put("id", "26735");
		fieldsJSON.put("project", projectJSON);
		fieldsJSON.put("summary", "02 testcase created through QA auto code");
		jsonRequest.put("fields", fieldsJSON);
		//fieldsJSON.put("description", "Creating an issue while setting custom field values");
		//fieldsJSON.put("customfield_11050", "Value that we're putting into a Free Text Field.");
		//fieldsJSON.put("severity", "Minor");
		
		//System.out.println(jsonRequest.toString());
		int sc=createReq.body(jsonRequest.toString()).post(testcasecreateurl).getStatusCode();
		System.out.println(sc);
			
	} 

}*/
