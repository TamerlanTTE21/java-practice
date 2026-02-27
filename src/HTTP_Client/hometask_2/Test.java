package HTTP_Client.hometask_2;


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
        System.out.println("""
                1. Найти планету no id
                2. Haйти nepcoнaжa no id
                3. Haйти кopaбль no id"""
        );
        int command = scanner.nextInt();
        System.out.println("Выберите id: ");

        int id = scanner.nextInt();

        String find;

        if (command == 1) {
            find = "planets";
        } else if (command == 2) {
            find = "people";
        } else if (command == 3) {
            find = "starships";
        } else {
            System.out.println("такой команды нет");
            return;
        }

        HttpClient httpClient = HttpClient.newHttpClient();
        String url = "https://swapi.nomoreparties.co/" + find + "/" + id;

        HttpRequest request = HttpRequest.newBuilder().GET()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            System.out.println(response.statusCode());

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

            String name1 = jsonObject.get("name").getAsString();
            System.out.println(name1);

        } else {
            System.out.println("error");
        }
    }
}