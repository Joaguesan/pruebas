/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbus;

/**
 *
 * @author ausias
 */
public class Conductor {
    private String nom;
    private float salari;

    public Conductor(String nom, float salari) {
        this.nom = nom;
        this.salari = salari;
    }
    @Override
    public String toString() {
        return "Conductor{" + "nom=" + nom + ", salari=" + salari + '}';
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSalari(float salari) {
        this.salari = salari;
    }

    public String getNom() {
        return nom;
    }

    public float getSalari() {
        return salari;
    }

}
