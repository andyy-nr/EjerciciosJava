/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentenciascontrol;

/**
 *
 * @author Andrea
 */
public class Frases {

    private String cadena, subcadena, cadena2;
    private int longitud, cuenta = 1, max = 0, contador;
    private String separado = "";
    private char letra;

    public int calc_len(String cadena) {
        longitud = cadena.length();
        return (longitud);
    }

    public String separacion(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            separado = separado + cadena.charAt(i) + " ";
        }
        return (separado);
    }

    public int moda(String cadena, char letra) {
        char letraArray[] = cadena.toCharArray();
        for (int j = 0; j < letraArray.length; j++) {
            contador = 0;
            if (letraArray[j] == letra) {
                contador++;
            }
        }
        return (contador);
    }

    public boolean subcadena(String cadena, String subcadena) {
        return (cadena.contains(subcadena));
    }

    public String concatenar(String cadena, String subcadena) {
        return (cadena + " " + subcadena);
    }

    public boolean es_mayor(String cadena, String cadena2) {
        return (cadena.length() < cadena2.length());
    }

    public int comparacion(String cadena, String cadena2) { //devuelve 1 si la cadena mayor es la primera, -1 si la mayor es la segunda y 0 si son iguales
        if (cadena.length() < cadena2.length()) {
            return -1;
        } else if (cadena.length() > cadena2.length()) {
            return 1;
        } else {
            return 0;
        }
    }
}
