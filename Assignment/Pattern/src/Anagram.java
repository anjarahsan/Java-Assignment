import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
//        String s1 = "New York Times ";
//        String s2 = "monkeys write  ";
        String s1 ="restful";
        String s2 = "fluster";
        if (anagramCheck(s1, s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Aragram");
        }
    }
    static boolean anagramCheck(String s1 , String s2) {

        s1=s1.toLowerCase().replace(" "," ");
        s2=s2.toLowerCase().replace(" ", " ");
        if (s1.length() != s2.length()) {
            return false;
        }
        //transform to array
        char string1ToArray[] = s1.toCharArray();
        char string2ToArray[] = s2.toCharArray();
        //sorting
        Arrays.sort(string1ToArray);
        Arrays.sort(string2ToArray);
        for (int i = 0; i < s1.length(); i++)
            if (string1ToArray[i] != string2ToArray[i]) return false;return true;}}