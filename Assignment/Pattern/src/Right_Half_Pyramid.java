public class Right_Half_Pyramid {
    public static void main(String[] args)
    {
        System.out.println("Right Half Pyramid");
        int i,j,n=15;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==n-1 || i+j<=n/2 || i-j>=n/2)
                {
                    System.out.print("*");
                    System.out.print(" ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
