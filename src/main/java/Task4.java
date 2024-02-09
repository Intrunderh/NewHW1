import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Задача: Напишите программу, которая проверяет,
        // является ли год високосным или нет.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = sc.nextInt();
        String visoc = (year > 1584) && (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ?
                year + " год является високосным" : year + " год не является високосным";
        System.out.println(visoc);
    }
}
