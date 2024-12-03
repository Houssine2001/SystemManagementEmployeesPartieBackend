package com.example.demo.Repository;

import com.example.demo.entities.HistoryEmployee;
import com.example.demo.entities.employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HistoryEmployeesRepo extends MongoRepository<HistoryEmployee, String> {
    List<HistoryEmployee> findByEmployeeId(String employeeId);

}
