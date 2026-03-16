package Jdbc.classtask_1;

import java.sql.*;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/sql-practice-tamerlan";
        String user = "postgres";
        String password = "postgres";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное значение диапозона");
        int citiesFirstCount = scanner.nextInt();
        System.out.println("Введите конечное значение диапозона");
        int citiesSecondCount = scanner.nextInt();


        Connection connection = DriverManager.getConnection(url, user, password);

        PreparedStatement ps = connection.prepareStatement("select * from cities where population >=" + citiesFirstCount + " AND population <=" + citiesSecondCount);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int population = rs.getInt("population");
            System.out.println(id + ". " + name + ". " + population);
        }

    }
}
