/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratica01;

/**
 *
 * @author Usuario
 */
public class TrianguloRetangulo {
       double c1;
       double c2;
       double h;
        
       public double CalculaHipotenusa(){
           h = Math.sqrt(Math.pow(c1,2) + Math.pow(c2, 2));
           return h;
        }
        
       public double CalculaArea(){
           double area = (c1 * c2)/2;
           return area;
        }
    
}
