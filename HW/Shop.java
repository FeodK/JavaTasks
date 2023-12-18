package HW;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Shop {
    private Set<Laptop> laptops = new HashSet<>();

    public void addLap(Laptop laptop) {
        laptops.add(laptop);
    }

    public void snowLaptops() {
        for (Laptop laptop : laptops) {
            laptop.snowInfo();
        }
    }

    public void filterByCriteria(Map<String, Object> parFit) {
        for (Laptop laptop : laptops) {
            if (isFilter(laptop, parFit)) {
                laptop.snowInfo();
            }
        }
    }

    private static boolean isFilter(Laptop laptop, Map<String, Object> parFit) {
        for (Map.Entry<String, Object> entry : parFit.entrySet()) {
            String crit = entry.getKey();
            Object val = entry.getValue();

            switch (crit) {
                case "ram":
                    if (laptop.getRAM() < (int) val) {
                        return false;
                    }
                    break;
                case "hdcap":
                    if (laptop.getHDcap() < (int) val) {
                        return false;
                    }
                    break;
                case "os":
                    if (!laptop.getOS().equalsIgnoreCase((String) val)) {
                        return false;
                    }
                    break;
                case "color":
                    if (!laptop.getColor().equalsIgnoreCase((String) val)) {
                        return false;
                    }
                    break;
                default:
                    System.out.println("Некорректный критерий фильтрации.");
                    return false;
            }
        }
        return true;
    }
}

