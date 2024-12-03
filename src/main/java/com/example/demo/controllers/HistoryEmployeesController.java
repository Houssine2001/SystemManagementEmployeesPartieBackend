package com.example.demo.controllers;

import com.example.demo.Repository.HistoryEmployeesRepo;
import com.example.demo.entities.HistoryEmployee;
import com.example.demo.entities.employee;
import com.example.demo.services.HistoryEmployeesService;
import com.example.demo.services.HistoryEmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/history")
public class HistoryEmployeesController {
    @Autowired
    private HistoryEmployeesService historyEmployeeService;


    // GET http://localhost:8081/api/history/employee/HOUSSINE
    @GetMapping("/employee/{idEmploye}")
    public List<HistoryEmployee> getHistoryByEmployeeId(@PathVariable String idEmploye) {
        return historyEmployeeService.getHistoryByEmployeeId(idEmploye);
    }

    @GetMapping("employee/allEmotions")
    //GET http://localhost:8081/api/history/employee/allEmotions
    public List<HistoryEmployee> getAllHistoryEmployees() {
        return historyEmployeeService.getAllHistoryEmployees();
    }

}
