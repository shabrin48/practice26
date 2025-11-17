import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть перше число: ");
        int a = sc.nextInt();

        System.out.println("Введіть друге число: ");
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            System.out.println("НСД не існує (обидва числа 0)");
            return;
        } else if (a == 0) {
            System.out.println("НСД = " + b);
            return;
        } else if (b == 0) {
            System.out.println("НСД = " + a);
            return;
        }

        int x = a;
        int y = b;

        while (x != y) {
            if (x > y) x -= y;
            else y -= x;
        }

        System.out.println("НСД чисел " + a + " та " + b + " = " + x);
    }
}
