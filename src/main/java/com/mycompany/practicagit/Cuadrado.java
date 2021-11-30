
package com.mycompany.practicagit;


public class Cuadrado extends Figura2D {
    private int numero1 , numero2;
    private String nombrefigura;

    Cuadrado() {
        numero1 = 0;
        numero2 = 0;
        nombrefigura = "";
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
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
        System.out.println("Tipo de Figura: " + nombrefigura + "\nLado: " + numero1);
    }

    public void CalculoArea() {
        System.out.println("El area del rectangulo es: " + numero1 * numero2);
    }
}
