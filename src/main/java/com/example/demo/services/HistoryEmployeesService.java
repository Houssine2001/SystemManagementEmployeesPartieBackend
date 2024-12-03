package com.example.demo.services;

import com.example.demo.Repository.HistoryEmployeesRepo;
import com.example.demo.entities.HistoryEmployee;
import com.example.demo.entities.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryEmployeesService {

    @Autowired
    private HistoryEmployeesRepo historyEmployeeRepository;

    // Récupérer l'historique d'émotions par idEmploye
    public List<HistoryEmployee> getHistoryByEmployeeId(String idEmploye) {
        return historyEmployeeRepository.findByEmployeeId(idEmploye);
    }

    // Obtenir tous les employés
    public List<HistoryEmployee> getAllHistoryEmployees() {
        return historyEmployeeRepository.findAll();
    }
}
