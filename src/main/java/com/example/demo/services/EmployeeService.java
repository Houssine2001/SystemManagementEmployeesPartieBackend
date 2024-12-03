package com.example.demo.services;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.entities.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;



    // Ajouter un employe
    public employee addEmployee(employee employee) {
        return employeeRepository.save(employee);
    }

    // Obtenir un employé par son ID
    public employee getEmployeeById(String id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // Obtenir un employé par son nom
    public employee getEmployeeByNom(String nom) {
        return employeeRepository.findByNom(nom);
    }

    //Supprimer un employé par son ID
    public void deleteEmployeeById(String id) {
        employeeRepository.deleteById(id);
    }

    // Mettre à jour un employé
    public employee updateEmployee(employee employee) {
        return employeeRepository.save(employee);
    }

    // Obtenir tous les employés
    public List<employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


}
