/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciascontrol;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando J. López L.
 */
public class Consola extends javax.swing.JInternalFrame {

    /**
     * Creates new form Consola
     */
    public Consola() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lEjer1 = new javax.swing.JLabel();
        lEjer2 = new javax.swing.JLabel();
        bRealizar2 = new javax.swing.JButton();
        bRealizar1 = new javax.swing.JButton();
        lEjer3 = new javax.swing.JLabel();
        bRealizar3 = new javax.swing.JButton();
        lEjer4 = new javax.swing.JLabel();
        bRealizar4 = new javax.swing.JButton();
        lEjer5 = new javax.swing.JLabel();
        bRealizar5 = new javax.swing.JButton();
        lEjer6 = new javax.swing.JLabel();
        bRealizar6 = new javax.swing.JButton();
        lEjer7 = new javax.swing.JLabel();
        bRealizar7 = new javax.swing.JButton();
        lEjer8 = new javax.swing.JLabel();
        bRealizar8 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Ejercicios de consola");

        lEjer1.setText("1. Solicite el tamaño de un DD en TB y muestre su tamaño en bytes");

        lEjer2.setText("2. Calcule el residuo de una división entre dos números enteros");

        bRealizar2.setText("Realizar");
        bRealizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar2ActionPerformed(evt);
            }
        });

        bRealizar1.setText("Realizar");
        bRealizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar1ActionPerformed(evt);
            }
        });

        lEjer3.setText("3. Calcule el total a pagar de una venta de 4 productos, incluya IVA y descuento");

        bRealizar3.setText("Realizar");
        bRealizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar3ActionPerformed(evt);
            }
        });

        lEjer4.setText("4. Descomponga una cifra de 5 dígitos en sus dígitos individuales");

        bRealizar4.setText("Realizar");
        bRealizar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar4ActionPerformed(evt);
            }
        });

        lEjer5.setText("5. Calcule la raíz cuadrada de un número dado");

        bRealizar5.setText("Realizar");
        bRealizar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar5ActionPerformed(evt);
            }
        });

        lEjer6.setText("6. Calcule la tabla de verdad del Y (lógico) usando valores booleanos ");

        bRealizar6.setText("Realizar");
        bRealizar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar6ActionPerformed(evt);
            }
        });

        lEjer7.setText("7. Lea 6 caracteres e imprima la concatenación de estos");

        bRealizar7.setText("Realizar");
        bRealizar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar7ActionPerformed(evt);
            }
        });

        lEjer8.setText("8. Muestre la fecha del sistema ");

        bRealizar8.setText("Realizar");
        bRealizar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer1)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer2)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer3)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer4)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer5)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer6)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer7)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer8)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar8)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer1)
                    .addComponent(bRealizar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer2)
                    .addComponent(bRealizar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer3)
                    .addComponent(bRealizar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer4)
                    .addComponent(bRealizar4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer5)
                    .addComponent(bRealizar5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer6)
                    .addComponent(bRealizar6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer7)
                    .addComponent(bRealizar7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer8)
                    .addComponent(bRealizar8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRealizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar2ActionPerformed
        // Calcule el residuo de la division de 2 numeros
        int n1, n2;
        float res;
        Scanner myInput = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        n1 = myInput.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = myInput.nextInt();
        ConsolaOps ops = new ConsolaOps();
        res = ops.residuo(n1, n2);
        System.out.println("La respuesta es: " + res);
    }//GEN-LAST:event_bRealizar2ActionPerformed

    private void bRealizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar1ActionPerformed
        // Solicite el tamaño de un DD en TB y muestre su tamaño en bytes}
        int TB;
        Scanner myInput = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su DD en TB: ");
        TB = myInput.nextInt();
        ConsolaOps ops = new ConsolaOps();
        double bts = ops.bytes(TB);
        System.out.println("El tamaño de su DD en bytes es: " + bts);
    }//GEN-LAST:event_bRealizar1ActionPerformed

    private void bRealizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar3ActionPerformed
        // Calcule el total a pagar de una venta de 4 productos, incluya IVA y descuento
        float precio1, precio2, precio3, precio4;
        int iva, descuento;
        Scanner myInput = new Scanner(System.in);
        System.out.println("Ingrese el precio del primer producto: ");
        precio1 = myInput.nextInt();
        System.out.println("Ingrese el precio del segundo producto: ");
        precio2 = myInput.nextInt();
        System.out.println("Ingrese el precio del tercer producto: ");
        precio3 = myInput.nextInt();
        System.out.println("Ingrese el precio del cuarto producto: ");
        precio4 = myInput.nextInt();
        System.out.println("Ingrese el porcentaje de su IVA: ");
        iva = myInput.nextInt();
        System.out.println("Ingrese el porcentaje de su descuento: ");
        descuento = myInput.nextInt();
        ConsolaOps ops = new ConsolaOps();
        float total = ops.total_compra(precio1, precio2, precio3, precio4, iva, descuento);
        System.out.println("El total de su compra es: " + total);
    }//GEN-LAST:event_bRealizar3ActionPerformed

    private void bRealizar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar4ActionPerformed
        // Descomponga una cifra de 5 dígitos en sus dígitos individuales
        int num;
        Scanner myInput = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea evaluar (de 5 digitos): ");
        num = myInput.nextInt();
        ConsolaOps ops = new ConsolaOps();
        if (ops.tamanio(num)) {
            String resp = ops.separar_digitos(num);
            System.out.println("Este numero separado en digitos es: " + resp);
        } else {
            System.out.println("El numero que ingreso no es de 5 digitos >:(");
        }


    }//GEN-LAST:event_bRealizar4ActionPerformed

    private void bRealizar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar5ActionPerformed
        // Calcule la raíz cuadrada de un número dado
        double num;
        Scanner myInput = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea evaluar: ");
        num = myInput.nextDouble();
        ConsolaOps ops = new ConsolaOps();
        double resp = ops.raiz(num);
        System.out.println(resp);

    }//GEN-LAST:event_bRealizar5ActionPerformed

    private void bRealizar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar6ActionPerformed
        // Calcule la tabla de verdad del Y (lógico) usando valores booleanos (conjuncion, es verdadero si ambos lo son)
        ConsolaOps ops = new ConsolaOps();
        ops.tablaY();
        
    }//GEN-LAST:event_bRealizar6ActionPerformed

    private void bRealizar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar7ActionPerformed
        // Lea 6 caracteres e imprima la concatenación de estos
        char c1, c2, c3, c4, c5, c6;
        Scanner myInput = new Scanner(System.in);
        System.out.println("Ingrese el primer caracter: ");
        c1 = myInput.next().charAt(0);
        System.out.println("Ingrese el segundo caracter: ");
        c2 = myInput.next().charAt(0);
        System.out.println("Ingrese el tercer caracter: ");
        c3 = myInput.next().charAt(0);
        System.out.println("Ingrese el cuarto caracter: ");
        c4 = myInput.next().charAt(0);
        System.out.println("Ingrese el quinto caracter: ");
        c5 = myInput.next().charAt(0);
        System.out.println("Ingrese el sexto caracter: ");
        c6 = myInput.next().charAt(0);
        ConsolaOps ops = new ConsolaOps();
        String resp = ops.concatenar(c1, c2, c3, c4, c5, c6);
        System.out.println("Sus caracteres concatenados son: " + resp);

    }//GEN-LAST:event_bRealizar7ActionPerformed

    private void bRealizar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar8ActionPerformed
        // Muestre la fecha del sistema 
        ConsolaOps ops = new ConsolaOps();
        ops.fecha();
    }//GEN-LAST:event_bRealizar8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRealizar1;
    private javax.swing.JButton bRealizar2;
    private javax.swing.JButton bRealizar3;
    private javax.swing.JButton bRealizar4;
    private javax.swing.JButton bRealizar5;
    private javax.swing.JButton bRealizar6;
    private javax.swing.JButton bRealizar7;
    private javax.swing.JButton bRealizar8;
    private javax.swing.JLabel lEjer1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JLabel lEjer6;
    private javax.swing.JLabel lEjer7;
    private javax.swing.JLabel lEjer8;
    // End of variables declaration//GEN-END:variables
}
