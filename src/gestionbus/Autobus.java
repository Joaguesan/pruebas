/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbus;

/**
 *
 * @author ausias
 */
public abstract class Autobus {
    private int identificador;
    private Conductor conductor;
    private float precio;

    @Override
    public String toString() {
        return "Autobus{" + "identificador=" + identificador + ", conductor=" + conductor + ", precio=" + precio + '}';
    }

    public Autobus(int identificador, Conductor conductor, float precio) {
        this.identificador = identificador;
        this.conductor = conductor;
        this.precio = precio;
    }

    public int getIdentificador() {
        return identificador;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
}
