
package com.mycompany.practicagit;


public class Rombo extends Figura2D{
    private double numero1, numero2;
    private String nombrefigura;

    Rombo() {
        numero1 = 0;
        numero2 = 0;
        nombrefigura = "";
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public String getNombrefigura() {
        return nombrefigura;
    }

    public void setNombrefigura(String nombrefigura) {
        this.nombrefigura = nombrefigura;
    }
    
    public void MostrarInformacion() {
        System.out.println("Tipo de Figura: " + nombrefigura + "\nDiagonal 1: " + numero1 + "\nDiagonal 2: " + numero2);
    }

    public void CalculoArea() {
        System.out.println("El area del rombo es: " + (numero1 * numero2)/2);
    }
}
