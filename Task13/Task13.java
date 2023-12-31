/*Каталог товаров книжного магазина сохранен в виде двумерного
списка List<ArrayList<String>> так, что на 0й позиции каждого
внутреннего списка содержится название жанра, а на остальных
позициях - названия книг. Напишите метод для заполнения данной
структуры. */
package Task13;

import java.util.ArrayList;
import java.util.List;

public class Task13 {
    static List<ArrayList<String>> shopBook = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> proza = new ArrayList<>();
        proza.add(0, "проза");
        proza.add("Буратино");

        ArrayList<String> poezia = new ArrayList<>();
        poezia.add(0, "поэзия");
        poezia.add("Онегин");

        addBooks(proza);
        addBooks(poezia);

        System.out.println(shopBook);
    }
    
    static void addBooks(ArrayList<String> books){
        shopBook.add(books);
    }
}
    
