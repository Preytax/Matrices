/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

//import Modelo.*;
import Controlador.*;
import java.util.Scanner;

public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ControladorMatriz Cmat = new ControladorMatriz();
        //ModeloMatriz matA = new ModeloMatriz();
        //MatrizB matB = new MatrizB();

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese filas");
        int filasA = scan.nextInt();
        System.out.println("Ingrese columnas");
        int columnasA = scan.nextInt();
        System.out.println("Ingrese filas");
        int filasB = scan.nextInt();
        System.out.println("Ingrese columnas");
        int columnasB = scan.nextInt();

        /*matA.setFilasA(filasA);
        matA.setColumanasA(columnasA);
        matA.setFilasB(filasB);
        matA.setColumanasB(columnasB);*/
        //ControladorMatriz Cmat = new ControladorMatriz(filasA, columnasA, filasB, columnasB);
        Cmat.Datos(filasA, columnasA, filasB, columnasB);

        Cmat.LlenarMatrizA();
        Cmat.LlenarMatrizB();

        Cmat.ImprimirMatrizA();
        Cmat.ImprimirMatrizB();

        Cmat.SumarMatrices();
        Cmat.ImprimirMatrizC();

        //matA.MostarMatrizA();
        /*System.out.println("filas A: " + matA.getFilas());
        System.out.println("Columanas A: " + matA.getColumanas());
        
        System.out.println("filas B: " + matB.getFilas());
        System.out.println("Columanas B: " + matB.getColumanas());*/
    }
}
