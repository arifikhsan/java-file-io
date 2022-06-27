package org.example;

import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

public class TryWithResourceApp {
    public static void main(String[] args) {
        var fileName = "src/main/java/org/example/output.txt";

        try (var scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                var line = scanner.nextLine();
                System.out.println(line + ' ' + line.length());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
