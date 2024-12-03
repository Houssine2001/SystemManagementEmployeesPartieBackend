package com.example.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "emotionHistory") // Nom de la collection MongoDB
public class HistoryEmployee {

    @Id
    private String id; // ID unique généré par MongoDB ou spécifié manuellement

    private String employeeId; // ID de l'employé
    private String nom; // Nom de l'employé
    private String emotion; // Emotion de l'employé
    private String dateEmotion; // Date et heure de l'émotion
    private double emotionScore; // Score de l'émotion

    // Constructeur sans arguments
    public HistoryEmployee() {
    }

    // Constructeur avec arguments
    public HistoryEmployee(String idEmploye, String nom, String emotion, String dateEmotion, double emotionScore) {
        this.employeeId = idEmploye;
        this.nom = nom;
        this.emotion = emotion;
        this.dateEmotion = dateEmotion;
        this.emotionScore = emotionScore;
    }

    // Getters et setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdEmploye() {
        return employeeId;
    }

    public void setIdEmploye(String idEmploye) {
        this.employeeId = idEmploye;
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

    public String getDateEmotion() {
        return dateEmotion;
    }

    public void setDateEmotion(String dateEmotion) {
        this.dateEmotion = dateEmotion;
    }

    public double getEmotionScore() {
        return emotionScore;
    }

    public void setEmotionScore(double emotionScore) {
        this.emotionScore = emotionScore;
    }

    @Override
    public String toString() {
        return "HistoryEmployee{" +
                "id='" + id + '\'' +
                ", idEmploye='" + employeeId + '\'' +
                ", nom='" + nom + '\'' +
                ", emotion='" + emotion + '\'' +
                ", dateEmotion=" + dateEmotion +
                ", emotionScore=" + emotionScore +
                '}';
    }
}
