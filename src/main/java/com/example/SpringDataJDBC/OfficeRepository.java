package com.example.SpringDataJDBC;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OfficeRepository extends CrudRepository<Office, Long> {

    List<Office> findByCity(String cityName);

    List<Office> findByCapacity(int capacity);

    List<Office> findByCityAndCapacity(String city,int capacity);

    List<Office> findByCityOrCapacity(String city,int capacity);

    List<Office> findByCapacityGreaterThan(int capacity);

    List<Office> findByCapacityGreaterThanEqualOrderByCapacity(int capacity);

    List<Office> findByCapacityBetween(int lower, int upper);

    List<Office> findByLeaseExpirationBefore(Date leaseExpiry);

    List<Office> findByLeaseExpirationBetween(Date start, Date end);

    Office findFirstByOrderByLeaseExpiration();

    Office findFirstByCityOrderByLeaseExpiration(String city);





}
