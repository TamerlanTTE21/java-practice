package Enum.hometask_1;

public class Practice {
    public static void main(String[] args) {
        System.out.println(getPopulationPercent(Continent.ASIA));
    }

    public static String getPopulationPercent(Continent continent) {

        switch (continent) {
            case ASIA -> {
                return "59.5%";
            }
            case AFRICA -> {
                return "16.9%";
            }
            case NORTH_AMERICA -> {
                return "7.7%";
            }
            case SOUTH_AMERICA -> {
                return "5.6%";
            }
            case ANTARCTICA -> {
                return "<0.1%";
            }
            case EUROPE -> {
                return "9.7%";
            }
            case AUSTRALIA -> {
                return "0.5%";
            }
            default -> {
                return "Такого материка не существует.";
            }
        }
    }
}

