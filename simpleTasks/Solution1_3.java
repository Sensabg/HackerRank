package PersonalTasks;

import java.util.Scanner;

public class Solution1_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 3;

        System.out.println("================================");

        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String language = input[0];
            int points = Integer.parseInt(input[1]);

            int requiredDistance = Math.abs(15 - language.length());
            String amountSpaces = generateSpaces(requiredDistance);
            
            String finalString = String.format("%s%s%03d", language, amountSpaces, points);
            System.out.println(finalString);
        }

        System.out.println("================================");
    }

    public static String generateSpaces(int requiredDistance) {
        return " ".repeat(Math.max(0, requiredDistance));
    }
}
