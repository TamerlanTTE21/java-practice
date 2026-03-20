package Jdbc.classtask_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/sql-practice-tamerlan";
        String user = "postgres";
        String password = "postgres";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String newUser = scanner.nextLine();

        Connection connection = DriverManager.getConnection(url, user, password);

//        if (newUser != users.login) {
//            String sql = "insert into users (login) values (?)";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setString(1, newUser);
//            ps.executeUpdate();
//            System.out.println("Пользователь создан");
//        } else {
//            System.out.println("Пользователь не создан");
//        }
    }
}
