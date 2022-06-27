package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOByteStreamApp {
    public static void main(String[] args) {
        try {
            byte byteWrite[] = {1, 2, 3, 4, 5};
            var fileName = "src/main/java/org/example/output-iobyte-stream.txt";
            var fileOutputStream = new FileOutputStream(fileName);

            for (byte b : byteWrite) {
                fileOutputStream.write(b);
            }
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            var fileName = "src/main/java/org/example/output-iostream.txt";
            var fileInputStream = new FileInputStream(fileName);
            var byteRead = fileInputStream.read();
            while (byteRead != -1) {
                System.out.println(byteRead);
                byteRead = fileInputStream.read();
            }
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
