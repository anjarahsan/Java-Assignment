public class ReversString {

    public static void main(String[] args) {
        String str="ineron";
        String rev=" ";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Revers String is:"+rev);
//        StringBuffer sb= new StringBuffer(str);
//        System.out.println(sb.reverse());
    }
}
