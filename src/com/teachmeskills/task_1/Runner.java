package com.teachmeskills.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number. Finish - enter 'exit': ");

        while (true) {
            String str = scanner.nextLine();

            if (str.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                numbers.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + e.getMessage());
            }
        }

        System.out.println("Numbers: " + numbers);

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            }
        }
    }
}
