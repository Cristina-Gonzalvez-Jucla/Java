package main;

import obj.File;

import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        File file = new File("scores.txt");
        Scanner input = new Scanner((Readable) file);
        int averageScore = 0;
        int count = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] values = line.split(";");
            averageScore += Integer.parseInt(values[1]);
            count++;
        }
        input.close();
        averageScore = averageScore / count;
        System.out.println("Average score: " + averageScore);
    }
}
