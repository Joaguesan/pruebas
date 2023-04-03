/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionbus;

import static gestionbus.Utils.*;
import java.util.ArrayList;

/**
 *
 * @author ausias
 */
public class GestionBus {

    static ArrayList<Conductor> listaConductores = new ArrayList<>();
    static ArrayList<Autobus> flota = new ArrayList<>();
    static ArrayList<Urbano> flotaUrb = new ArrayList<>();
    static ArrayList<InterUrbano> flotaInter = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 6) {
            opcion = Menu("Alta de conductors",
                    "Alta d'autobusos",
                    "Comprar bitllet",
                    "Llistar autobusos",
                    "Llistar conductors", "Salir");
            Menus(opcion);
        }
    }

    public static void Menus(int opcion) {
        switch (opcion) {
            case 1:
                String nombre = llegirString("Nombre del conductor: ");
                float sueldo = pedirF("Salario: ");
                listaConductores.add(new Conductor(nombre, sueldo));
                break;
            case 2:
                AddBus();
                break;
            case 3:
                Autobus bus = MenuBus();
                System.out.println(bus.toString());
                break;
            case 4:
                for (Autobus a : flota) {
                    System.out.println(a.toString());
                }
                break;
            case 5:
                for (Conductor a : listaConductores) {
                    System.out.println(a.toString());
                }
                break;
            case 6:
                System.out.println("Listo");
                break;
        }
    }

    public static int MenuCond(ArrayList<Conductor> datos) {
        int opcio;
        int num = 1;
        System.out.println("--------------");
        System.out.println(num + ". Añadir conductor");
        for (Conductor a : datos) {
            num++;
            System.out.println(num + ". " + a.getNom());
        }
        System.out.println("");
        opcio = escollirOpcio(1, num, "Invalid");
        return opcio;
    }

    public static void AddBus() {
        System.out.println("Tipo de Autobus: ");
        int tipo = Menu("Urbano", "Interurbano");
        boolean disp = false;
        int id=0;
        while(!disp){
            id = pedirnum("Identificador: ");
            disp = VerDisponibilidad(id);
        }
        float precio = pedirF("Precio del billete: ");
        Conductor conductor = EscogerCond();
        if (tipo == 1) {
            Urbano a;
            System.out.println("-Bus Urbano-");
            String ruta = llegirString("Ruta: ");
            a = new Urbano(id, conductor, precio, ruta);
            flotaUrb.add(a);
            flota.add(a);
        } else {
            InterUrbano a;
            System.out.println("-Bus Interurbano-");
            float kilometro = pedirF("Kilometros: ");
            a = new InterUrbano(id, conductor, precio, kilometro);
            flota.add(a);
            flotaInter.add(a);
        }
    }

    public static Conductor EscogerCond() {
        System.out.println("--------------");
        System.out.println("Selecciona una conductor");
        int op = MenuCond(listaConductores);
        Conductor cond;
        if (op == 1) {
            String nombre = llegirString("Nombre del conductor: ");
            float sueldo = pedirF("Salario: ");
            cond = new Conductor(nombre, sueldo);
            listaConductores.add(cond);
            return cond;
        }
        return listaConductores.get(op - 2);
    }

    public static Autobus MenuBus() {
        System.out.println("--------------");
        int id = 0;
        Autobus bus=null;
        while (id > flota.size() || id < 1) {
            for (int i = 0; i < flota.size(); i++) {
                System.out.println("ID (" + flota.get(i).getIdentificador() + ")" + ". " + flota.get(i).toString());
            }
            id = pedirnum("Elige un autobus: ");
            for (int i = 0; i < flota.size(); i++) {
                if(flota.get(i).getIdentificador()==id){
                    bus=flota.get(i);
                }
            }
        }
        return bus;
    }
    public static boolean VerDisponibilidad(int identificador){
        boolean disp=true;
        for(Autobus a : flota){
            if(a.getIdentificador()==identificador){
                disp = false;
                System.out.println("Bus ya existente");
            }
        }
        return disp;
    }

}
