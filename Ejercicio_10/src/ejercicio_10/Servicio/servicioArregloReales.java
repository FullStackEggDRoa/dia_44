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
        System.out.println("Inicialización de Arreglo números Aleatorios");
        float[] reales;
        System.out.println("Ingrese longitud de Arreglo: ");
        return new arregloReales(leer.nextInt());
    }
    
    
}
