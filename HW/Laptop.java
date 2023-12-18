package HW;

public class Laptop {
    private String model;
    private int ram;
    private int hdcap;
    private String os;
    private String color;

    // Конструктор
    public Laptop(String model, int ram, int hdcap, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.hdcap = 
        hdcap;
        this.os = os;
        this.color = color;
    }

    // Геттеры
    public String getModel() {
        return model;
    }

    public int getRAM() {
        return ram;
    }

    public int getHDcap() {
        return hdcap;
    }

    public String getOS() {
        return os;
    }

    public String getColor() {
        return color;
    }

    // Метод для вывода информации о ноутбуке
    public void snowInfo() {
        System.out.println("Модель: " + model);
        System.out.println("Объем ОЗУ: " + ram + " ГБ");
        System.out.println("Объем ЖД: " + hdcap + " ГБ");
        System.out.println("Операционная система: " + os);
        System.out.println("Цвет: " + color);
    }
}