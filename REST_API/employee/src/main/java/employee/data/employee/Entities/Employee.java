package employee.data.employee.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name=" Employee_details")
public class Employee {


    @Id
    private long emp_id;
    private String name;
    private String email;

public Employee(){

}

    public Employee(long emp_id, String name,String email) {
        this.emp_id = emp_id;
        this.name=name;
        this.email=email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmail() {
        return email;
    }

   public void setEmail(String email){
        this.email=email;
    }

    @Override
    public String toString() {
       

        return "Employee{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
