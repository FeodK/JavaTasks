/*Написать программу, которая попросит пользователя ввести <Имя> в консоли.
Получит введенную строку и напечатает в консоль сообщение “Привет, <Имя>!” */

package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter your name, please: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        // System.out.println("Hello, " + name + "!");
        System.out.printf("Hello, %s!", name);

    }
}
