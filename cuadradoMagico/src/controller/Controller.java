package controller;

import java.util.Scanner;

public class Controller {

    Scanner scanner = new Scanner(System.in);
    CuadradoMagico cuadradoMagico = new CuadradoMagico();

    public void iniciarCuadrado(){
        System.out.println("Introduce el tamaño de la matriz (n): ");
        pedirTamanio();
        crearCuadrado();
        comprobarCuadrado();
        System.out.println("\n========== CUADRADO MÁGICO ENCONTRADO ==========");
        mostrarCuadrado();
        System.out.println("================================================\n");
        System.out.printf("Constante mágica: %d\n", cuadradoMagico.constanteMagica());
        System.out.printf("Número de intentos realizados: %d\n", cuadradoMagico.intentos);
    }

    public void pedirTamanio(){
        cuadradoMagico.n = scanner.nextInt();
    }

    public void comprobarCuadrado(){
        cuadradoMagico.comprobarCuadrado();
    }

    public void crearCuadrado(){
        cuadradoMagico.cuadrado = new int[cuadradoMagico.n][cuadradoMagico.n];
    }

    public void mostrarCuadrado(){
        cuadradoMagico.mostrarCuadrado();
    }

}
