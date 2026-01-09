package Strings.classtask_4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Jack"),
                new User("Bob"),
                new User("Sam"),
                new User("Dan")
        );

        // Мои друзья: Jack, Bob, Sam, Dan
        StringBuilder result = new StringBuilder("Мои друзья: ");
        int index = 0;
        for (User user : users) {
            index ++;
            result.append(user.name);

            if (index != users.size()) {
                result.append(", " );
            }



        }
        System.out.println(result);
    }
}

class User {
    String name;

    public User(String name) {
        this.name = name;
    }
}

