/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentenciascontrol;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class Ag2 {

    private int[][] m1 ={{10, 15, 20},
            {-3, 12, 4}, 
            {0, 5, -4}};
    private int[][] m2 = {{25, -5, 10},
            {-10, 21, 54},
            {10, -55, -25}};
    private int res, k;
    String resultado, Sres;

    public String multiplicarK(int k) {
        resultado = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res = m1[i][j] * k;
                Sres = String.valueOf(res);
                resultado = resultado + Sres + " ";
            }
            resultado = resultado + "\n";
        }
        return (resultado);
    }
    public String sumaAB() {
        resultado = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res = m1[i][j] + m2[i][j];
                Sres = String.valueOf(res);
                resultado = resultado + Sres + " ";
            }
            resultado = resultado + "\n";
        }
        return (resultado);
    }
}
