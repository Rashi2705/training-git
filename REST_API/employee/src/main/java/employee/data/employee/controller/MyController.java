package employee.data.employee.controller;

import employee.data.employee.Entities.Employee;
import employee.data.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {
    @Autowired
    private EmployeeService EmployeeService;


    //get the courses
    @GetMapping("/employees")
    public List<Employee> getEmployee(){

        return EmployeeService.getEmployee();
    }
    @GetMapping("/employees/{emp_id}")
    public Optional<Employee> getEmployee(@PathVariable("emp_id") long emp_id) {
        return this.EmployeeService.getEmployee(emp_id);
    }
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {

        return this.EmployeeService.addEmployee(employee);
    }
    // update course using PUT request
    @PutMapping("/employees")
    public Employee updateCourse(@RequestBody Employee employee) {
        return this.EmployeeService.updateEmployee(employee);
    }

    //delete the course
    @DeleteMapping("/employees/{emp_id}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String emp_id){
        try {
            this.EmployeeService.deleteEmployee(Long.parseLong(emp_id));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
