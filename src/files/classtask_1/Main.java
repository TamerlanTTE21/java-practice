package files.classtask_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path folder = Paths.get("logs");
        try {
            if (!Files.exists(folder)) {
                Files.createDirectory(folder);
                System.out.println("Директория создана");
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }

        int number = 0;
        for (int i = 1; i < 6; i++) {
            number++;
            Path file = Paths.get("logs", "log" + number + ".txt");
            try {
                if (!Files.exists(file)) {
                    Files.createFile(file);
                    System.out.println("Директория создана");
                }
            } catch (IOException e) {
                System.out.println("Ошибка");
            }
        }
    }
}
