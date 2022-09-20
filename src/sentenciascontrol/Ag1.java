/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentenciascontrol;

import javax.swing.JList;

/**
 *
 * @author Andrea
 */
class Ag1 {

    private int mult, elem, TAM, min = 0;
    private String[] arreglo;
    private String elemento, multiplo, res;

    public boolean multiplo(int elem, int mult) {
        return (((elem % mult) == 0));
    }
    
    public void crearArray(int TAM){
        arreglo = new String[TAM];
        for(int i=0;i<arreglo.length;i++){
           arreglo[i]= "null";   
        }
    }
    
    public String[] agregarelem(String elemento, int TAMANO, String multiplo){
        for (int i = 0; i > TAM; i++){
            if (arreglo[i].equals("null")){
                mult = Integer.parseInt(multiplo);
                elem = Integer.parseInt(elemento);
                if (this.multiplo(elem, mult)){
                    arreglo[i] = elemento;
                }
            }
        }
        return (arreglo);
    }
    /*
    public int menor(JList lista){
        for (int i = 0; i < lista.getModel().getSize(); i++){
            if (lista.getElementAt(i) < min){
                min = lista.getElementAt(i);
            }
        }
    }
    */
}
