package myjavacode;
import com.google.gson.Gson;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import org.testing;
import io.rest-assured;
import org.osframework.testng;
import org.testing.annotations.Test;

public class 	API_TEST {

	public class transcript extends Transcript {

		public transcript(String url) {

		}
	}

	public void main(String[] args) {
		// TODO Auto-generated method stub
@Test
		Transcript transcript = new transcript("https://dummy.restapiexample.com/api/v1/create");
		transcript.setPost_REF_HERE("{\"name\":\"Cope\",\"salary\":\"123\",\"age\":\"23\"}");
		Gson gson;
		gson = new Gson();
		String jsonRequest = gson.toJson(transcript);

		System.out.println(JsonRequest);
		HttpRequest postRequest = null;
		try {
			postRequest = HttpRequest.newBuilder()
					.uri(new URI("https://dummy.restapiexample.com/api/v1/create"))
					//.header("","")
					.POST(BodyPublishers.ofString("{\"name\":\"Cope\",\"salary\":\"123\",\"age\":\"23\"}"))
					.build();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		HttpClient httpclient = HttpClient.newHttpClient();

		HttpResponse<String> HttpClient;
		httpclient.send();

		HttpResponse<Object> postResponse;
		postResponse = null;
		System.out.println(postResponse.body());

		gson.fromJson((String) postResponse.body(), Transcript.class);

		transcript = gson.fromJson((String) postResponse.body(), Transcript.class);

		System.out.println(transcript.getID());
	}

}
