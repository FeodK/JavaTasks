package HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Shop shop = new Shop();

            shop.addLap(new Laptop("Asus ZenBook", 16, 512, "Windows10", "Grey"));
            shop.addLap(new Laptop("Dell XPS", 8, 256, "Ubuntu", "Silver"));
            shop.addLap(new Laptop("HP Spectre", 32, 1, "Windows11", "Black"));

            shop.snowLaptops();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите критерии фильтрации:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");

            System.out.print("Выберите номер критерия: ");
            int chosenCrit = scanner.nextInt();

            // Map для хранения параметров фильтрации
            Map<String, Object> parFit = new HashMap<>();

            switch (chosenCrit) {
                case 1:
                    System.out.print("Введите минимальный объем ОЗУ (в ГБ): ");
                    int minRAM = scanner.nextInt();
                    parFit.put("ram", minRAM);
                    break;
                case 2:
                    System.out.print("Введите минимальный объем ЖД (в ГБ): ");
                    int minHD = scanner.nextInt();
                    parFit.put("hdcap", minHD);
                    break;
                case 3:
                    System.out.print("Введите желаемую операционную систему: ");
                    String chOS = scanner.next();
                    parFit.put("os", chOS);
                    break;
                case 4:
                    System.out.print("Введите желаемый цвет: ");
                    String chColor = scanner.next();
                    parFit.put("color", chColor);
                    break;
                default:
                    System.out.println("Некорректный номер критерия.");
                    return;
            }

            shop.filterByCriteria(parFit);
        }
    }

