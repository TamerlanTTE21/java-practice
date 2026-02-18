package HTTP_Server.classtask_3;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserHandler implements HttpHandler {

    // сериализация
    // десериализация
    Gson gson = new Gson();

    List<User> users = new ArrayList<>(List.of(
            new User("Alex", 28, true),
            new User("Dan", 29, false),
            new User("Matt", 32, false),
            new User("Jenny", 30, true)
    ));

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        String method = exchange.getRequestMethod();

        String json;
        if (method.equals("GET")) {
            exchange.sendResponseHeaders(200, 0); //OK
            json = gson.toJson(users);
        } else if (method.equals("POST")) {
            InputStream inputStream = exchange.getRequestBody();
            byte[] bytes = inputStream.readAllBytes();
            String body = new String(bytes);

            if (body.isBlank()) {
                exchange.sendResponseHeaders(400, 0); // BAD REQUEST
                json = "Вы не передали тело";
            } else {
                exchange.sendResponseHeaders(201, 0); // CREATED
                User user = gson.fromJson(body, User.class);
                users.add(user);

                json = "Вы используете метод POST";
            }
        } else {
            exchange.sendResponseHeaders(405, 0); // METHOD NOT ALLOWED
            json = "Неподдерживаемый метод";
        }

        OutputStream os = exchange.getResponseBody();
        os.write(json.getBytes());
        os.close();
    }

}
