package labEx4.interfaceEx;

import labEx4.labEx4_1to4.LabEx4_1to4;

//----> 1
interface interface1{
    void display();
}

interface interface2{
    String getId();
}
//-----> 2
interface interface3 extends interface2{
    String getName();
}

//------> 3
class BaseClass {
    public void baseMethod(){
        System.out.println("Base Class");
    }
}

class InterfaceEX extends BaseClass implements interface1,interface3 {

    private String id;
    private String name;
    public InterfaceEX(String id, String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public void display() {
        System.out.println("Display : id = "+id+" and name = "+name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }
}

//---------> 4
public class InterfaceLabEx4_5 {
    public static void main(String[] args) {
        interface3 i3;

//        ------->5
        InterfaceEX interfaceEX = new InterfaceEX("1","Abhishek");

//        ------->6
        i3 = interfaceEX;

//        ------->7
        String id = i3.getId();
        String name = i3.getName();

        if(i3 instanceof interface1){
            ((interface1) i3).display();
        }
        interfaceEX.baseMethod();

    }

}