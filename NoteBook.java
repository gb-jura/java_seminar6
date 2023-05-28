//package task_java;

public class NoteBook {
    
    private String manufacturer;
    private String model;
    private int ram;
    private int hdd;
    private String os;
    private String color;
    private double price;
    
    public NoteBook(String manufacturer, String model, int ram, int hdd, String os, String color, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
        this.price = price;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getRam() {
        return ram;
    }
    
    public void setRam(int ram) {
        this.ram = ram;
    }
    
    public int getHdd() {
        return hdd;
    }
    
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    
    public String getOs() {
        return os;
    }
    
    public void setOs(String os) {
        this.os = os;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String toString() {
        return manufacturer + " " + model + ", RAM: " + ram + ", HDD: " + hdd + ", OS: " + os + ", color: " + color + ", price: " + price;
    }
}