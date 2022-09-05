import java.util.Scanner;

public class ReversSentanceSpace {
    public static void main(String[] args) {

        String str = "Think Twice";
        String[] words=str.split(" ");
        String revString = "";
        for(int i=0; i < words.length;i++)
        {
            String word = words[i];
            String revWord ="";
            for(int j=word.length()-1;j>=0 ;j--)
            {
                revWord=revWord+word.charAt(j);
            }
            revString=revString+revWord + " ";
        }
        System.out.println(revString);
    }
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a string");
//        String sen=sc.nextLine();
//        String rev="";
//        int len=sen.length();
//        for(int i=len-1;i>=0;i--) {
//            rev = rev + sen.charAt(i);
//        }
//        if(rev!=' ')
//        {
//
//        }
//        sen=sen+"";
//        String revsen="", word="";
//        for(int i=0;i<sen.length();i++)
//        {
//            char ch=sen.charAt(i);
//            if(ch!=' ')
//            {
//                word=word+ch;
//            }
//            else {
//                revsen=word+" "+revsen;
//                word="";
//            }
//        }
//        System.out.println(revsen);
//    }


}
