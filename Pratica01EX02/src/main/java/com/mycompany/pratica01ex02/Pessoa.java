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
    /**
     * @return the Nome
     */
    public String[] getNome() {
        return Nome;
    }
    /**
     * @param Nome the Nome to set
     */
    public void setNome(String[] Nome) {
        this.Nome = Nome;
    }
    /**
     * @return the Sobrenome
     */
    public String[] getSobrenome() {
        return Sobrenome;
    }
    /**
     * @param Sobrenome the Sobrenome to set
     */
    public void setSobrenome(String[] Sobrenome) {
        this.Sobrenome = Sobrenome;
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
    /**
     * @return the imc
     */
    public float getImc() {
        return imc;
    }
    /**
     * @param imc the imc to set
     */
    public void setImc(float imc) {
        this.imc = imc;
    }
    private String [] Nome;
    private String [] Sobrenome;
    private int idade;
    private float altura;
    private float peso;
    private float imc;

}
