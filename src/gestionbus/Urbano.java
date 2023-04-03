/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbus;

/**
 *
 * @author ausias
 */
public class Urbano extends Autobus {
    private String ruta;

    public Urbano(int identificador, Conductor conductor,float precio,String ruta) {
        super(identificador, conductor,precio);
        this.ruta=ruta;
        CalculoPrecio(ruta);
    }
    private void CalculoPrecio(String ruta){
        float precio=this.getPrecio();
        if(ruta.equalsIgnoreCase("A"))
            this.setPrecio(precio+=(this.getPrecio()*0.1f));
        else
            this.setPrecio(precio+=(this.getPrecio()*0.2f));
    }

    @Override
    public String toString() {
        return "Urbano (Ruta: " + ruta +") "+ super.toString();
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
        CalculoPrecio(ruta);
    }

    public String getRuta() {
        return ruta;
    }
}
