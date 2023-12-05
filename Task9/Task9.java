/*Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения. */
package Task9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task9 {
    public static void main(String[] args) throws IOException {
        repeat("TEST");
    }
    public static void repeat(String str) throws IOException{
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++){
            sb.append(str);
        }
        File file = new File("Task9/Task9.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(sb.toString());
        fw.flush();
    }
}
