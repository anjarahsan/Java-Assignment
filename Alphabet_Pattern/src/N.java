public class N {
    public static void main(String[] args)
    {
        int i, j, n = 9;
        System.out.println("Alphabet N");

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j==0 || j==n-1 || i==j)
                {
                    System.out.print("*");
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
