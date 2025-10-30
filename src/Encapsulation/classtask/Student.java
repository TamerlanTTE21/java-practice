package Encapsulation.classtask;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String names, int ages, double grades) {
        name = names;
        age = ages;
        grade = grades;
    }

    public void printStudentInfo() {
        System.out.println("Имя " + name);
        System.out.println("возраст " + age);
        System.out.println("средний балл " + grade);
    }

    public void setName(String str) {
        if (str.equals("")) {
            System.out.println("Имя не может быть пустым");
        } else {
            name = str;
        }
    }
    public String getName() {
        return name;
    }

    public void setGrade(Double grades) {
        if (grades <= 0.0 || grades >= 10.0) {
            System.out.println("должен быть в диапазоне от 0.0 до 10.0.");
        } else {
            grade = grades;
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setAge (int ages) {
        if (ages <= 0 || ages >= 150) {
            System.out.println("должен быть в диапазоне от 0 до 150.");

        } else {
            age = ages;
        }
    }

    public int getAge() {
        return age;
    }
}
