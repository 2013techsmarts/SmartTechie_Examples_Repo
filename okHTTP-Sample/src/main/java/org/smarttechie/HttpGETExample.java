package org.smarttechie;

import java.io.IOException;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

/**
 * This class demonstrates the GET request by using OKHttp client implementation.
 * @author Siva Janapati
 *
 */
public class HttpGETExample {

	public static void main(String[] args) throws IOException {

		OkHttpClient client = new OkHttpClient();
		
		Request request = new Request.Builder()
		.url("http://www.google.com/trends/hottrends/atom/hourly")
		.build();
		
		Response response = client.newCall(request).execute();
		
		if (response.isSuccessful()) {
			System.out.println("The status code is ::: " + response.code());
			System.out.println(response.body().string());
		}
	}
}
