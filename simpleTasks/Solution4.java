package PersonalTasks;

import java.util.*;

class Solution4 {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);

        int amountNumbersToRead = Integer.parseInt(scanner.nextLine());
        String[] dataTypes = new String[]{"byte", "short", "int", "long"};

        while (amountNumbersToRead-- > 0) {
            String numberString = scanner.nextLine().trim();
            try {
                long number = Long.parseLong(numberString);

                String fitDescription = getFitDescription(number);

                System.out.println(number + " can be fitted in:");
                printDataTypes(fitDescription, dataTypes);

            } catch (NumberFormatException e) {
                System.out.print(numberString + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }

    private static String getFitDescription(long number) {
        if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
            return "byte";
        } else if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
            return "short";
        } else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
            return "int";
        } else {
            return "long";
        }
    }

    private static void printDataTypes(String fitDescription, String[] dataTypes) {
        switch (fitDescription) {
            case "byte":
                printDataTypes(dataTypes, 0);
                break;
            case "short":
                printDataTypes(dataTypes, 1);
                break;
            case "int":
                printDataTypes(dataTypes, 2);
                break;
            case "long":
                printDataTypes(dataTypes, 3);
                break;
        }
    }

    private static void printDataTypes(String[] dataTypes, int numberOfTypes) {
        for (int i = numberOfTypes; i < dataTypes.length; i++) {
            System.out.println("* " + dataTypes[i]);
        }
    }
}
