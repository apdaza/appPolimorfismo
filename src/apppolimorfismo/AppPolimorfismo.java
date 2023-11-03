/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apppolimorfismo;

import logica.*;

/**
 *
 * @author Estudiantes
 */
public class AppPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura f = new Circulo();
        f.setOrigen(new Punto());
        f.setFin(new Punto(10, 10));
        
        calcularPropiedadesFigura(f);
        
        System.out.println(f);

    }
    
    public static void calcularPropiedadesFigura(Figura f){
        f.calcularArea();
        f.calcularPerimetro();
    }
    
}
