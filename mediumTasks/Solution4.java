import java.util.*;

public class Solution4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(findMaxUniqueNumbers(array, n, m));
    }

    public static int findMaxUniqueNumbers(int[] array, int n, int m) {
 
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int maxUnique = 0;

        for (int i = 0; i < m; i++) {
            countMap.put(array[i], countMap.getOrDefault(array[i], 0) + 1);
        }

        maxUnique = countMap.size();

        for (int i = m; i < n; i++) {
   
            int outgoingElement = array[i - m];

            if (countMap.get(outgoingElement) == 1) {
                countMap.remove(outgoingElement);
            } else {
                countMap.put(outgoingElement, countMap.get(outgoingElement) - 1);
            }

            int incomingElement = array[i];
            countMap.put(incomingElement, countMap.getOrDefault(incomingElement, 0) + 1);

            maxUnique = Math.max(maxUnique, countMap.size());
        }

        return maxUnique;
    }
}
