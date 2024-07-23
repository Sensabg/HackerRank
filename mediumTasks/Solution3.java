import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        while (testCases > 0) {
            String line = in.nextLine();
            boolean isFound = false;
            
            Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
            Matcher matcher = pattern.matcher(line);
            
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                isFound = true;
            }
            
            if (!isFound) {
                System.out.println("None");
            }
            
            testCases--;
        }
        
        in.close();
    }
}
