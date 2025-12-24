package controller;

public class CuadradoMagico {

    int n;
    int[][] cuadrado;
    long intentos = 0;

    public void rellenarCuadrado(){
        int[] numeros = new int [n*n];
        for (int i = 0; i < n*n; i++) {
            numeros[i]=i+1;
        }

        for (int i = numeros.length-1; i > 0; i--) {
            int aleatorio = (int) (Math.random()*(i+1));
            int temporal = numeros[i];
            numeros[i] = numeros[aleatorio];
            numeros[aleatorio]=temporal;
        }

        int numAleatorios = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cuadrado[i][j] = numeros[numAleatorios++];
            }
        }
    }
    public int constanteMagica(){
        int constante = 0;
        for (int i = 0; i < n; i++) {
            constante += cuadrado[0][i];
        }
        return constante;
    }
    private boolean comprobarFilas(int constante){
        for (int i = 0; i < n; i++) {
            int suma = 0;
            for (int j = 0; j < n; j++) {
                suma += cuadrado[i][j];
            }
            if (suma != constante){
                return false;
            }
        }
        return true;
    }

    private boolean comprobarColumnas(int constante){
        for (int j = 0; j < n; j++) {
            int suma = 0;
            for (int i = 0; i < n; i++) {
                suma += cuadrado[i][j];
            }
            if(suma != constante){
                return false;
            }
        }
        return true;
    }

    private boolean comprobarDiagonalPrincipal(int constante){
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += cuadrado[i][i];
        }
        return suma == constante;
    }

    private boolean comprobarDiagonalSecundaria(int constante){
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += cuadrado[i][n-1-i];
        }
        return suma == constante;
    }

    private boolean esCuadradoMagico(){
        int constante = constanteMagica();
        return comprobarFilas(constante)
                && comprobarColumnas(constante)
                && comprobarDiagonalPrincipal(constante)
                && comprobarDiagonalSecundaria(constante);
    }

    public void comprobarCuadrado(){
        do{
            rellenarCuadrado();
            intentos++;
        }while(!esCuadradoMagico());
    }

    public void mostrarCuadrado(){
        for (int[] fila : cuadrado) {
            for (int item : fila) {
                System.out.printf("%d\t", item);

            }
            System.out.println();
        }
    }

}
