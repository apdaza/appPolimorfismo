/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


/**
 *
 * @author Estudiantes
 */
public class Punto {
    int x;
    int y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calcularDistancia(Punto p){
        int distancia = (int) sqrt(pow((this.x - p.x), 2) +pow((this.y - p.y), 2));
        return distancia;
    }
    
    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
    
}
