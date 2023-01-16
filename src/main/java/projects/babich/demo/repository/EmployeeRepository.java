package projects.babich.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.babich.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
