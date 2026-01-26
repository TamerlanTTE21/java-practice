package Files.classtask_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("votes.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            if (line.equals("A")) {
                A++;
            } else if (line.equals("B")) {
                B++;
            } else if (line.equals("C")) {
                C++;
            } else if (line.equals("D")) {
                D++;
            }
        }
        System.out.println("A = "+ A);
        System.out.println("B = "+ B);
        System.out.println("C = "+ C);
        System.out.println("D = "+ D);

    }
}
