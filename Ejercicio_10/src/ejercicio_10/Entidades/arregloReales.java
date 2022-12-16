/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_10.Entidades;

/**
 *
 * @author droa
 */
public class arregloReales {
    
    // Atributos
    
    private float [] reales;
    private int longitud;
    
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
    
    
    
    
}
