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
      case 1 -> {
        // Rectángulo
        System.out.println("** Rectángulo **");
        // Se pide al usuario la base y la altura del rectángulo
        System.out.print("Introduzca la base: ");
        int base = sc.nextInt();
        System.out.print("Introduzca la altura: ");
        int altura = sc.nextInt();
        // Se calcula el área y el perímetro
        float area = base * altura;
        int perimetro = 2 * base + 2 * altura;
        // Se muestran los resultados
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
      }
      case 2 -> {
        // Cuadrado
        System.out.println("** Cuadrado **");
        // Se pide al usuario el lado del cuadrado
        System.out.print("Introduzca el lado: ");
        int lado = sc.nextInt();
        // Se calcula el área y el perímetro
        float areaCuadrado = lado * lado;
        int perimetroCuadrado = 4 * lado;
        // Se muestran los resultados
        System.out.println("Área: " + areaCuadrado);
        System.out.println("Perímetro: " + perimetroCuadrado);
      }
      case 3 -> {
        // Triángulo
        System.out.println("** Triángulo **");
        // Se pide al usuario la base y la altura del triángulo
        System.out.print("Introduzca la base: ");
        int baseTriangulo = sc.nextInt();
        System.out.print("Introduzca la altura: ");
        int alturaTriangulo = sc.nextInt();
        // Se calcula el área y el perímetro
        float areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        int perimetroTriangulo = baseTriangulo + alturaTriangulo + baseTriangulo;
        // Se muestran los resultados
        System.out.println("Área: " + areaTriangulo);
        System.out.println("Perímetro: " + perimetroTriangulo);
      }
      case 4 -> {
        // Círculo
        System.out.println("** Círculo **");
        // Se pide al usuario el radio del círculo
        System.out.print("Introduzca el radio: ");
        float radio = sc.nextFloat();
        // Se calcula el área y el perímetro
        float areaCirculo = (float) (Math.PI * Math.pow(radio, 2));
        float perimetroCirculo = (float) (2 * Math.PI * radio);
        // Se muestran los resultados
        System.out.println("Área: " + areaCirculo);
        System.out.println("Perímetro: " + perimetroCirculo);
      }
      case 5 -> // Salir
      System.out.println("** Salida **");
      default -> System.out.println("Opción incorrecta");
    }
  }
}
