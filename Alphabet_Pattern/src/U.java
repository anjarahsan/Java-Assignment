public class U {
    public static void main(String[] args) {
        int i, j, n = 9;
        // TODO: 7/30/2022  'U'

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if((j==0 && i!=n-1) ||(i==n-1 && j!=0 && j!=n-1) || (j==n-1 && i!=n-1))
                {
                    System.out.print("*");
                    System.out.print(" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
