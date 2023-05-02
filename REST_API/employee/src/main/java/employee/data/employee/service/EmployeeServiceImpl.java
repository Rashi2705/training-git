package employee.data.employee.service;

import employee.data.employee.Dao.EmployeeDao;
import employee.data.employee.Entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired

    private EmployeeDao employeedao;
    @Override
    public List<Employee> getEmployee() {

        return employeedao.findAll();
    }

    @Override
    public Optional<Employee> getEmployee(long emp_Id) {

        return employeedao.findById(emp_Id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employeedao.save(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        employeedao.save(employee);
        return employee;

    }

    @Override
    public void deleteEmployee(long parseLong) {
        Employee entity= employeedao.getOne(parseLong);
        employeedao.delete(entity);
    }
}
