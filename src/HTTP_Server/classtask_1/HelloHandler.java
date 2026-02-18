package HTTP_Server.classtask_1;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        System.out.println("Получили запрос на /hello");

        exchange.sendResponseHeaders(200, 0);

        String str = "Hello from Java server";

        OutputStream os = exchange.getResponseBody();
        os.write(str.getBytes());
        os.close();
    }
}
