public class E {
    public static void main(String[] args) {
        int i, j, n = 9;
        // TODO: 7/30/2022 print 'E'

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n - 1 || i == n / 2) {
                    System.out.print("*");
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
