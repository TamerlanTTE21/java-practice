package Files.hometask_1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case "add" -> addFile(scanner);
                case "list" -> listFile();
                case "exit" -> {
                    System.out.println("Пока!");
                    return;
                }
                default -> System.out.println("Такой команды нет");
            }
        }
    }

    static void printCommand() {
        System.out.println("Команды: ");
        System.out.println("add");
        System.out.println("list");
        System.out.println("exit");
    }

    static void addFile(Scanner scanner) throws IOException {
        Writer writer = new FileWriter("hometask_1.txt", true);
        String File = scanner.nextLine();
        writer.write(File + "\n");
        writer.close();
    }

    static void listFile() throws IOException {
        Reader reader = new FileReader("hometask_1.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            System.out.print(line);
        }
    }
}
