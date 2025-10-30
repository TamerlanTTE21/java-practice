package Hashtables.hometask;

import java.util.ArrayList;
import java.util.HashMap;

public class Hometask_2 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> students = new HashMap<>();
        students.put("Alexey", new ArrayList<>() {{
            add(90);
            add(95);
            add(80);
        }});

        students.put("Damir", new ArrayList<>() {{
            add(96);
            add(90);
            add(87);
        }});

        students.put("Maksim", new ArrayList<>() {{
            add(83);
            add(90);
            add(89);
        }});

        double max = 0;
        String maxStudent = "";

        for (String student : students.keySet()) {
            double total = 0;

            for (Integer sum : students.get(student)) {
                total += sum;
            }
            double averageScore = total / students.get(student).size();
            System.out.println(student + " " + averageScore);

            if (averageScore > max) {
                max = averageScore;
                maxStudent = student;
            }
        }
        System.out.println(maxStudent);
    }
}

