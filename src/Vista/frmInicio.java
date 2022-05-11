/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.*;
import Controlador.*;
import javax.swing.JOptionPane;
public class frmInicio extends javax.swing.JFrame {
    ModeloMatriz matA = new ModeloMatriz();
    ControladorMatriz Cmat = new ControladorMatriz();
    /**
     * Creates new form Inicio
     */
    public frmInicio() {
        initComponents();
        tpMatrizA.disable();
        tpMatrizB.disable();
        tpMatrizC.disable();
                
    }
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEstablecerMatriz = new javax.swing.JButton();
        spnrColumnasA = new javax.swing.JSpinner();
        spnrFilasA = new javax.swing.JSpinner();
        spnrFilasB = new javax.swing.JSpinner();
        spnrColumnasB = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSumar = new javax.swing.JButton();
        btnTranspuesta = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tpMatrizA = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tpMatrizB = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tpMatrizC = new javax.swing.JTextPane();

        jTextField1.setText("jTextField1");

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jTabbedPane1.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dimension de la matriz A");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");

        btnEstablecerMatriz.setBackground(new java.awt.Color(0, 102, 102));
        btnEstablecerMatriz.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEstablecerMatriz.setForeground(new java.awt.Color(255, 255, 255));
        btnEstablecerMatriz.setText("Establecer matriz");
        btnEstablecerMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstablecerMatrizActionPerformed(evt);
            }
        });

        spnrColumnasA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        spnrFilasA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        spnrFilasB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        spnrColumnasB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dimension de la matriz B");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spnrFilasB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spnrColumnasB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spnrFilasA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spnrColumnasA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEstablecerMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnrColumnasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnrFilasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnrColumnasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnrFilasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addComponent(btnEstablecerMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dimensiones", jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        btnSumar.setBackground(new java.awt.Color(0, 102, 102));
        btnSumar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSumar.setForeground(new java.awt.Color(255, 255, 255));
        btnSumar.setText("Sumar");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnTranspuesta.setBackground(new java.awt.Color(0, 102, 102));
        btnTranspuesta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnTranspuesta.setForeground(new java.awt.Color(255, 255, 255));
        btnTranspuesta.setText("Transpuesta");
        btnTranspuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranspuestaActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Rango");

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Determinante");

        btnMultiplicar.setBackground(new java.awt.Color(0, 102, 102));
        btnMultiplicar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Inversa");

        btnRestar.setBackground(new java.awt.Color(0, 102, 102));
        btnRestar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnRestar.setForeground(new java.awt.Color(255, 255, 255));
        btnRestar.setText("Restar");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTranspuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSumar)
                        .addGap(30, 30, 30)
                        .addComponent(btnMultiplicar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnRestar)
                        .addGap(33, 33, 33)
                        .addComponent(btnTranspuesta)
                        .addGap(2, 2, 2)
                        .addComponent(jButton7)))
                .addGap(4, 4, 4)
                .addComponent(jButton4)
                .addGap(4, 4, 4)
                .addComponent(jButton5)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Operaciones", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 255));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 255));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 255));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Matriz B");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Matriz A");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PROCEDIMIENTO");

        tpMatrizA.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jScrollPane4.setViewportView(tpMatrizA);

        tpMatrizB.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jScrollPane5.setViewportView(tpMatrizB);

        tpMatrizC.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jScrollPane3.setViewportView(tpMatrizC);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(114, 114, 114)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel7)))
                        .addGap(63, 63, 63))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Procedimiento", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTranspuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranspuestaActionPerformed
        try {
            Cmat.Transpuesta();
            try {
                //Cmat.ImprimirMatrizC();
                tpMatrizC.setText("\nMATRIZ TRANSPUESTA: \n"+
                "\nLa matriz traspuesta es la acción de seleccionar las filas de la matriz original y "
                +"reescribirlas como columnas en la nueva matriz e invertir el proceso para las columnas."
                +"eneralmente cuando cambiamos las filas por columnas y las columnas por filas lo indicamos añadiendo un superíndice T.\n"
                +"\nZ₍nxm₎ = \n"
                +"\t|Z₁₁\t···\tZ₁m \t|\n"
                +"\t|·  \t· \t·  \t| -> \n" 
                +"\t|Zn₁ \t···\tZnxm\t|\n"
                +"Transpuesta:\n"
                +"Zt₍mxn₎ = \n"
                +"\t|Z₁₁\t···\tZ₁n \t|\n"
                +"\t|·  \t· \t·  \t|\n" 
                +"\t|Zm₁ \t···\tZmxn\t|\n"  
                +"\nDada una matriz Z cualquiera con n filas y m columnas podemos construir la matriz traspuesta, ZT, que tendrá m filas y n columnas.\n"
                +"\nEntonces empezaremos con nuestra solucion. para que funcione nuestra matriz A primeramente tenemos que realizar algun proceso de antemano"
                +"Puesto que estamos utilizando 2 matrices.\n"
                +"Los valores de la matriz A son:\n-----\n"
                +Cmat.ImprimirMatrizA()+"-----"
                +"\nLos valores de la matriz B son:\n-----\n"
                +Cmat.ImprimirMatrizB()+"-----"
                +"\nLuego realiza la operacion seleccionada y se implementa la matriz Transpuesta\n-----\n"
                +Cmat.ImprimirMatrizC()+"-----"          
                );
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error 0100: Problema al imprimir la matriz");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 0204: Hubo un error al realizar la transpuesta");
        }        
    }//GEN-LAST:event_btnTranspuestaActionPerformed

    private void btnEstablecerMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstablecerMatrizActionPerformed
        //Matriz mat = new ModeloMatriz();
        //mat.ImprimirMatriz() = null;
        Integer filasA = (Integer)spnrFilasA.getValue();
        Integer columnasA = (Integer)spnrColumnasA.getValue();
        Integer filasB = (Integer)spnrFilasB.getValue();
        Integer columnasB = (Integer)spnrColumnasB.getValue();
        
        if (filasA > 0 && columnasA > 0 && filasB > 0 && columnasB > 0) {
            /*matA.setFilasA(filasA);
            matA.setColumanasA(columnasA);
            matA.setFilasB(filasB);
            matA.setColumanasB(columnasB);*/

            Cmat.Datos(filasA, columnasA, filasB, columnasB);

            /*System.out.println(" filas A: "+ matA.getFilasA());
            System.out.println(" Columanas A: "+ matA.getColumanasA());
            System.out.println(" filas B: "+ matA.getFilasB());
            System.out.println(" Columanas B: "+ matA.getColumanasB());*/


            Cmat.LlenarMatrizA();
            Cmat.LlenarMatrizB();

            tpMatrizA.setText(Cmat.ImprimirMatrizA());
            tpMatrizB.setText(Cmat.ImprimirMatrizB());
            /*Cmat.ImprimirMatrizA();
            Cmat.ImprimirMatrizB();*/
        }else JOptionPane.showMessageDialog(null, "Ingrese valores validos");
        
    }//GEN-LAST:event_btnEstablecerMatrizActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        //Matriz mat = new ModeloMatriz();
        try {
            //mat.ImprimirMatrizC() = null;
            Cmat.SumarMatrices();
            try {
                //Cmat.ImprimirMatrizC();
                tpMatrizC.setText("SUMA DE MATRICES: \n"
                        +"\nLa suma de matrices son operaciónes lineales que unifican los "
                        +"elementos de las matrices estas deben tener la misma posicion y el mismo orden. "
                        +"El resultado obtenido es posible dado que todos tienen la misma posición(mismos numeros de subíndice). "
                        +"Si fuera distinta no se podrian sumar. \n"
                        +"\nEmpezando con el procedimiento tenemos que tener en cuenta los valores de ambas matrices:"
                        +"\nPara la Matriz A los valores recogidos fueron:\n-----\n"+Cmat.ImprimirMatrizA()+"-----"
                        +"\nPara la Matriz B los valores recogidos fueron:\n-----\n"+Cmat.ImprimirMatrizB()+"-----"
                        +"\nCon estos datos vamos a realizar la operacion con matrices respectiva."
                        +"En nuestro caso vamos a realizar una suma de matrices por lo que vamos a guiarnos "
                        +"de la siguiente formula:\n"
                        +"Z₍₃x₃₎ + X₍₃x₃₎ = \n"
                        +"\t|Z₁₁\tZ₁₂\tZ₁₃\t|\tX₁₁\tX₁₂\tX₁₃|\n"
                        +"\t|Z₂₁\tZ₂₂\tZ₂₃\t+\tX₂₁\tX₂₂\tX₂₃|=\n"
                        +"\t|Z₃₁\tZ₃₂\tZ₃₃\t|\tX₃₁\tX₃₂\tX₃₃|\n"
                        + "Finalmente, el resultado de la suma sera:\n"       
                        +"\t|Z₁₁+X₁₁\tZ₁₂+X₁₂\tZ₁₃+X₁₃|\n"
                        +"\t|Z₂₁+X₂₁\tZ₂₂+X₂₂\tZ₂₃+X₂₃|\n"
                        +"\t|Z₃₁+X₃₁\tZ₃₂+X₃₂\tZ₃₃+X₃₃|\n"
                        +"Teniendo en cuenta este procedimiento el resultado obtenido al sumar "
                        +"nuestra Matriz A con la Matriz B es:\n----------\n"+Cmat.ImprimirMatrizC()+"----------");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error 0100: Problema al imprimir la matriz");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 0201: Hubo un error al realizar la suma, verifique las matrices");
        }
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        try {
            //mat.ImprimirMatrizC() = null;
            Cmat.RestarMatrices();
            try {
                //Cmat.ImprimirMatrizC();
                tpMatrizC.setText("RESTA DE MATRICES: \n"
                        +"\nLa resta de matrices es una operación lineal que unifican los "
                        +"elementos de las matrices estas deben tener la misma posicion y el mismo orden. "
                        +"El resultado obtenido es posible dado que todos tienen la misma posición(mismos numeros de subíndice). "
                        +"Si fuera distinta no se podrian restar. \n"
                        +"\nEmpezando con el procedimiento tenemos que tener en cuenta los valores de ambas matrices:"
                        +"\nPara la Matriz A los valores recogidos fueron:\n-----\n"+Cmat.ImprimirMatrizA()+"-----"
                        +"\nPara la Matriz B los valores recogidos fueron:\n-----\n"+Cmat.ImprimirMatrizB()+"-----"
                        +"\nCon estos datos vamos a realizar la operacion con matrices respectiva."
                        +"En nuestro caso vamos a realizar una resta de matrices por lo que vamos a guiarnos "
                        +"de la siguiente formula:\n"
                        +"Z₍₃x₃₎ - X₍₃x₃₎ = \n"
                        +"\t|Z₁₁\tZ₁₂\tZ₁₃\t|\tX₁₁\tX₁₂\tX₁₃|\n"
                        +"\t|Z₂₁\tZ₂₂\tZ₂₃\t-\tX₂₁\tX₂₂\tX₂₃|=\n"
                        +"\t|Z₃₁\tZ₃₂\tZ₃₃\t|\tX₃₁\tX₃₂\tX₃₃|\n"
                        + "Finalmente, vamos a realizar la operacion de esta forma:\n"       
                        +"\t|Z₁₁-X₁₁\tZ₁₂-X₁₂\tZ₁₃-X₁₃|\n"
                        +"\t|Z₂₁-X₂₁\tZ₂₂-X₂₂\tZ₂₃-X₂₃|\n"
                        +"\t|Z₃₁-X₃₁\tZ₃₂-X₃₂\tZ₃₃-X₃₃|\n"
                        +"Haciendo uso de la formula ya podremos hallar la solucion de nuestra operacion. "
                        +"El resultado de la resta de ambas matrices es: "+Cmat.ImprimirMatrizC());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error 0100: Problema al imprimir la matriz");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 0202: Hubo un error al realizar la resta, verifique las matrices");
        }
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        try {
            Cmat.MultiplicarMatrices();
            try {
                //Cmat.ImprimirMatrizC();
                tpMatrizC.setText("MULTIPLICACION DE MATRICES: \n"
                        +"\nLa multiplicacion de matrices es unificar las matrices en una sola matriz mediante la "
                        +"multiplicación y suma de los elementos de las filas y columnas de las matrices origen "
                        +"teniendo en cuenta el orden de los factores. \n"
                        +"Z₍nxm₎ · Y₍nxm₎ = ZY₍nxm₎\n"
                        +"\nPodemos multiplicar las matrices anteriores si el número de las filas de la matriz Z "
                        +"es igual al número de columnas de la matriz Y.\nEs decir, Zn = Ym.\n"
                        +"\nEmpezando con el procedimiento vamos a observar los valores de ambas matrices:\n"
                        +"En la matriz A:\n-----\n"+Cmat.ImprimirMatrizA()+"-----"
                        +"\nEn la matriz B:\n-----\n"+Cmat.ImprimirMatrizB()+"-----"
                        +"\nSe tiene que comprobar que el numero de las columnas de la primera matriz coincide con los numeros "
                        +"de las filas de la segunda matriz.\n"
                        +"luego de esto multiplicamos los elementos de las columnas de la matriz A por cada elemento de las filas "
                        +"de la matriz B.\n"
                        +"Podemos guiarnos de la siguiente formula:"
                        +"Z₍nxm₎ * Y₍nxm₎ = \n"
                        +"|Z₁₁\t···\tZ₁m \t | \tY₁₁ \t··· \tY₁m \t|\n"
                        +"|·  \t· \t·  \t * \t·  \t·   \t·   \t|\n"
                        +"|Zn₁ \t···\tZnm\t | \tYn₁\t··· \tYnm \t|\n"
                        +"Finalmente, tendremos el siguiente resultado:\n"
                        +"|Z₁₁*Y₁₁+...+Z₁m*Yn₁\t···\tZ₁m*Y₁m+...+Z₁m*Ynm |\n"
                        +"|\t\t                \t·\t\t\t·             |\n"
                        +"|Zn₁*Y₁₁+...+Znm*Yn₁\t···\tZn1*Y₁m+...+Znm*Ynm|\n"

                        +"\nEl resultado de la multiplicacion de ambas matrices es:\n "+Cmat.ImprimirMatrizC());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error 0100: Problema al imprimir la matriz");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error 0203: Hubo un error al realizar la multiplicacion, verifique las matrices");
        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstablecerMatriz;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnTranspuesta;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JSpinner spnrColumnasA;
    private javax.swing.JSpinner spnrColumnasB;
    private javax.swing.JSpinner spnrFilasA;
    private javax.swing.JSpinner spnrFilasB;
    private javax.swing.JTextPane tpMatrizA;
    private javax.swing.JTextPane tpMatrizB;
    private javax.swing.JTextPane tpMatrizC;
    // End of variables declaration//GEN-END:variables
}