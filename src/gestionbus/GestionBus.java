/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionbus;
import static gestionbus.Utils.Menu;
import java.util.ArrayList;
/**
 *
 * @author ausias
 */
public class GestionBus {
    static ArrayList<Conductor> listaCon = new ArrayList<>();
    static ArrayList<Conductor> flota = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = Menu( "Alta de conductors",
"Alta d'autobusos",
"Comprar bitllet",
"Llistar autobusos",
"Llistar conductors");
    }
    public static void Menus(int opcion){
        
    }
    
}
