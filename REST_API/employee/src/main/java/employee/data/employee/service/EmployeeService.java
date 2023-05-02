package employee.data.employee.service;

import employee.data.employee.Entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> getEmployee();

    public Optional<Employee> getEmployee(long parseLong);

    public Employee addEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(long parseLong);


}
