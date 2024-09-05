public class Pattern_9 {
    public static void main(String[] args) {
        int stars = -1;
        for(int i = 1; i <= 5; i++) {
            int spaces = 5 - i;

            for(int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            stars += 2;
            for(int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = 5; i >= 1; i--) {
            int spaces = 5 - i;

            for(int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            
            stars -= 2;
            System.out.println();
        }
    }
}
