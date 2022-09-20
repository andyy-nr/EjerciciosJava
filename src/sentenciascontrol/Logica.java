/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentenciascontrol;

/**
 *
 * @author Andrea
 */
public class Logica {

    private int num1, num2;
    private char c1, c2;
    private String cad1, cad2;

    public boolean iguales(int num1, int num2) {
        return (num1 == num2);
    }

    public int mayor_menor(int num1, int num2) {
        if (num1 > num2) {
            return 1; // el numero 1 es mayor, el 2 menor
        }
        if (num1 < num2) {
            return 2; // el 1 es menor, 2 el mayor
        }
        return 0;
    }

    public boolean verdad1(int num1, int num2) {
        return (num1 >= num2);
    }

    public boolean verdad2(int num1, int num2) {
        return (num1 <= num2);
    }

    public boolean caracteres(char c1, char c2) {
        return (c1 == c2);
    }

    public boolean cadenas(String cad1, String cad2) {
        return (cad1.equals(cad2));
    }

    public int cad_mayor(String cad1, String cad2) {
        if (cad1.length() > cad2.length()) {
            return (1); // cadena 1 es mas grande
        } else if (cad1.length() < cad2.length()) {
            return (2); // cad 2 es mas grande
        } else {
            return (0); // son del mismo tamaño
        }
    }

    public int pos_neg(int num1) {
        if (num1 > 0) {
            return (1);
        } else if (num1 < 0) {
            return (-1);
        } else {
            return (0);
        }
    }
}
