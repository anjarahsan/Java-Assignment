public class Ineuron {
    public static void main(String[] args) {
        int i, j, n = 9;

        for (i=0;i<n;i++)
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
            System.out.print("    ");

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
            System.out.print("    ");
            for (j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n - 1 || i == n / 2) {
                    System.out.print("*");
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");
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
            System.out.print("    ");
            for(j=0;j<n;j++)
            {
                if((j==0 && i!=0) || (i==0 && j!=n-1 && j!=0) || (j==n-1 && i<n/2 && i!=0) || (i==n/2 && j!=n-1) || (i==j && i>n/2))
                {
                    System.out.print("*");
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");
            for(j=0;j<n;j++)
            {
                //if((i==0 && j!=0)|| (j==0 && i!=0) || ( i==n-1 && j!=n-1) || (j==n-1 && i!=0))
                if (((j == 0 || j == n-1) && i != 0 && i != n-1) || ((i == 0 || i == n-1) && j != 0 && j != n-1))
                {
                    System.out.print("*");
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");
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
