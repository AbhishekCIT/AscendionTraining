package labEx4.labEx4_App;

import java.util.ArrayList;
import java.util.List;

public class StorageImpl implements Storage{

    private List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    @Override
    public Employee getEmployee(int empNo) {
        for(Employee e: employees){
            if(e.getEmpNo() == empNo){
                return e;
            }
        }
        return null;
    }

    @Override
    public boolean updateEmployee(Employee ue) {
        for(int i=0; i<employees.size();i++){
            if(employees.get(i).getEmpNo() == ue.getEmpNo()){
                employees.set(i,ue);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteEmployee(int empNo) {
        for(int i=0; i<employees.size();i++){
            if(employees.get(i).getEmpNo() == empNo){
                employees.remove(i);
                return true;
            }
        }

        return false;
    }
}
