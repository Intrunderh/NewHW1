import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Найти максимальное из 3, но через тернарный оператор

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int chislo1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int chislo2 = sc.nextInt();
        System.out.print("Введите третье число: ");
        int chislo3 = sc.nextInt();

        String bolshe1 = chislo1 > chislo2 && chislo1 > chislo3 ? "Число 1 больше остальных чисел" : "";
        String bolshe2 = chislo2 > chislo1 && chislo2 > chislo3 ? "Число 2 больше остальных чисел" : "";
        String bolshe3 = chislo3 > chislo2 && chislo3 > chislo1 ? "Число 3 больше остальных чисел" : "";

        System.out.println("Результат:");
        System.out.println(bolshe1);
        System.out.println(bolshe2);
        System.out.println(bolshe3);
    }
}
