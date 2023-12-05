/*Напишите метод, который вернет содержимое текущей папки в виде
массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим
методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае
возникновения исключения, оно должно записаться в лог-файл. */
package Task10;

import java.io.File;
import java.io.FileWriter;


import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Task10 {
    private final static String PATH = ".";
    private static final Logger LOG = log.log(Task10.class.getName());

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(getFileNamesInDir()));
        write();
    }

    private static String[] getFileNamesInDir() {
        File dir = new File(PATH);
        String[] result = new String[0];
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    File file = files[i];
                    String name = file.getName();
                    if (file.isFile()) {
                        System.out.println("\tFile - " + name);
                    } else {
                        System.out.println("Directory - " + name);
                    }
                    result[i] = name;
                }
            }
        } else {
            System.out.println(dir.getName() + " не является папкой");
        }
        return result;
    }

    public static void write() {
        try(FileWriter in = new FileWriter("Task10/task10.txt")) {
            String[] data = getFileNamesInDir();
            for (String s : data) {
                in.append(s).append("\n");
            }
            System.out.println("File names in goal dir recorded!");
            if (isThrow()) {
                throw new IOException("Some kind of mistake");
            }

        } catch (IOException e) {
            LOG.log(Level.INFO, e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    private static boolean isThrow() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
        }
}
