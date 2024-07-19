package day1;

public class Table {
    int tableNo;
    String color;
    String model;
    int capacity;
    float height;
    float width;
    float length;
    float price;

    void table1(){
        tableNo =1;
        color="Peach";
        model="Wooden";
        capacity=4;
        height=300;
        width = 200;
        length=500;
        price=2500;
    }

    void table2(){
        tableNo =2;
        color="Brown";
        model="Wooden";
        capacity=2;
        height=300;
        width = 200;
        length=500;
        price=5500;
    }

    void displayTable(){
        System.out.println("Table No : "+tableNo);
        System.out.println("Color : "+color);
        System.out.println("Model : "+model);
        System.out.println("Capacity : "+capacity);
        System.out.println("Height : "+height);
        System.out.println("Width : "+width);
        System.out.println("Length : "+length);
        System.out.println("Price : "+price+"\n");
    }
}
