/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_10.Entidades;

import java.util.Arrays;

/**
 *
 * @author droa
 */
public class arregloReales {
    
    // Atributos
    
    private float [] reales;
    private int longitud;
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    
    // Constructor

    public arregloReales() {
    }

    public arregloReales(int longitud) {
        //this.reales = reales;
        this.reales = new float[longitud];
        this.longitud = longitud;
        
    }
    
    // Métodos

    public float[] getReales() {
        return reales;
    }

    public void setReales(float[] reales) {
        this.reales = reales;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public void rellenarAleatorio(){
        for(int i=0;i<reales.length;i++){
            reales[i]=(float)(Math.random()*(50-1))+1;    
        }
        //Arrays.fill(reales, 0, reales.length, (float)Math.random());
    }
    public void mostrarArreglo(){
        
        System.out.println(ANSI_CYAN+Arrays.toString(reales)+ANSI_RESET);
        
    }

    public void ordenarArreglo(){
        Arrays.sort(this.reales);
        
    }
    
    
    
}
