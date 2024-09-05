import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        int spaces = n * 2;
        for(int i = 1; i <= n; i++) {
            int num = 1;
            spaces -= 2;
            
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            for(int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= i; j++) {
                num--;
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
