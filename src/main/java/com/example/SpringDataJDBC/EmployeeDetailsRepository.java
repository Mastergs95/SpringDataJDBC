package com.example.SpringDataJDBC;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDetailsRepository extends CrudRepository<EmployeeDetails, Long> {

    @Query("Select * from EmployeeDetails")
    List<EmployeeDetails> findAll();

    @Query("Select * from EmployeeDetails where employeeId=:employeeId")
    List<EmployeeDetails> findById (@Param("employeeId") int employeeId);
}
