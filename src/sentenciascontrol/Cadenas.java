/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciascontrol;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando J. López L.
 */
public class Cadenas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadenas
     */
    public Cadenas() {
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

        lEncabezado = new javax.swing.JLabel();
        lInstruc = new javax.swing.JLabel();
        lEjer1 = new javax.swing.JLabel();
        bRealizar1 = new javax.swing.JButton();
        tfCadena = new javax.swing.JTextField();
        lEjer2 = new javax.swing.JLabel();
        bRealizar2 = new javax.swing.JButton();
        lEjer3 = new javax.swing.JLabel();
        bRealizar3 = new javax.swing.JButton();
        tfCaracter = new javax.swing.JTextField();
        lEjer4 = new javax.swing.JLabel();
        tfSubcadena1 = new javax.swing.JTextField();
        bRealizar4 = new javax.swing.JButton();
        lEjer5 = new javax.swing.JLabel();
        bRealizar5 = new javax.swing.JButton();
        tfSubcadena2 = new javax.swing.JTextField();
        lEjer6 = new javax.swing.JLabel();
        tfSubcadena3 = new javax.swing.JTextField();
        bRealizar6 = new javax.swing.JButton();
        lInstruc1 = new javax.swing.JLabel();
        lEjer7 = new javax.swing.JLabel();
        tfSubcadena4 = new javax.swing.JTextField();
        bRealizar7 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Operaciones con cadenas");

        lEncabezado.setText("La salida de cada operación deberá ser mostrada mediante cuadros de diálogo");

        lInstruc.setText("Con la cadena digitada a continuación");

        lEjer1.setText("1. Calcule su longitud");

        bRealizar1.setText("Realizar");
        bRealizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar1ActionPerformed(evt);
            }
        });

        lEjer2.setText("2. Imprima cada caracter de la cadena por separado");

        bRealizar2.setText("Realizar");
        bRealizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar2ActionPerformed(evt);
            }
        });

        lEjer3.setText("3. Calcule la moda del caracter");

        bRealizar3.setText("Realizar");
        bRealizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar3ActionPerformed(evt);
            }
        });

        lEjer4.setText("4. Verifique si la siguiente subcadena existe");

        bRealizar4.setText("Realizar");
        bRealizar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar4ActionPerformed(evt);
            }
        });

        lEjer5.setText("5. Concatene la cadena dada con");

        bRealizar5.setText("Realizar");
        bRealizar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar5ActionPerformed(evt);
            }
        });

        lEjer6.setText("6. Verifique si la siguiente cadena es mayor");

        bRealizar6.setText("Realizar");
        bRealizar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar6ActionPerformed(evt);
            }
        });

        lInstruc1.setText("realice:");

        lEjer7.setText("7. Compare con la siguiente cadena");

        tfSubcadena4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSubcadena4ActionPerformed(evt);
            }
        });

        bRealizar7.setText("Realizar");
        bRealizar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizar7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lEncabezado)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lInstruc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lInstruc1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer1)
                        .addGap(3, 3, 3)
                        .addComponent(bRealizar1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer3)
                        .addGap(4, 4, 4)
                        .addComponent(tfCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRealizar3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lEjer4)
                                .addGap(4, 4, 4)
                                .addComponent(tfSubcadena1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lEjer2)
                                .addGap(3, 3, 3)
                                .addComponent(bRealizar2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRealizar4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer5)
                        .addGap(2, 2, 2)
                        .addComponent(tfSubcadena2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRealizar5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer6)
                        .addGap(4, 4, 4)
                        .addComponent(tfSubcadena3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRealizar6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer7)
                        .addGap(4, 4, 4)
                        .addComponent(tfSubcadena4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRealizar7)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lEncabezado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lInstruc)
                    .addComponent(tfCadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lInstruc1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(bRealizar3)
                    .addComponent(tfCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer4)
                    .addComponent(bRealizar4)
                    .addComponent(tfSubcadena1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer5)
                    .addComponent(bRealizar5)
                    .addComponent(tfSubcadena2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer6)
                    .addComponent(bRealizar6)
                    .addComponent(tfSubcadena3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer7)
                    .addComponent(bRealizar7)
                    .addComponent(tfSubcadena4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRealizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar1ActionPerformed
        // Calcular longitud de la cadena
        try {
            String cadena = tfCadena.getText();
            Frases op = new Frases();
            int longitud = op.calc_len(cadena);
            String resp = String.valueOf(longitud);
            String mensaje = "El tamaño de la cadena es de " + resp + " caracteres";
            JOptionPane.showMessageDialog(this, mensaje,
                    "RESULTADO",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bRealizar1ActionPerformed

    private void bRealizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar2ActionPerformed
        // Mostrar cada caracter por separado
        String cadena = tfCadena.getText();
        Frases op = new Frases();
        String separadas = op.separacion(cadena);
        String mensaje = "La cadena separada por caracteres es " + separadas;
        JOptionPane.showMessageDialog(this, mensaje,
                "RESULTADO",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bRealizar2ActionPerformed

    private void bRealizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar3ActionPerformed
        // Calcular la moda de un caracter
        String cadena = tfCadena.getText();
        char letra = (tfCaracter.getText()).charAt(0);
        Frases op = new Frases();
        int modaTotal = op.moda(cadena, letra);
        String resp = Integer.toString(modaTotal);
        JOptionPane.showMessageDialog(this, "La moda del caracter '" + letra + "' es: " + modaTotal,
                    "RESULTADO",
                    JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bRealizar3ActionPerformed

    private void bRealizar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar4ActionPerformed
        // Comprobar si subcadena existe dentro de la cadena principal
        String cadena = tfCadena.getText();
        String subcadena = tfSubcadena1.getText();
        Frases op = new Frases();
        boolean contiene = op.subcadena(cadena, subcadena);
        if (contiene) {
            JOptionPane.showMessageDialog(this, "Si esta contenida",
                    "RESULTADO",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No esta contenida",
                    "RESULTADO",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bRealizar4ActionPerformed

    private void bRealizar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar5ActionPerformed
        // Concatenar la cadena principal con otra cadena (agrega un espacio entre las cadenas) 
        String cadena = tfCadena.getText();
        String subcadena = tfSubcadena2.getText();
        Frases op = new Frases();
        String concatenada = op.concatenar(cadena, subcadena);
        JOptionPane.showMessageDialog(this, "La cadena final es: " + concatenada,
                "RESULTADO",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bRealizar5ActionPerformed

    private void bRealizar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar6ActionPerformed
        // Verificar si la cadena 2 es mayor a la cadena 1 (en tamaño)
        String cadena = tfCadena.getText();
        String cadena2 = tfSubcadena3.getText();
        Frases op = new Frases();
        if (op.es_mayor(cadena, cadena2)) {
            JOptionPane.showMessageDialog(this, "La cadena mayor es la segunda cadena " + "'" + cadena2 + "'",
                    "RESULTADO",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bRealizar6ActionPerformed

    private void bRealizar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizar7ActionPerformed
        // Comparar las cadenas
        String cadena = tfCadena.getText();
        String cadena2 = tfSubcadena4.getText();
        Frases op = new Frases();
        if (op.comparacion(cadena, cadena2) == 1) {
            JOptionPane.showMessageDialog(this, "La cadena mayor es la primera cadena " + "'" + cadena + "'",
                    "RESULTADO",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (op.comparacion(cadena, cadena2) == -1) {
            JOptionPane.showMessageDialog(this, "La cadena mayor es la segunda cadena " + "'" + cadena2 + "'",
                    "RESULTADO",
                    JOptionPane.INFORMATION_MESSAGE);
        } else { 
            JOptionPane.showMessageDialog(this, "Son del mismo tamaño",
                    "RESULTADO",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bRealizar7ActionPerformed

    private void tfSubcadena4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSubcadena4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSubcadena4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRealizar1;
    private javax.swing.JButton bRealizar2;
    private javax.swing.JButton bRealizar3;
    private javax.swing.JButton bRealizar4;
    private javax.swing.JButton bRealizar5;
    private javax.swing.JButton bRealizar6;
    private javax.swing.JButton bRealizar7;
    private javax.swing.JLabel lEjer1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JLabel lEjer6;
    private javax.swing.JLabel lEjer7;
    private javax.swing.JLabel lEncabezado;
    private javax.swing.JLabel lInstruc;
    private javax.swing.JLabel lInstruc1;
    private javax.swing.JTextField tfCadena;
    private javax.swing.JTextField tfCaracter;
    private javax.swing.JTextField tfSubcadena1;
    private javax.swing.JTextField tfSubcadena2;
    private javax.swing.JTextField tfSubcadena3;
    private javax.swing.JTextField tfSubcadena4;
    // End of variables declaration//GEN-END:variables
}
