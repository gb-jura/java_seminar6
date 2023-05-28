//package task_java;

import java.util.ArrayList;
import java.util.Scanner;

public class task1 {
    
    public static void main(String[] args) {
        
        ArrayList <NoteBook> notebooks = new ArrayList<>();
        notebooks.add(new NoteBook("HP", "ProBook 440", 8, 256, "Windows 10", "Silver", 699.99));
        notebooks.add(new NoteBook("Dell", "Latitude 5580", 16, 512, "Windows 10 Pro", "Black", 999.99));
        notebooks.add(new NoteBook("Lenovo", "ThinkPad T490s", 16, 1024, "Windows 10 Pro", "Black", 1199.99));
        notebooks.add(new NoteBook("Apple", "MacBook Pro 13", 16, 512, "macOS", "Space Gray", 1799.00));
        notebooks.add(new NoteBook("Asus", "VivoBook S15", 8, 256, "Windows 10", "Gold", 599.99));
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Выберите параметр для фильтрации:\n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционнаѝ система\n4 - Цвет");
        int parameter = scanner.nextInt();
        
        System.out.println("Введите минимальное значение для выбранного параметра:");
        int minValue = scanner.nextInt();
        
        scanner.close();
        
        ArrayList <NoteBook> filteredNotebooks = new ArrayList<>();
        
        switch (parameter) {
            case 1:
                for (NoteBook notebook : notebooks) {
                    if (notebook.getRam() >= minValue) {
                        filteredNotebooks.add(notebook);
                    }
                }
                break;
            case 2:
                for (NoteBook notebook : notebooks) {
                    if (notebook.getHdd() >= minValue) {
                        filteredNotebooks.add(notebook);
                    }
                }
                break;
            case 3:
                for (NoteBook notebook : notebooks) {
                    if (notebook.getOs().toLowerCase().contains(String.valueOf(minValue).toLowerCase())) {
                        filteredNotebooks.add(notebook);
                    }
                }
                break;
            case 4:
                for (NoteBook notebook : notebooks) {
                    if (notebook.getColor().toLowerCase().contains(String.valueOf(minValue).toLowerCase())) {
                        filteredNotebooks.add(notebook);
                    }
                }
                break;    
            default:
                System.out.println("Некорректный параметр!");
                return;
        }
        
        if (filteredNotebooks.isEmpty()) {
            System.out.println("Нет ноутбуков, удовлетворѝющих выбранному фильтру!");
        } else {
            System.out.println("Ноутбуки, удовлетворѝющие фильтру:");
            for (NoteBook notebook : filteredNotebooks) {
                System.out.println(notebook);
            }
        }
    }
}