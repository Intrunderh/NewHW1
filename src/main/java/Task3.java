import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Задача: Напишите программу, которая проверяет,
        // является ли число четным или нечетным.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int chislo = sc.nextInt();
        String result = chislo % 2 == 0 ? "Число " + chislo + " четное" : "Число " + chislo + " нечетное";
        System.out.println(result);

    }
}
