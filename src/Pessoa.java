/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica01pt02;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class Pessoa {
        
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private float altura;
    private float peso;
    
    public Pessoa (){
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
    
    public Date getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public double calcularIMC(){
        return peso/Math.pow(altura, 2);
    }

    public String informaObesidade(){
        double imc = calcularIMC();
        
            if  (imc < 18.5){
                return "A pessoa esta abaixo do peso";      
            }
            else if (imc < 25){
                return "Peso Normal";
            }
            else if (imc < 30){
                return "Sobrepeso";
            }
            else if (imc < 35){
                return "Obesidade grau 1"; 
            }
            else if (imc < 40){
                return "Obesidade grau 2"; 
            }
            else{
                return "Obesidade grau 3"; 
            }
            

    }
    public int calculaIdade (){
        
        if(dataNascimento == null){
            return 0;
        }
        
        Calendar hoje = Calendar.getInstance();
       
        Calendar nascimento = Calendar.getInstance();
        nascimento.setTime(dataNascimento);
        
        int idade = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);
       
        if(hoje.get(Calendar.MONTH)< nascimento.get(Calendar.MONTH)){
            idade --;
        } else if (hoje.get(Calendar.MONTH) == nascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < nascimento.get(Calendar.DAY_OF_MONTH)){
            idade --;
        }
        return idade;
    }         

}
