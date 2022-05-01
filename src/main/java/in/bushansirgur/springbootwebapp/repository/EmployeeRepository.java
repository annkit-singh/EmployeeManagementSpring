package in.bushansirgur.springbootwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.bushansirgur.springbootwebapp.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}	
