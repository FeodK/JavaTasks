/*Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на
экран. */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int n = 10;

        for (int i = 0; i < n; i++){
            list.add(random.nextInt(n));
        }
        System.out.println(list);
        list.sort(null);

        System.out.println(list);
    }
}
