public class Pattern_11 {
    public static void main(String[] args) {
        int bool;

        for(int i = 1; i <= 5; i++) {
            if(i % 2 == 0) {
                bool = 0;
            }
            else {
                bool = 1;
            }

            for(int j = 1; j <= i; j++) {
                System.out.print(bool + " ");;
                bool = 1 - bool;
            }
            System.out.println();
        }
    }
}
