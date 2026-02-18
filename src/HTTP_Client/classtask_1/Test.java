package HTTP_Client.classtask_1;

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
        System.out.println("Введите ваш город: ");
        String city = scanner.nextLine();
        HttpClient httpClient = HttpClient.newHttpClient();
        String url = "https://api.openweathermap.org/data/2.5/weather?q="+ city + "&units=metric&lang=ru&appid=79d1ca96933b0328e1c7e3e7a26cb347";

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

            JsonObject main = jsonObject.get("main").getAsJsonObject();
            double temp = main.get("temp").getAsDouble();

            JsonObject wind = jsonObject.get("wind").getAsJsonObject();
            int speed = wind.get("speed").getAsInt();

            System.out.println("Температура воздуха: " + temp);
            System.out.println("Скорость ветра: " + speed);
        } else {
            System.out.println("Город не найден");
        }
    }
}
