package com.korit.study.ch32;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileModifier {
    public static void main(String[] args) {
        String oldFilePath = "student.txt";
        String newFilePath = "newStudent.txt";


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(oldFilePath));
            List<String> lines = new ArrayList<>();
            String line;
            while((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            for (int i = 0; i < lines.size(); i++) {
                lines.set(i, lines.get(i).replace("김준일", "오진현"));
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(newFilePath));
            for (String modifiedLine : lines) {
                writer.write(modifiedLine);
                writer.newLine();
            }
            writer.close();

            Files.delete(Paths.get(oldFilePath));
            Files.move(Paths.get(newFilePath), Paths.get(oldFilePath));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
