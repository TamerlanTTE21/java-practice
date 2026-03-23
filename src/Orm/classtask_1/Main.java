package Orm.classtask_1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static String url = "jdbc:postgresql://localhost:5432/sql-practice-tamerlan";
    static String user = "postgres";
    static String password = "postgres";

    public static void main(String[] args) throws SQLException {
//        List<Continent> continents = getAllContinents();
//        continents.forEach(continent -> {
//            System.out.println(continent.getId() + " " + continent.getName());
//        });

        List<Country> countries = getAllCountries();
        countries.forEach(country -> {
            System.out.println(country.getId() + " " + country.getName() + " - " + country.getContinent().getName());
        });
    }

    public static List<Continent> getAllContinents() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);

        PreparedStatement ps = connection.prepareStatement("select * from continents");

        ResultSet rs = ps.executeQuery();

        List<Continent> continents = new ArrayList<>();

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");

            Continent continent = new Continent(id, name);
            continents.add(continent);
        }
        return continents;
    }

    public static List<Country> getAllCountries() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = """
                select
                continents.id as continent_id,
                continents.name as continent_name,
                countries.id as country_id,
                countries.name as country_name
                from continents
                join countries on continents.id = countries.continent_id
                """;

        PreparedStatement ps = connection.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        List<Country> countries = new ArrayList<>();


        while (rs.next()) {
            int continentId = rs.getInt("continent_id");
            String continentName = rs.getString("continent_name");

            int countryId = rs.getInt("country_id");
            String countryName = rs.getString("country_name");

            Continent continent = new Continent(continentId, continentName);

            Country country = new Country(countryId, countryName, continent);
            countries.add(country);
        }
        return countries;
    }
}
