package labEx5.labEx5_5;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStorage implements Storage {
    private List<Employee> employees;

    public EmployeeStorage() {
        employees = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
        for (Employee emp : employees) {
            if (emp.getEmpno() == e.getEmpno()) {
                throw new EmployeeAlreadyExistsException("Employee with id " + e.getEmpno() + " already exists.");
            }
        }
        employees.add(e);
    }

    @Override
    public Employee getEmployee(int empno) throws EmployeeNotFoundException {
        for (Employee emp : employees) {
            if (emp.getEmpno() == empno) {
                return emp;
            }
        }
        throw new EmployeeNotFoundException("Employee with id " + empno + " not found.");
    }
}
