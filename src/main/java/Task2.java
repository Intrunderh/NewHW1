import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Задача: Напишите программу, которая проверяет,
        // является ли число положительным, отрицательным или нулем.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int chislo = sc.nextInt();
        if (chislo > 0) {
            System.out.println("Ваше число положительное");
        } else if (chislo == 0) {
            System.out.println("Ваше число является нулем");
        } else {
            System.out.println("Ваше число отрицательное");
        }

    }


}
