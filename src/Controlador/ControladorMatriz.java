package Controlador;

import Modelo.*;
import javax.swing.JOptionPane;

public class ControladorMatriz extends ModeloMatriz {

    int matrizArrayA[][];
    int matrizArrayB[][];
    int matrizArrayC[][];
    int filasA;
    int columnasA;
    int filasB;
    int columnasB;
    //hola
    public ControladorMatriz() {
        super(0, 0, 0, 0);
    }

    public ControladorMatriz(int FilasA, int ColumanasA, int FilasB, int ColumanasB) {
        super(FilasA, ColumanasA, FilasB, ColumanasB);
    }


    public void Datos(int filasMA, int columnasMA, int filasMB, int columnasMB) {
        setFilasA(filasMA);
        setColumanasA(columnasMA);
        setFilasB(filasMB);
        setColumanasB(columnasMB);
        filasA = getFilasA();
        columnasA = getColumanasA();
        filasB = getFilasB();
        columnasB = getColumanasB();
    }

    public int[][] LlenarMatrizA() {
        /*filasAa = getFilasA();
        columnasAa = getColumanasA();
        System.out.println("Filas "+filasAa);
        System.out.println("Columnas "+columnasAa);*/

        matrizArrayA = new int[filasA][columnasA];

        for (int i = 0; i < matrizArrayA.length; i++) {
            for (int j = 0; j < matrizArrayA[i].length; j++) {
                matrizArrayA[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        return matrizArrayA;
    }

    public int[][] LlenarMatrizB() {
        /*filasBa = getFilasB();
        columnasBa = getColumanasB();*/

        matrizArrayB = new int[filasB][columnasB];

        for (int i = 0; i < matrizArrayB.length; i++) {
            for (int j = 0; j < matrizArrayB[i].length; j++) {
                matrizArrayB[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        return matrizArrayB;
    }

    public String ImprimirMatrizA() {
        String aux="";
        System.out.println("Matriz A:");
        for (int i = 0; i < matrizArrayA.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrizArrayA[i].length; j++) {
                aux += matrizArrayA[i][j];
                aux += "  ";
                System.out.print(matrizArrayA[i][j]);
                if (j != matrizArrayA[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
            aux += "\n";
        }
        System.out.println(" ");
        return aux;
    }

    public String ImprimirMatrizB() {
        String aux="";
        System.out.println("Matriz B:");
        for (int x = 0; x < matrizArrayB.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matrizArrayB[x].length; y++) {
                aux += matrizArrayB[x][y];
                aux += "  ";
                System.out.print(matrizArrayB[x][y]);
                if (y != matrizArrayB[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
            aux += "\n";
        }
        System.out.println(" ");
        return aux;
    }

    public String ImprimirMatrizC() {
        String resultado = "";
        for (int i = 0; i < matrizArrayC.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrizArrayC[i].length; j++) {
                resultado += matrizArrayC[i][j];
                resultado += "    ";
                System.out.print(matrizArrayC[i][j]);
                if (j != matrizArrayC[i].length - 1) {
                    System.out.print("\t");
                }
            }
            resultado += "\n";
            System.out.println("|");
        }
        System.out.println(" ");
        return resultado;
    }

    public void SumarMatrices() {
        if (columnasA == columnasB & filasA == filasB) {
            System.out.println("Suma:");
            matrizArrayC = new int[filasB][columnasA];
            for (int i = 0; i < matrizArrayC.length; i++) {
                for (int j = 0; j < matrizArrayC[i].length; j++) {
                    matrizArrayC[i][j] = matrizArrayA[i][j] + matrizArrayB[i][j];
                }
            }
        }else JOptionPane.showMessageDialog(null, "El numero de filas y columnas de la matriz A no coinciden con los de la matriz B");

    }

    public void RestarMatrices() {
        if (columnasA == columnasB & filasA == filasB) {
            System.out.println("Resta:");
            matrizArrayC = new int[filasB][columnasA];
            for (int i = 0; i < matrizArrayC.length; i++) {
                for (int j = 0; j < matrizArrayC[i].length; j++) {
                    matrizArrayC[i][j] = matrizArrayA[i][j] - matrizArrayB[i][j];
                }
            }
        }else JOptionPane.showMessageDialog(null, "El numero de filas y columnas de la matriz A no coinciden con los de la matriz B");
    }

    public void MultiplicarMatrices() {
        if (columnasA == filasB) {
            System.out.println("Multiplicacion:");
            matrizArrayC = new int[filasA][columnasB];
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasB; j++) {
                    for (int k = 0; k < columnasA; k++) {
                        matrizArrayC[i][j] += matrizArrayA[i][k] * matrizArrayB[k][j];
                    }
                }
            }
        }else JOptionPane.showMessageDialog(null, "El numero de columnas de la matriz A no coinciden con el numero de filas de la matriz B");
    }
    
    public void Transpuesta() {
        int aux;
        System.out.println("Transpuesta:");
        for (int i = 0; i < matrizArrayC.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = matrizArrayC[i][j];
                matrizArrayC[i][j] = matrizArrayC[j][i];
                matrizArrayC[j][i] = aux;
            }
        }
    }
}