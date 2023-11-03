/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Estudiantes
 */
public class Rectangulo extends Figura {

    @Override
    public void calcularArea() {
        Punto temp = new Punto(this.origen.x, this.fin.y);
        int base = this.fin.calcularDistancia(temp);
        int altura = this.origen.calcularDistancia(temp);
        this.area = base * altura;
    }

    @Override
    public void calcularPerimetro() {
        Punto temp = new Punto(this.origen.x, this.fin.y);
        int base = this.fin.calcularDistancia(temp);
        int altura = this.origen.calcularDistancia(temp);
        this.perimetro = base * 2 + altura * 2;
    }

    @Override
    public String toString() {
        return "Rectangulo" + super.toString();
    }
    
    
    
}
