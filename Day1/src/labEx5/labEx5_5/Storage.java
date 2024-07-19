package labEx5.labEx5_5;

public interface Storage {
    void addEmployee(Employee e) throws EmployeeAlreadyExistsException;
    Employee getEmployee(int empno) throws EmployeeNotFoundException;
}
