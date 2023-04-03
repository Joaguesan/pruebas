/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbus;

/**
 *
 * @author ausias
 */
public class InterUrbano extends Autobus {
    private float kilometros;

    public InterUrbano(int identificador, Conductor conductor, float precio,float kilometros) {
        super(identificador, conductor, precio);
        this.kilometros=kilometros;
        CalculoPrecio(kilometros);
    }
    private void CalculoPrecio(float kilometros){
        this.setPrecio(this.getPrecio()*kilometros);
    }

    @Override
    public String toString() {
        return "InterUrbano ( Kilometros: " + kilometros +") "+ super.toString();
    }

    public void setKilometros(float kilometros) {
        this.kilometros = kilometros;
        CalculoPrecio(kilometros);
    }

    public float getKilometros() {
        return kilometros;
    }
}
