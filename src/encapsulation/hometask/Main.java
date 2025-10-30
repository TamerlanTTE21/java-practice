package encapsulation.hometask;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса Car
        Car car = new Car("Toyota", "Camry", 2020);

        // Выводим информацию об автомобиле
        car.printCarInfo();

        // Ускоряем автомобиль
        car.accelerate(50);
        car.printCarInfo();

        // Тормозим автомобиль
        car.brake(20);
        car.printCarInfo();

        // Пытаемся установить некорректные значения
        car.setYear(1800);   // Некорректный год выпуска
        car.setMake("");     // Пустая марка
        car.accelerate(-10); // Некорректное ускорение
        car.brake(-5);       // Некорректное торможение

        // Выводим информацию после попытки изменить данные
        car.printCarInfo();

        // Устанавливаем корректные значения
        car.setYear(2018);
        car.setMake("Honda");
        car.setModel("Accord");

        // Выводим обновленную информацию
        car.printCarInfo();

    }
}
