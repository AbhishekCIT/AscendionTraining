package day1;

public class Door {
    int doorNo;
    String color;
    static String model;
    static String type;
    float height;
    float width;
    float price;
    boolean soundProof;

    void door1(){
        doorNo =1;
        color = "Brown";
        model = "Wooden";
        type = "Push/Pull";
        height = 50;
        width = 10;
        price = 5000;
        soundProof = false;

    }
    void door2(){
        doorNo =2;
        color = "Black";
        model = "PVC";
        type = "Push/Pull";
        height = 50;
        width = 10;
        price = 1000;
        soundProof = true;
    }
    void displayDoor(){
        System.out.println("Door No : "+doorNo);
        System.out.println("Color : "+color);
        System.out.println("Model : "+model);
        System.out.println("Type : "+type);
        System.out.println("Height : "+height);
        System.out.println("Width : "+width);
        System.out.println("Price : "+price);
        System.out.println("Sound Proof : "+soundProof+"\n");
    }
}
