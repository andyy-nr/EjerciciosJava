/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentenciascontrol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrea
 */
public class ConsolaOps {

    public int TB, n1, n2, iva, descuento;
    public float res, precio1, precio2, precio3, precio4;
    public double num;
    public String digitos, separados = "", resp;
    public char c1, c2, c3, c4, c5, c6;

    public double bytes(int TB) {
        double bytes_in_tb = 1e+12;
        double resp = bytes_in_tb * TB;
        return (resp);
    }

    public float residuo(int n1, int n2) {
        return (n1 % n2);
    }

    public float total_compra(float precio1, float precio2, float precio3, float precio4, int iva, int descuento) {
        float cIVA = ((precio1 + precio2 + precio3 + precio4) / ((iva / 100) + 1));
        descuento = descuento / 100;
        float totalDesc = cIVA * descuento;
        return (cIVA - totalDesc);
    }

    public double raiz(double num) {
        return (Math.sqrt(num));
    }

    public String separar_digitos(int n1) {
        String digitos = Integer.toString(n1);
        for (int i = 0; i < digitos.length(); i++) {
            separados = separados + digitos.charAt(i) + " ";
        }
        return (separados);
    }

    public boolean tamanio(int n1) { // para evaluar que el numero es de 5 digitos
        return (n1 <= 99999 && n1 >= 10000);
    }

    public String concatenar(char c1, char c2, char c3, char c4, char c5, char c6) {
        String resp = ((Character.toString(c1)) + (Character.toString(c2)) + Character.toString(c3) + Character.toString(c4) + Character.toString(c5) + Character.toString(c6));
        return (resp);
    }

    public void fecha() {
        System.out.println(java.time.LocalDate.now());
    }

    public void tablaY() {
        boolean p[]= {true,true,false,false};
        boolean q[] = {true,false,true,false};
        boolean pyq[] = new boolean[4];

        // calcula el valor de p y q
        for (int i = 0; i < 4; i++) {
            if (p[i] == true && q[i] == true) {
                pyq[i] = true;
            } else {
                pyq[i] = false;
            }
        }
        
        // imprime la tabla
        System.out.println(" p    | q    | pyq  ");
        for (int i = 0; i < 4; i++) {
            System.out.println(p[i] + " |" +q[i] + " |" + pyq[i] + " |");
        }

    }
}
