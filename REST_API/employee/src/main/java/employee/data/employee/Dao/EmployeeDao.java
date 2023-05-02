package employee.data.employee.Dao;

import employee.data.employee.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Long> {

}
