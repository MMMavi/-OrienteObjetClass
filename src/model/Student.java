/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Student {
    //attributs

    private String nom;
    private String prenom;

    
    // creer getter and setters ( avec clic droit insert code)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // creer constructeurs( avec clic droit insert code)

    public Student(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Student() {
    }
    
    
    
    
}