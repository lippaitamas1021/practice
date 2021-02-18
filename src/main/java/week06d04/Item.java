package week06d04;

public class Item {

    private int price;
    private int year;
    private int month;
    private int day;
    private String name;

    public Item(int price, int year, int month, int day, String name) {
        this.price = price;
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getName() {
        return name;
    }
}
