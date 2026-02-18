package HTTP_Server.classtask_2;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;


public class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String query = exchange.getRequestURI().getQuery();
        System.out.println(query);
        String[] params = query.split("&");

        String[] firstParam = params[0].split("=");
        String[] secondParam = params[1].split("=");

        int first = Integer.parseInt(firstParam[1]) ;
        int second = Integer.parseInt(secondParam[1]) ;

        String str =first + " + "+ second + " = " + (first + second);

        exchange.sendResponseHeaders(200, 0);

        OutputStream os = exchange.getResponseBody();
        os.write(str.getBytes());
        os.close();
    }
}
