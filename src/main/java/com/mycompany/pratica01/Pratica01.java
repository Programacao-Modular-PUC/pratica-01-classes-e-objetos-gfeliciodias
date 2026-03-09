/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratica01;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pratica01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrianguloRetangulo t1 = new TrianguloRetangulo();
        
        System.out.println("Digite os catetos");
        t1.c1 = scanner.nextDouble();
        t1.c2 = scanner.nextDouble();
        
        double hipotenusa = t1.CalculaHipotenusa();
        double area = t1.CalculaArea();
        
        System.out.println("Hipotenusa = " + hipotenusa);
        System.out.println("Area = " + area);
        
    }
}
