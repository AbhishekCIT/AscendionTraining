package labEx4.labEx4_App;

public interface Storage {
    void addEmployee(Employee e);
    Employee getEmployee(int empNo);
    boolean updateEmployee(Employee e);
    boolean deleteEmployee(int empNo);
}
