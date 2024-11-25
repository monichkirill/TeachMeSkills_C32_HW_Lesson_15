package com.teachmeskills.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int size;

        while(true) {
            System.out.println("Enter the collection size: ");
            String input = scanner.nextLine();

            try {
                size = Integer.parseInt(input);
                if (size > 0) {
                    break;
                } else System.out.println("Size must be greater than 0");
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input");
            }
        }

        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            numbers.add(rand.nextInt(50));
        }

        System.out.println("Numbers: " + numbers);
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.size();
        System.out.println("Average: " + average);
    }
}
