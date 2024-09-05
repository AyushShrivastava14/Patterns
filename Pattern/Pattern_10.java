import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        int upper_half = (int) Math.ceil(n / 2.0);
        int stars = 0;
        int spaces = 4;
        
        for(int i = 1; i <= upper_half; i++) {

            for(int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            stars += 1;
            for(int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= n - upper_half; i++) {

            for(int j = 1; j <= 4; j++) {
                System.out.print("  ");
            }

            stars -= 1;
            for(int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
