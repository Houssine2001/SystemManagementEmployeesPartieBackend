package com.example.demo.controllers;

import com.example.demo.entities.employee;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    //POST http://localhost:8081/api/employees/add
    public employee addEmployee(@RequestBody employee employee) {
        return employeeService.addEmployee(employee);
    }

   /* @GetMapping("/{id}")
    //GET http://localhost:8081/api/employees/674a192d0d55598bb09c475c
    public employee getEmployeeById(@PathVariable String id) {
        employee employe = employeeService.getEmployeeById(id);
        if (employe == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
        return employe;
    }*/


    @GetMapping("/{id}")
    public ResponseEntity<employee> getEmployeeById(@PathVariable String id) {
        employee employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }





    @GetMapping("/name/{nom}")
    //GET http://localhost:8081/api/employees/name/Houssine
    public employee getEmployeeByNom(@PathVariable String nom) {
        return employeeService.getEmployeeByNom(nom);
    }

    @DeleteMapping("/delete/{id}")
    //DELETE http://localhost:8081/api/employees/delete/674a192d0d55598bb09c475c
    public void deleteEmployeeById(@PathVariable String id) {
        employeeService.deleteEmployeeById(id);
    }

    @PutMapping("/update")
    //PUT http://localhost:8081/api/employees/update
    public employee updateEmployee(@RequestBody employee employee) {
        return employeeService.updateEmployee(employee);
    }


    @GetMapping("/all")
    //GET http://localhost:8081/api/employees/all
    public List<employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }


}
