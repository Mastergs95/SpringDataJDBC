package com.example.SpringDataJDBC;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTechnologyRepository extends CrudRepository<EmployeeTechnology, Long> {

    @Query("Select * from EmployeeDetails " + "where firstName=:firstName and lastName=:lastName")
    EmployeeDetails findEmployeeByName(@Param("firstName") String firstName,
                                       @Param("lastName") String lastName);

    @Query("Select * from TechnologyDetails " + "where technologyName=:technologyName")
    TechnologyDetails findTechnologyByName(@Param("technologyName") String technologyName);
}
