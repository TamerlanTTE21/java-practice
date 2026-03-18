package Jdbc.classtask_2;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/sql-practice-tamerlan";
        String user = "postgres";
        String password = "postgres";

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = """
                select 
                    cities.id as city_id,
                    cities.name as city_name,
                    cities.population as city_population,
                    countries.id as country_id,
                    countries.name as country_name
                    from cities
                join countries on cities.country_id = countries.id
                """;

        PreparedStatement ps = connection.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            int cityId = rs.getInt("city_id");
            String cityName = rs.getString("city_name");
            int cityPopulation = rs.getInt("city_population");

            int countryID = rs.getInt("country_id");
            String counrtyName = rs.getString("country_name");


//            System.out.println("city_id" + cityId);
//            System.out.println("post_name" + cityName);
//            System.out.println("country_id" + countryID);
//            System.out.println("country_name" + counrtyName + "\n");

            System.out.println(cityId + ". " + cityName + ". " + cityPopulation + ". " + counrtyName);
        }
    }
}
