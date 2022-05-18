/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizinversa;

import static java.lang.Math.pow;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sleiner
 */
public class ControladorMatrizInversa {

    /**
     * @param args the command line arguments
     */
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public static int t;
    public static double[][] m = new double[t][t];
    public static double[][] mi = new double[t][t];
    public static double[][] inversa= new double[t][t];

    public static void main(String[] args) {
        // TODO code application logic here
        int band;
        t = fun_leerNumero("Ingrse el tamaño de las dimensiones de la matriz: ");
        m = fun_leerMatriz();
        inversa = fun_llenarMatriz();
        sub_mostrar("Original", m);
        mi = m;
        fun_matrizInversa();
        band = fun_comprobar();
        if (band == 1) {
            System.out.println("La matriz no tiene inversa");
        } else {
            //JOptionPane.showInputDialog(inversa);
            sub_mostrar("Inversa", inversa);
        }
    }
    

    public static int fun_leerNumero(String mensaje) {
        int num;
        do {
            System.out.println(mensaje);
            num = scan.nextInt();
        } while (num < 2);
        return num;
    }

    public static double[][] fun_leerMatriz() {
        double[][] matAux = new double[t][t];
        System.out.println("Ingrese los datos de la matriz: ");
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.println("Ingrese el dato: ");
                matAux[i][j] = scan.nextInt();
            }
        }
        return matAux;
    }

    public static double[][] fun_llenarMatriz() {
        double[][] matAux = new double[t][t];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (i == j) {
                    matAux[i][j] = 1;
                } else {
                    matAux[i][j] = 0;
                }
            }
        }
        return matAux;
    }

    public static void fun_matrizInversa() {
        fun_escalonarMatriz();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (mi[i][j] != 0) {
                    if (mi[i][j] != 1) {
                        fun_multiplicar_fila(i, (pow(mi[i][j], -1)));
                    }
                    fun_cerosArriba(i, j);
                    fun_cerosAbajo(i, j);
                    break;
                }
            }
        }
    }

    public static void fun_escalonarMatriz() {
        int[] V = new int[t * t];
        int j, ceros, bandera, aux;
        for (int i = 0; i < t; i++) {
            j = 0;
            ceros = 0;
            if (mi[i][j] == 0) {
                do {
                    j = j + 1;
                    ceros = ceros + 1;
                } while (mi[i][j] == 0);
            }
            V[i] = ceros;
        }
        do {
            bandera = 0;
            for (int i = 0; i < t - 1; i++) {
                if (V[i] > V[i + 1]) {
                    aux = V[i];
                    V[i] = V[i + 1];
                    V[i + 1] = aux;
                    fun_permutarFilas(i, i + 1);
                    bandera = 1;
                }
            }
        } while (bandera == 1);
    }

    public static void fun_permutarFilas(int f1, int f2) {
        double aux;
        for (int i = 0; i < t; i++) {
            aux = mi[f1][i];
            mi[f1][i] = mi[f2][i];
            mi[f2][i] = aux;
            aux = inversa[f1][i];
            inversa[f1][i] = inversa[f2][i];
            inversa[f2][i] = aux;
        }
    }

    public static void fun_multiplicar_fila(int f, double factor) {
        for (int i = 0; i < t; i++) {
            mi[f][i] = mi[f][i] * factor;
            inversa[f][i] = inversa[f][i] * factor;
        }
    }

    public static void fun_cerosArriba(int f, int c) {
        for (int i = 0; i < f; i++) {
            fun_sumarFilaMultiplicada(i, f, (mi[i][c] * (-1)));
        }
    }

    public static void fun_cerosAbajo(int f, int c) {
        for (int i = c + 1; i < t; i++) {
            fun_sumarFilaMultiplicada(i, f, (mi[i][c] * (-1)));
        }
    }

    public static void fun_sumarFilaMultiplicada(int f1, int f2, double factor) {
        for (int i = 0; i < t; i++) {
            mi[f1][i] = mi[f1][i] + (mi[f2][i] * factor);
            inversa[f1][i] = inversa[f1][i] + (inversa[f2][i] * factor);
        }
    }

    public static int fun_comprobar() {
        int bandera;
        bandera = 0;
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (i == j) {
                    if (mi[i][j] != 1) {
                        bandera = 1;
                    }
                } else {
                    if (mi[i][j] != 0) {
                        bandera = 1;
                    }
                }
            }
        }
        return bandera;
    }

    public static void sub_mostrar(String mensaje, double[][] mat) {
        System.out.println("Los datos de la matriz " + mensaje + " son: ");
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print("  " + mat[i][j]);
            }
            System.out.println("");
        }
    }
}