package Hashtables;

import java.util.HashMap;
import java.util.Scanner;

public class Hometask_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> students = new HashMap<>();
        while (true) {
            printMenu();
            int command = Integer.parseInt(scanner.nextLine());
            if (command == 1) {
                addStudent(scanner, students);
            } else if (command == 2) {
                showStudent(students);

            } else if (command == 3) {
                averageScore(students);
            } else if (command == 0) {
                System.out.println("Пока!");
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }

    }

    static void printMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1 — Добавить студента ");
        System.out.println("2 — Распечатать всех студентов");
        System.out.println("3 — Посчитать среднее значение");
        System.out.println("0 -  Выход");

    }

    public static String addStudent(Scanner scanner, HashMap<String, Integer> students) {
        System.out.println("Введите имя студента: ");
        String addStudents = scanner.nextLine();
        System.out.println("Введите оценку (0-100): ");
        int addScore = Integer.parseInt(scanner.nextLine());
        students.put(addStudents, addScore);

        return addStudents;
    }

    public static String showStudent(HashMap<String, Integer> students) {
        System.out.println("=== Все оценки ===");
        for (String showStudents : students.keySet()) {
            System.out.println(showStudents + students.values());
//
        }
        return "";
    }

    public static int averageScore(HashMap<String, Integer> students) {
        int total = 0;
        int avgScore = total / students.size();
        for (String showStudents : students.keySet()) {
            for (Integer average : students.values()) {
                total += average;

                System.out.println(showStudents + avgScore);
            }
        }
        return avgScore;
    }
}

