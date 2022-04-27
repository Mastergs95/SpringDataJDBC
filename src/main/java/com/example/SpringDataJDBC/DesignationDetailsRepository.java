package com.example.SpringDataJDBC;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationDetailsRepository extends CrudRepository<DesignationDetails, Long> {


}
