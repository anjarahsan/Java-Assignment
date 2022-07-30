public class I {
    public static void main(String[] args)
    {
        System.out.println("Alphabet I");
        int i, j, n = 9;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j==0) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
