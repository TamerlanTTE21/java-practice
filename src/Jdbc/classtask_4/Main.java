package Jdbc.classtask_4;

import java.sql.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static String url = "jdbc:postgresql://localhost:5432/sql-practice-tamerlan";
    static String user = "postgres";
    static String password = "postgres";

    public static void main(String[] args) throws SQLException {
//        System.out.println("*".repeat(51));
//
        Set<Integer> countryIds = printCountires();

        Connection connection = DriverManager.getConnection(url, user, password);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите страну ");
        int countries = Integer.parseInt(scanner.nextLine());

        if (!countryIds.contains(countries)) {
            System.out.println("Страна не существуют");
            return;
        }

        System.out.println("Введите название города ");
        String city = scanner.nextLine();

        System.out.println("Введите население ");
        int population = scanner.nextInt();

        String sql = "insert into cities (country_id, name, population) values (?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, countries);
        ps.setString(2, city);
        ps.setInt(3, population);
        try {
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Set<Integer> printCountires() throws SQLException {
        Set<Integer> ids = new HashSet<>();
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from countries";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int countriesId = rs.getInt("id");
            ids.add(countriesId);
            String countriesName = rs.getString("name");
            System.out.println(countriesId + ". " + countriesName);
        }

        connection.close();
        return ids;
    }
}
