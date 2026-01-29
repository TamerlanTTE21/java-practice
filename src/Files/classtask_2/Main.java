package Files.classtask_2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

        List<User> users = List.of(
                new User("bob", 20),
                new User("sam", 25),
                new User("kate", 23),
                new User("amy", 28)
        );
        Writer writer = new FileWriter("users.txt");
        writer.write("login,age");

        for (int i =0; i < users.size(); i++) {

            writer.write("\n");
            writer.write(users.get(i).getLogin() + "," + users.get(i).getAge());

        } writer.close();



    }


// users.txt

// name,age
// bob,20
// sam,25
// kate,23
// amy,28
}
