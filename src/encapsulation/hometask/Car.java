package encapsulation.hometask;

public class Car {
    private String make;
    private String model;
    private int year;
    private int speed;


    public Car(String makes, String models, int years) {
        make = makes;
        model = models;
        year = years;

    }

    public void printCarInfo() {

        System.out.println("Марка: " + make);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("текущая скорость: " + speed);
    }

    public void setMake(String str) {
        if (str.equals("")) {
            System.out.println("Марка не может быть пустым");
        } else {
            make = str;
        }
    }

    public void setModel(String str) {
        if (str.equals("")) {
            System.out.println("Модель не может быть пустым");
        } else {
            make = str;
        }
    }

    public void setYear(int str) {
        if (str < 1800) {
            System.out.println("Некорректный год выпуска");
        } else {
            year = str;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int increment) {
        if (increment <= 0) {
            System.out.println("Значение ускорения должно быть положительным.");
        } else {
            speed += increment;
        }
    }

    public void brake(int decrement) {
        if (decrement >= 0) {
            System.out.println("Значение замедления должно быть положительным.");
        } else {
            speed -= decrement;
        }
    }


}
