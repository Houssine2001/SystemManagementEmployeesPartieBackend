package com.example.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "employees")
public class employee {
    @Id
   // @Field("employee_id")
    private String employeeId;
    private String nom;
    private String emotion;
    private String image;
    private String dateDerniereEmotion;

    // Getters et Setters
    public String getId() {
        return employeeId;
    }

    public void setId(String id) {
        this.employeeId = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDateDerniereEmotion() {
        return dateDerniereEmotion;
    }

    public void setDateDerniereEmotion(String dateDerniereEmotion) {
        this.dateDerniereEmotion = dateDerniereEmotion;
    }
}
