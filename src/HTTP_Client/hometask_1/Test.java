package HTTP_Client.hometask_1;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите валюту: ");
        String currency = scanner.nextLine();
        HttpClient httpClient = HttpClient.newHttpClient();
        String url = "https://api.apilayer.com/exchangerates_data/latest?base=USD&symbols=KZT&apikey=iISN69jOgAmSSuWq5GG68tko23CuqMLk";

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

            JsonObject main = jsonObject.get("base").getAsJsonObject();
            double cur = main.get(currency).getAsDouble();

            JsonObject main2 = jsonObject.get("rates").getAsJsonObject();
            int KZT = main2.get("KZT").getAsInt();

            System.out.println("Валюта: " + cur);
            System.out.println("KZT: " + KZT);
        } else {
            System.out.println("Валюта не найдена");
        }
    }
}
