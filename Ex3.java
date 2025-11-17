public class Ex3 {

    public static void main(String[] args) {

        System.out.print("    ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int row = 1; row <= 10; row++) {

            System.out.printf("%4d", row);

            for (int col = 1; col <= 10; col++) {
                System.out.printf("%4d", row * col);
            }

            System.out.println();
        }
    }
}
