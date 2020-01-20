/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testproject1;


import javax.swing.JOptionPane;

/**
 *
 * @author lzr-ouday
 */
public class Main {   
    
    public static void main(String[] args) {
        
        String coeff1 ;
        String coeff2 ;
        String coeff3 ;
        double num1;
        double num2;
        double num3;
        
       
        
        
        coeff1 = JOptionPane.showInputDialog("Enter the coeff 1 ");
        
        coeff2 = JOptionPane.showInputDialog("Enter the coeff 2 ");
        
        coeff3 = JOptionPane.showInputDialog("Enter the coeff 3 ");
        
        num1 = Integer.parseInt(coeff1);
        num2 = Integer.parseInt(coeff2);
        num3 = Integer.parseInt(coeff3);
        
        Equation Eq = new Equation(num1 , num2, num3);
        
        Eq.resolution();
        
        //sum = num1 + num2 ;
        
        //System.out.println("Delta 1 :" + Eq.getRacine1());
        JOptionPane.showMessageDialog(null, "Delta 1 :" + Eq.getRacine1());
        JOptionPane.showMessageDialog(null, "Delta 2 :" + Eq.getRacine2());
    } 
}
