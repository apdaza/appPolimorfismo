/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 *
 * @author Estudiantes
 */
public class Circulo extends Figura {

    @Override
    public void calcularArea() {
        int radio = this.origen.calcularDistancia(this.fin);
        this.area = (int) (PI * pow(radio, 2));
    }

    @Override
    public void calcularPerimetro() {
        int radio = this.origen.calcularDistancia(this.fin);
        this.perimetro = (int) (2 * PI * radio);
    }

    @Override
    public String toString() {
        return "Circulo" + super.toString();
    }
    
    

}
