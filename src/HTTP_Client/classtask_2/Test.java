package HTTP_Client.classtask_2;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newHttpClient();
        String url = "https://ws.audioscrobbler.com/2.0/?method=track.search&track=white&api_key=31c6a431b77159b2e385bc83d1be07db&format=json";

        // Описание запроса
        HttpRequest request = HttpRequest.newBuilder()
                .GET()               // указание метода
                .uri(URI.create(url)) // указание пути
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            System.out.println(response.statusCode());

            JsonElement jsonElement = JsonParser.parseString(response.body());
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            JsonObject main = jsonObject.get("results").getAsJsonObject();
            JsonObject results = main.get("opensearch:Query").getAsJsonObject();
            int temp = results.get("startPage").getAsInt();

            System.out.println(temp);
        } else {
            System.out.println("dfgd");
        }
    }
}
