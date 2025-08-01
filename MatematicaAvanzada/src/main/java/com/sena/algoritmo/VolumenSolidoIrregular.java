package com.sena.algoritmo;

import java.util.Scanner;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class VolumenSolidoIrregular {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el tipo de función para el área de la sección transversal:");
        System.out.println("1. Constante (ejemplo: 25) - Sólido con sección igual en toda la altura");
        System.out.println("2. Lineal (ejemplo: 2*x + 5) - Sólido que se ensancha o estrecha linealmente");
        System.out.println("3. Cuadrática (ejemplo: x*x + 2*x + 1) - Sólido con variación cuadrática");
        System.out.println("4. Personalizada (ingrese su propia función en x)");
        System.out.print("Ingrese el número de opción: ");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        String funcionEjemplo = switch (opcion) {
            case 1 -> "25";
            case 2 -> "2*x + 5";
            case 3 -> "x*x + 2*x + 1";
            default -> "";
        };

        if (!funcionEjemplo.isEmpty()) {
            System.out.println("Ejemplo de función sugerida: " + funcionEjemplo);
        }
        System.out.print("Introduzca la función que describe el área de la sección transversal (en términos de x): ");
        String funcion = sc.nextLine();

        System.out.print("Introduzca la altura del sólido (en cm): ");
        float altura = sc.nextFloat();

        System.out.print("Introduzca la unidad de medida (ej: cm): ");
        String unidad = sc.next();

        float volumen = calcularVolumen(funcion, altura);

        System.out.println("Volumen (" + unidad + "³): " + volumen);
    }

    private static float calcularVolumen(String funcion, float altura) {
        float dx = 0.01f;
        float V = 0.0f;

        Expression expr = new ExpressionBuilder(funcion)
                .variable("x")
                .build();

        for (float x = 0.0f; x <= altura; x += dx) {
            expr.setVariable("x", x);
            float area = (float) expr.evaluate();
            float volumenSeccion = area * dx;
            V += volumenSeccion;
        }

        return V;
    }
}