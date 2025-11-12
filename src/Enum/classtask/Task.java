package Enum.classtask;

public class Task {
      // добавьте переменную priority с приоритетом задачи

    private String description;
    TaskPriority priority;

    // добавьте конструктор класса

    public Task(TaskPriority priority, String description) {
        this.description = description;
        this.priority = priority;
    }


    // добавьте метод get для приоритета


    public TaskPriority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}
