package com.example.demo.Repository;

import com.example.demo.entities.employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<employee, String> {
    // Tu peux ajouter des méthodes spécifiques à la requête ici, par exemple :
    employee findByNom(String nom);
}