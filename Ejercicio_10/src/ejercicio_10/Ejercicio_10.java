/*
    Ejercicio 10:
    Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
    de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
    programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
    Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
    ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
    0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
    20.
 */
package ejercicio_10;

import ejercicio_10.Entidades.arregloReales;
import ejercicio_10.Servicio.servicioArregloReales;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicioArregloReales sar = new servicioArregloReales();
       
        System.out.println("Creación de Arreglo A");
        arregloReales Reales_Array_50= sar.crearArregloReales();
        System.out.println("Creación de Arreglo B");
        arregloReales Reales_Array_20= sar.crearArregloReales();
        System.out.println("Rellenando Arreglo A - Con Números Aleatorios ..");
        Reales_Array_50.rellenarAleatorio();
        Reales_Array_50.mostrarArreglo();
        System.out.println("Ordenando Arreglo A (menor a mayor)");
        Reales_Array_50.ordenarArreglo();
        Reales_Array_50.mostrarArreglo();
        System.out.println("Copiando Valores de Arreglo A a B");
        sar.copiarArreglo(Reales_Array_50, Reales_Array_20, 10);
        Reales_Array_20.mostrarArreglo();
    }
    
}
