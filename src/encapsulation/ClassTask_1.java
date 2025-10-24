package encapsulation;

public class ClassTask_1 {
    public static void main(String[] args) {
        // Создаем объект класса Student
        Student student = new Student("Алексей", 20, 8.5);

        // Выводим информацию о студенте
        student.printStudentInfo();

        // Пытаемся установить некорректные значения
        student.setAge(-5);          // Некорректный возраст
        student.setGrade(11.0);      // Некорректный средний балл
        student.setName("");         // Пустое имя

        // Выводим информацию после попытки изменить данные
        student.printStudentInfo();

        // Устанавливаем корректные значения
        student.setAge(22);
        student.setGrade(9.0);
        student.setName("Мария");

        // Выводим обновленную информацию
        student.printStudentInfo();

    }
}
