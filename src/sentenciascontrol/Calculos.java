/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentenciascontrol;

/**
 *
 * @author Andrea
 */
public class Calculos {
    private int mult1, mult2; 
    private int n1, n2, n3, n4, n5;
    private double x, a, b;

    public boolean multiplo(int mult1, int mult2){
        return (((mult1 % mult2) == 0) || ((mult2 % mult1) == 0));
    }
    
    public int operacion(int n1, int n2, int n3, int n4, int n5){
        return (n1 + n2 - n3 * n4 / n5);
    }
  
    public int operacion2(int n1, int n2, int n3, int n4, int n5){
        return ((n1 + n2) * n3 - (n4 / n5));
    }
    
    public double powerof(double x, double a){
        return (Math.pow(x, a));
    }
    
    public double powDivision(double x, double a, double b){
        return((Math.pow(x, a)) * (a / b));
    }
}


