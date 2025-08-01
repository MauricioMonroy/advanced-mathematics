package com.sena.algoritmo;

import java.util.Scanner;

public class FigurasGeometricasPlanas {

  public static void main(String[] args) {
    // Declaración de las variables que se van a utilizar
    int opcion;
    Scanner sc = new Scanner(System.in);

    // Menú que se muestra al usuario
    System.out.println("** Menú de figuras geométricas planas**");
    System.out.println("1. Rectángulo");
    System.out.println("2. Cuadrado");
    System.out.println("3. Triángulo");
    System.out.println("4. Círculo");
    System.out.println("5. Salir");

    // Se lee la opción del usuario
    System.out.print("Introduzca una opción: ");
    opcion = sc.nextInt();

    // Se realiza el cálculo del área y el perímetro según la opción elegida
    switch (opcion) {
      case 1 -> { // Rectángulo
        System.out.println("** Rectángulo **");
        System.out.print("Introduzca la base (en cm): ");
        float base = sc.nextFloat();
        System.out.print("Introduzca la altura (en cm): ");
        float altura = sc.nextFloat();
        float area = base * altura;
        float perimetro = 2 * (base + altura);
        System.out.println("Área (cm²): " + area);
        System.out.println("Perímetro (cm): " + perimetro);
      }
      case 2 -> { // Cuadrado
        System.out.println("** Cuadrado **");
        System.out.print("Introduzca el lado (en cm): ");
        float lado = sc.nextFloat();
        float areaCuadrado = lado * lado;
        float perimetroCuadrado = 4 * lado;
        System.out.println("Área (cm²): " + areaCuadrado);
        System.out.println("Perímetro (cm): " + perimetroCuadrado);
      }
      case 3 -> { // Triángulo (base y altura, perímetro solo si es isósceles)
        System.out.println("** Triángulo **");
        System.out.print("Introduzca la base (en cm): ");
        float baseTriangulo = sc.nextFloat();
        System.out.print("Introduzca la altura (en cm): ");
        float alturaTriangulo = sc.nextFloat();
        float areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.print("¿Desea calcular el perímetro? (s/n): ");
        char calcPerimetro = sc.next().toLowerCase().charAt(0);
        if (calcPerimetro == 's') {
          System.out.print("Introduzca el lado 1 (en cm): ");
          float lado1 = sc.nextFloat();
          System.out.print("Introduzca el lado 2 (en cm): ");
          float lado2 = sc.nextFloat();
          System.out.print("Introduzca el lado 3 (en cm): ");
          float lado3 = sc.nextFloat();
          float perimetroTriangulo = lado1 + lado2 + lado3;
          System.out.println("Área (cm²): " + areaTriangulo);
          System.out.println("Perímetro (cm): " + perimetroTriangulo);
        } else {
          System.out.println("Área (cm²): " + areaTriangulo);
        }
      }
      case 4 -> { // Círculo
        System.out.println("** Círculo **");
        System.out.print("Introduzca el radio (en cm): ");
        float radio = sc.nextFloat();
        float areaCirculo = (float) (Math.PI * Math.pow(radio, 2));
        float perimetroCirculo = (float) (2 * Math.PI * radio);
        System.out.println("Área (cm²): " + areaCirculo);
        System.out.println("Perímetro (cm): " + perimetroCirculo);
      }
      case 5 -> // Salir
      System.out.println("** Salida **");
      default -> System.out.println("Opción incorrecta");
    }
  }
}
