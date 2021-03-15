package removeDuplicateCharacters;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 15-03-2021
 * Time: 00:17
 */

public class RemoveDuplicate {
    // method to get a resultant string
    static String removeDuplicateConsecutives(String s) {
        char [] arr_s = s.toCharArray();
        int j = 0;
        if (arr_s.length >= 2) {
            for (int index = 1; index < arr_s.length; index++) {
                if (arr_s[j] != arr_s[index]) {
                    arr_s[++j] = arr_s[index];
                }
            }
            char[] resultant = new char[j+1];
            for(int index = 0; index < j+1; index++) {
                resultant[index] = arr_s[index];
            }
            return String.valueOf(resultant);
        }
        return "";
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String resultant_s = removeDuplicateConsecutives(s);
        System.out.print(resultant_s);
    }
}