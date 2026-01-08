package Strings.hometask_2;

public class Main {
    public static void main(String[] args) {
        String rules = "На зелёный цвет — стой на месте;\n" +
                "на зелёный цвет — приготовься;\n" +
                "на зелёный — осмотрись, а затем смело шагай.";
        String replaced = rules;
        System.out.println(replaced.replace("На зелёный цвет — стой на месте;", "На красный свет — стой на месте;"));
        System.out.println(replaced.replace("на зелёный цвет — приготовься;","на жёлтый свет — приготовься;"));
        System.out.println(replaced.replace("на зелёный — осмотрись, а затем смело шагай.", "на зелёный — осмотрись, а затем смело шагай."));
    }
}

