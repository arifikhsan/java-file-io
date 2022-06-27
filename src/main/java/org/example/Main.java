package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        var fileName = "src/main/java/org/example/output.txt";
        try {
            var bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write("Arif\n");
            bufferedWriter.write("Ikhsanudin\n");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            var bufferedReader = new BufferedReader(new FileReader(fileName));
            var line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line + ' ' + line.length());
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}