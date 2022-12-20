/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_10.Servicio;

import ejercicio_10.Entidades.arregloReales;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class servicioArregloReales {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public arregloReales crearArregloReales(){
        System.out.println("Inicialización del Arreglo");
        System.out.print("Ingrese longitud del Arreglo: ");
        return new arregloReales(leer.nextInt());
        
    }
    public void copiarArreglo(arregloReales array_o,arregloReales array_f,int m) {
        for(int i=0;i<array_o.getLongitud();i++){
            if(i<m){
                array_f.getReales()[i]=array_o.getReales()[i];
            }else if(i<array_f.getLongitud()){
                array_f.getReales()[i]=0.5f;
            }
        }
    }
    
}
