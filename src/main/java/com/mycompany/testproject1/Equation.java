/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testproject1;

/**
 *
 * @author lzr-ouday
 */
public class Equation {
    private double a;
    private double b;
    private double c;
    
    private double racine1;
    private double racine2;
    
    public Equation(double coeff1 , double coeff2 , double coeff3){
        a = coeff1;
        b = coeff2;
        c = coeff3;
    }
    
    public void resolution(){
    double discri;
    discri = (b*b - 4*a*c);
    racine1 =(-b + Math.sqrt(discri))/(2*c);
    racine2 =(-b - Math.sqrt(discri))/(2*c);
    }
    
    public double getRacine1(){
        return(racine1);
    }
    
    public double getRacine2(){
        return (racine2);
    }

}
