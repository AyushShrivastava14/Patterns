public class Pattern_8 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            int spaces = i - 1;

            for(int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            for(int j = 5 - i; j >= 0; j--) {
                System.out.print("* ");
            }

            for(int j = 5 - i; j > 0; j--) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
