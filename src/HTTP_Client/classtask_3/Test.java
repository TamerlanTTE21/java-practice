package HTTP_Client.classtask_3;

import com.google.gson.JsonArray;
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
        String url = "https://swapi.nomoreparties.co/people";

        // Описание запроса
        HttpRequest request = HttpRequest.newBuilder()
                .GET()               // указание метода
                .uri(URI.create(url)) // указание пути
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            System.out.println(response.statusCode());

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonArray array = jsonObject.get("results").getAsJsonArray();

            int max = 0;
            String name = "";

            for (JsonElement element : array) {

                JsonObject character = element.getAsJsonObject();
                int temp = character.get("height").getAsInt();
                String name1 = character.get("name").getAsString();
                if (max < temp) {
                    max = temp;
                    name = name1;
                }
            }
            System.out.println(name);
        } else {
            System.out.println("dfgd");
        }
    }
}
