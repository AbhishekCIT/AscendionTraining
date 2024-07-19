package labEx2.employee;

public class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getEmployeeDetails() {
        return "Name: " + name + ", ID: " + employeeId;
    }
}
