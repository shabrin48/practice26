import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть першу дату (день, місяц, рік): ");
        int day1 = sc.nextInt();
        int month1 = sc.nextInt();
        int year1 = sc.nextInt();

        System.out.println("Введіть другу дату (день, місяц, рік): ");
        int day2 = sc.nextInt();
        int month2 = sc.nextInt();
        int year2 = sc.nextInt();

        if (year1 < year2) {
            System.out.println("Перша дата раніше другої");
        } else if (year1 > year2) {
            System.out.println("Перша дата пізніше другої");
        } else {
            if (month1 < month2) {
                System.out.println("Перша дата раніше другої");
            } else if (month1 > month2) {
                System.out.println("Перша дата пізніше другої");
            } else {
                if (day1 < day2) {
                    System.out.println("Перша дата раніше другої");
                } else if (day1 > day2) {
                    System.out.println("Перша дата пізніше другої");
                } else {
                    System.out.println("Дати однакові");
                }
            }
        }
    }
}
