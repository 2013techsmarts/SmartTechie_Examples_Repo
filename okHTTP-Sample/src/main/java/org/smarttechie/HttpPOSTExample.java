package org.smarttechie;

import java.io.IOException;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

/**
 * This class demonsrates the POST http method with OKHttp client.
 * @author Siva Janapati
 *
 */
public class HttpPOSTExample {

	public static void main(String[] args) throws IOException {
		
		//Create the media type which are going to post
		final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

		// Create http client
		OkHttpClient client = new OkHttpClient();
		
		//data to post
		String json = "{name:sample,age:90}";
		
		//Construct the request body
		RequestBody body = RequestBody.create(JSON, json);
		
		//Create the POST request
		Request request = new Request.Builder()
		.url("http://requestb.in/1f2wke71")
		.post(body)
		.build();
		
		//Send call to the server
		Response response = client.newCall(request).execute();
		
		if (response.isSuccessful()) {
			System.out.println("The data is POSTED successfully to the END point");
		}
	}
}
