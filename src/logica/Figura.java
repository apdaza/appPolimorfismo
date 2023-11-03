/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Estudiantes
 */
public abstract class Figura implements IFigura {
    int area;
    int perimetro;
    Punto origen;
    Punto fin;

    public int getArea() {
        return area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public Punto getFin() {
        return fin;
    }

    public void setFin(Punto fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "{" + "area=" + area + ", perimetro=" + perimetro + ", origen=" + origen + ", fin=" + fin + '}';
    }
    
    
    
    
}
