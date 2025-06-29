import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Ingreso de valores con validación
        System.out.println("Ingresa valores entre 0 y 45:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                int valor = teclado.nextInt();

                if (valor < 0 && valor > 45) {
                    System.out.println(" Error: el número debe estar entre 0 y 45. Programa terminado.");
                    teclado.close();
                    return; ///  se sale del programa si el numerro es incorrecto, osea es mayor a 45
                }

                matriz[i][j] = valor;
            }
        }

        // Mostrar las suma de las filas y todas las colummnas 
        int[] sumaFilas = new int[3];
        int[] sumaColumnas = new int[3];

        System.out.println( "suma de las filas ");
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
                sumaFila += matriz[i][j];
                sumaColumnas[j] += matriz[i][j]; // columna j
            }
            sumaFilas[i] = sumaFila;
            System.out.println("= " + sumaFila + " (fila " + i + ")");
        }

        // Mostrar suma de columnas
        System.out.println("Suma de columnas:");
        for (int j = 0; j < 3; j++) {
            System.out.println("Columna " + j + ": " + sumaColumnas[j]);
        }

        // Ingresar el numero del objeto
        System.out.print("Ingrese un número objetivo para asi buscar suma: ");
        int objetivo = teclado.nextInt();

        // Buscar en filas
        boolean encontrado = false;
        for (int i = 0; i < 3; i++) {
            if (sumaFilas[i] == objetivo) {
                System.out.println("La fila " + i + " suma " + objetivo);
                encontrado = true;
            }
        }

        // Buscar en columnas
        for (int j = 0; j < 3; j++) {
            if (sumaColumnas[j] == objetivo) {
                System.out.println("La columna " + j + " suma " + objetivo);
                encontrado = true;
            }
        }
   // sie l numer ingresado no se encuntra en la suma de la matriz
        if (!encontrado) {
            System.out.println(" Ninguna fila o columna suma " + objetivo);
        }

        teclado.close();
    }
}




