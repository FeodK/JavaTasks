/*Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает
boolean значение). */
package Task8;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(Palindrom("ytuffty"));
    }
    
    public static Boolean Palindrom(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
        // StringBuilder result = new StringBuilder(str);
        // if(str.equals(result.reverse().toString())) {
        //     return true;
        // }
        // else {
        //     return false;
        // }
        // }
    }

