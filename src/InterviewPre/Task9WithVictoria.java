package InterviewPre;

import java.util.Arrays;

public class Task9WithVictoria {
   /* String str="DC501GCCCA098911";

    output  CD015ACCCG011899

    */
   public static void main(String[] args) {
       String []str="DC501GCCCA098911".split("");

       Arrays.sort(str);
       System.out.println(Arrays.toString(str));

   }
}
