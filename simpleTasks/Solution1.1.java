import java.util.Scanner;

public class Solution1.1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.println("================================");
          while(3-- > 0) {

            String [] input = scanner.nextLine().split("\\s+");
            String language = input[0];
            int points = Integer.parseInt(input[1]);

            int requiredDistance =  Math.abs(15 - language.length());

            String finalString = String.format("%s%s%03d",
                    language,
                    printSpaces(requiredDistance),
                    points);

            System.out.println(finalString);

        }
        System.out.println("================================");

    }
    public static String printSpaces(int requiredDistance){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < requiredDistance; i++) {
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
