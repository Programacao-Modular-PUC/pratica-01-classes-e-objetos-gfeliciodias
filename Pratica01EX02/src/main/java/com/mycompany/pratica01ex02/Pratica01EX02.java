/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pratica01ex02;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pratica01EX02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o nome");
        String nome = sc.nextLine();
        
        System.out.println("Digite o sobrenome");
        String sobrenome = sc.nextLine();
        
        System.out.println("Digite a idade");
        int idade = sc.nextInt();
        
        System.out.println("Digite a altura");
        float altura = sc.nextFloat();
        
        System.out.println("Digite o peso");
        float peso = sc.nextFloat();
        
        System.out.println("Dados coletados.");
        
        Pessoa p1 = new Pessoa(nome, sobrenome, idade, altura, peso);
        
        double imc = p1.calcularIMC();
        String classificacao = p1.informaObesidade();
        
        System.out.println("Indice de imc " + imc);
        System.out.println("Classificacao = " + classificacao);
       
        sc.close();
        
        }
}
 