/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratica01ex02;

/**
 *
 * @author Usuario
 */
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private int idade;
    private float altura;
    private float peso;
    
    public Pessoa (String nome, String sobrenome, int idade, float altura, float peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
}
    /**
     * @return the Nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @param nome the Nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @return the Sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }
    /**
     * @param sobrenome the Sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }
    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }
    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }
    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public double CalcularIMC(){
        return peso/Math.sqrt(Math.pow(altura, 2));
    }

    public void InformaObesidade(){
        double imc = CalcularIMC();
        
            if  (imc < 18,5){
                System.out.println("A pessoa esta abaixo do peso");      
            }
            else if (imc > 25){
            
            }
    }

}

    