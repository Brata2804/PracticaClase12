
package com.mycompany.practicagit;

import java.util.Scanner;

public class AreaFiguras {

    public static void main(String[] args) {
        int numero1, numero2,numero3;
        Scanner sc = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();
        Rombo rombo = new Rombo();
        Cuadrado cuadrado1 = new Cuadrado();
        rectangulo.setNombrefigura("Rectangulo");
        rectangulo.setNumero1(12);
        rectangulo.setNumero2(5);
        rectangulo.MostrarInformacion();
        rectangulo.CalculoArea();
        System.out.println("");
        rombo.setNombrefigura("Rombo");
        rombo.setNumero1(25);
        rombo.setNumero2(17);
        rombo.MostrarInformacion();
        rombo.CalculoArea();
        System.out.println("");
        cuadrado1.setNombrefigura("Cuadrado");
        cuadrado1.setNumero1(10);
        cuadrado1.setNumero2(10);
        cuadrado1.MostrarInformacion();
        cuadrado1.CalculoArea();
        System.out.println();
        Cuadrado Cuadrado2 = new Cuadrado();
        System.out.println("Digite el lado del cuadrado: ");
        numero1 = sc.nextInt();
        Cuadrado2.setNombrefigura("Cuadrado");
        Cuadrado2.setNumero1(numero1);
        Cuadrado2.setNumero2(numero1);
        Cuadrado2.MostrarInformacion();
        Cuadrado2.CalculoArea();
    }
}