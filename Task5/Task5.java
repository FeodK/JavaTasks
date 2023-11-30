/*Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке. */
package Task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String sentence = "Добро пожаловать на курс по Java";
        String[] array = sentence.split(" ");
        // System.out.println(Arrays.toString(array));

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
    }
}
