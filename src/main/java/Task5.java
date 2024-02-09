import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Задача: Напишите программу, которая проверяет,
        // является ли число двузначным.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше число: ");
        int chislo = sc.nextInt();
        String result = (chislo >= 10) && (chislo <= 99) ? "Число " + chislo + " двузначное": "Число " + chislo + " не двузначное";
        System.out.println(result);


    }
}
