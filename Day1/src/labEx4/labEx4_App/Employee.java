package labEx4.labEx4_App;

public class Employee {
    private int empNo;
    private String name;

    public Employee(int empNo, String name){
        this.empNo = empNo;
        this.name = name;
    }


    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee Info :-> Employee Number = "+empNo+" Name = "+name;
    }

}
