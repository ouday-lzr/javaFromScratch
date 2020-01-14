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
        String firstNum ;
        String secondNum;
        int num1;
        int num2;
        int sum;
        
        firstNum = JOptionPane.showInputDialog("Enter the first number");
        
        secondNum = JOptionPane.showInputDialog("Enter the second number");
        
        num1 = Integer.parseInt(firstNum);
        num2 = Integer.parseInt(secondNum);
        
        sum = num1 + num2 ;
        
        JOptionPane.showMessageDialog(null, "Result :" + sum);
    } 
}
