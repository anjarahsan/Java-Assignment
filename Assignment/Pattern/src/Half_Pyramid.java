public class Half_Pyramid {
    public static void main(String[] args)
    {
        int i,j,n=20;
        System.out.println("half Pyramid");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j == 0 && i>=n/2 || j == n-1 && i>=n/2 || i>=n-2 || i-j>=n/2 || i+j>=n+n/2-1)
                {
                    System.out.print("*");
                    System.out.print("  ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println("  ");
        }

    }
}
