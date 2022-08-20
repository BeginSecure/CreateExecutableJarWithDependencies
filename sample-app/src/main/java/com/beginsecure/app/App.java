package com.beginsecure.app;

import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	String sampleJson = "{ \"id\" : 1, \"name\" : \"Mary\" }";

	JSONObject job = new JSONObject(sampleJson);

	System.out.println("name is " + job.getString("name"));
    }
}
