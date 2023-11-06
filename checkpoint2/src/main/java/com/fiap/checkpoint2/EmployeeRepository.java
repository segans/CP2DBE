package com.fiap.checkpoint2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findBySalaryBetween(double minSalary, double maxSalary);

    @Query("SELECT e FROM Employee e WHERE e.department.id = :departmentId")
    List<Employee> findEmployeesInDepartment(@Param("departmentId") Long departmentId);

    @Query(value = "SELECT AVG(e.salary) FROM Employee e WHERE e.department_id = :departmentId", nativeQuery = true)
    Double findAverageSalaryByDepartment(@Param("departmentId") Long departmentId);
}
