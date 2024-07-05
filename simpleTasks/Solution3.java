import java.util.*;
import java.io.*;

public class Solution3{
    public static void main(String []argh){
        Scanner scanner = new Scanner(System.in);

        int amountLinestoRead = Integer.parseInt(scanner.nextLine());

        while (amountLinestoRead-- > 0){
            int [] input = readArray(scanner);
            int a = input[0];
            int b = input[1];
            int n = input[2];

            int[] series = generateSeries(a, b, n);

            System.out.println(Arrays.toString(series).replace("[", "").replace("]", "").replace(",", ""));
        }
        scanner.close();
    }
    public static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                     .mapToInt(Integer::parseInt)
                     .toArray();
    }
    public static int[] generateSeries(int a, int b, int n) {
        int[] series = new int[n];
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += Math.pow(2, i);
            series[i] = a + b * currentSum;
        }
        return series;
    }
}
