import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        char a = (char)('A' + n - 1);

        for(int i = 0; i < n; i++) {
            for(char j = (char)(a - i); j <= a; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}