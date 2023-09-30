package com.sena.algoritmo;

import java.util.Scanner;

public class VolumenSolidoIrregular {

  public static void main(String[] args) {
    // Se declaran las variables que se van a utilizar
    Scanner sc = new Scanner(System.in);

    // Se pide al usuario la función que describe la superficie del sólido
    System.out.print("Introduzca la función que describe la superficie del sólido: ");
    String funcion = sc.nextLine();

    // Se pide al usuario la altura del sólido
    System.out.print("Introduzca la altura del sólido: ");
    float altura = sc.nextFloat();

    // Se calcula el volumen del sólido
    float volumen = calcularVolumen(funcion, altura);

    // Se muestra el resultado
    System.out.println("Volumen: " + volumen);
  }

  private static float calcularVolumen(String funcion, float altura) {
    // Se declaran las variables que se van a utilizar
    float dx = 0.01f; // Paso de integración
    float V = 0.0f; // Volumen

    // Se integra la función que describe la superficie del sólido
    for (float x = 0.0f; x <= altura; x += dx) {
      // Se calcula el área de la sección transversal
      float area = f(x);

      // Se calcula el volumen de la sección transversal
      float volumenSeccion = area * dx;

      // Se suma el volumen de la sección transversal al volumen total
      V += volumenSeccion;
    }

    return V;
  }

  private static float f(float x) {
    // Esta función es una función genérica que puede representar la superficie de cualquier sólido
    // irregular
    return x * x;
  }
}
