import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt();
        
        boolean isInBounds = start >= 0
                          && start < end 
                          && end <= S.length();
                            
                    
        boolean  isValid = S.length()<=100 && S.length() >=1;
                 
        StringBuilder sb = new StringBuilder();
                 
        for (int i = 0; i < S.length(); i++) {
           if(Character.isLetter(S.charAt(i)))  {
              sb.append(S.charAt(i));
          }
        }

        if(isInBounds && isValid) {
          System.out.println(sb.substring(start , end  ));
      }
   }
}
