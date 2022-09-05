import java.util.Scanner;

public class CountSpecialChar {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any character");
        String str= sc.nextLine();
        int lower=0,upper=0,number=0,special=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>'A' && ch<= 'Z')
                upper++;
            else if(ch>='a' && ch<='z')
                lower++;
            else if(ch>='0' && ch<='9')
                number++;
            else
                special++;
        }
        System.out.println("Uper case"+upper);
        System.out.println("lower case"+lower);
        System.out.println("number case"+number);
        System.out.println("special case"+special);;
    }
}
