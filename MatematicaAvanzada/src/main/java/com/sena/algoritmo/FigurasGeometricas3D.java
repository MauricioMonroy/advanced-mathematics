package com.sena.algoritmo;

import java.util.Scanner;

public class FigurasGeometricas3D {

    public static void main(String[] args) {
        // Se declaran las variables que se van a utilizar
        int opcion;
        Scanner sc = new Scanner(System.in);

        // Se muestra el menú al usuario
        System.out.println("** Menú de figuras geométricas en 3D**");
        System.out.println("1. Tetraedro");
        System.out.println("2. Cubo");
        System.out.println("3. Octaedro");
        System.out.println("4. Dodecaedro");
        System.out.println("5. Icosaedro");
        System.out.println("6. Cilindro");
        System.out.println("7. Cono");
        System.out.println("8. Tronco de cono");
        System.out.println("9. Esfera");
        System.out.println("10. Salir");

        // Se lee la opción del usuario
        System.out.print("Introduzca una opción: ");
        opcion = sc.nextInt();

        // Se realiza el cálculo del área y el volumen según la opción elegida
        switch (opcion) {
            case 1 -> { // Tetraedro
                System.out.println("** Tetraedro **");
                System.out.print("Introduzca la arista (en cm): ");
                float arista = sc.nextFloat();
                float areaTetraedro = (float) (Math.sqrt(3) * Math.pow(arista, 2));
                float volumenTetraedro = (float) ((Math.sqrt(2) / 12) * Math.pow(arista, 3));
                System.out.println("Área (cm²): " + areaTetraedro);
                System.out.println("Volumen (cm³): " + volumenTetraedro);
            }
            case 2 -> { // Cubo
                System.out.println("** Cubo **");
                System.out.print("Introduzca el lado (en cm): ");
                float lado = sc.nextFloat();
                float areaCubo = (float) (6 * Math.pow(lado, 2));
                float volumenCubo = (float) Math.pow(lado, 3);
                System.out.println("Área (cm²): " + areaCubo);
                System.out.println("Volumen (cm³): " + volumenCubo);
            }
            case 3 -> { // Octaedro
                System.out.println("** Octaedro **");
                System.out.print("Introduzca la arista (en cm): ");
                float aristaOctaedro = sc.nextFloat();
                float areaOctaedro = (float) (2 * Math.sqrt(2) * Math.pow(aristaOctaedro, 2));
                float volumenOctaedro = (float) ((2 * Math.sqrt(2) / 3) * Math.pow(aristaOctaedro, 3));
                System.out.println("Área (cm²): " + areaOctaedro);
                System.out.println("Volumen (cm³): " + volumenOctaedro);
            }
            case 4 -> { // Dodecaedro
                System.out.println("** Dodecaedro **");
                System.out.print("Introduzca la arista (en cm): ");
                float aristaDodecaedro = sc.nextFloat();
                float areaDodecaedro = (float) (3 * Math.sqrt(3) * Math.pow(aristaDodecaedro, 2));
                float volumenDodecaedro = (float) ((5 * Math.sqrt(2) / 12) * Math.pow(aristaDodecaedro, 3));
                System.out.println("Área (cm²): " + areaDodecaedro);
                System.out.println("Volumen (cm³): " + volumenDodecaedro);
            }
            case 5 -> { // Icosaedro
                System.out.println("** Icosaedro **");
                System.out.print("Introduzca la arista (en cm): ");
                float aristaIcosaedro = sc.nextFloat();
                float areaIcosaedro = (float) (5 * Math.sqrt(3) * Math.pow(aristaIcosaedro, 2));
                float volumenIcosaedro = (float) ((5 * Math.sqrt(5) / 12) * Math.pow(aristaIcosaedro, 3));
                System.out.println("Área (cm²): " + areaIcosaedro);
                System.out.println("Volumen (cm³): " + volumenIcosaedro);
            }
            case 6 -> { // Cilindro
                System.out.println("** Cilindro **");
                System.out.print("Introduzca el radio (en cm): ");
                float radioCilindro = sc.nextFloat();
                System.out.print("Introduzca la altura (en cm): ");
                float alturaCilindro = sc.nextFloat();
                float areaCilindro = (float) (2 * Math.PI * radioCilindro * alturaCilindro + 2 * Math.PI * Math.pow(radioCilindro, 2));
                float volumenCilindro = (float) (Math.PI * Math.pow(radioCilindro, 2) * alturaCilindro);
                System.out.println("Área (cm²): " + areaCilindro);
                System.out.println("Volumen (cm³): " + volumenCilindro);
            }
            case 7 -> { // Cono
                System.out.println("** Cono **");
                System.out.print("Introduzca el radio (en cm): ");
                float radioCono = sc.nextFloat();
                System.out.print("Introduzca la altura (en cm): ");
                float alturaCono = sc.nextFloat();
                // Calcular la generatriz
                float generatriz = (float) Math.sqrt(Math.pow(radioCono, 2) + Math.pow(alturaCono, 2));
                // Calcular área y volumen
                float areaCono = (float) (Math.PI * radioCono * (radioCono + generatriz));
                float volumenCono = (float) ((1.0 / 3) * Math.PI * Math.pow(radioCono, 2) * alturaCono);
                System.out.println("Área (cm²): " + areaCono);
                System.out.println("Volumen (cm³): " + volumenCono);
            }
            case 8 -> { // Tronco de cono
                System.out.println("** Tronco de cono **");
                System.out.print("Introduzca el radio mayor (en cm): ");
                float radioMayor = sc.nextFloat();
                System.out.print("Introduzca el radio menor (en cm): ");
                float radioMenor = sc.nextFloat();
                System.out.print("Introduzca la altura (en cm): ");
                float altura = sc.nextFloat();
                // Calcular la generatriz
                float generatriz = (float) Math.sqrt(Math.pow(radioMayor - radioMenor, 2) + Math.pow(altura, 2));
                // Calcular áreas
                float areaBaseMayor = (float) (Math.PI * Math.pow(radioMayor, 2));
                float areaBaseMenor = (float) (Math.PI * Math.pow(radioMenor, 2));
                float areaLateral = (float) (Math.PI * (radioMayor + radioMenor) * generatriz);
                float areaTotal = areaBaseMayor + areaBaseMenor + areaLateral;
                // Calcular volumen
                float volumen = (float) ((1.0 / 3) * Math.PI * altura * (Math.pow(radioMayor, 2) + Math.pow(radioMenor, 2) + radioMayor * radioMenor));
                System.out.println("Área total (cm²): " + areaTotal);
                System.out.println("Volumen (cm³): " + volumen);
            }
            case 9 -> { // Esfera
                System.out.println("** Esfera **");
                System.out.print("Introduzca el radio (en cm): ");
                float radio = sc.nextFloat();
                float area = (float) (4 * Math.PI * Math.pow(radio, 2));
                float volumen = (float) ((4.0 / 3) * Math.PI * Math.pow(radio, 3));
                System.out.println("Área (cm²): " + area);
                System.out.println("Volumen (cm³): " + volumen);
            }
            case 10 -> // Salir
                    System.out.println("** Salida **");
            default -> System.out.println("Opción incorrecta");
        }
    }
}
