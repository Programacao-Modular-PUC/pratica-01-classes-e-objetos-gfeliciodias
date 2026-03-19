/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica01pt02;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Pratica01pt02 {
public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Pessoa p[] = new Pessoa[10];
        
        System.out.println("Digite quantas pessoas voce deseja. (maximo de 10 pessoas)");
        int numPessoa = sc.nextInt();
        sc.nextLine();
        
        if(numPessoa > 10){
            System.out.println("Numero de pessoas maior que o permitido. Processo encerrando\n");
            return;
        }
        int totalCadastrados = 0;
        
        for(int i = 0; i < numPessoa; i++){
            p[i] = new Pessoa ();
        
            System.out.println("Digite o nome");    
            p[i].setNome(sc.nextLine());

            System.out.println("Digite o sobrenome");
            p[i].setSobrenome(sc.nextLine());
            
            if(i>0){
                String anterior = p[i-1].getNome()+ " " + p[i-1].getSobrenome();
                String atual = p[i].getNome()+ " " + p[i].getSobrenome();
                
                if(atual.equals(anterior)){
                    System.out.println("Nome semelhante com o ultimo cadastrado. Sistema encerrando\n");
                    totalCadastrados = i;
                    break;
                }
            }

            System.out.println("Digite a altura");
            p[i].setAltura(sc.nextFloat());

            System.out.println("Digite o peso");
            p[i].setPeso(sc.nextFloat());
            
            sc.nextLine();

            System.out.println("Digite o dia do seu nascimento");
            int dia = sc.nextInt();

            System.out.println("Digite o mes do seu nascimento");
            int mes = sc.nextInt();

            System.out.println("Digite o ano do seu nascimento\n");
            int ano = sc.nextInt();
            sc.nextLine();

            System.out.println("Dados coletados da " + (i+1) + " pessoa");

            Calendar cal = Calendar.getInstance();
            cal.set(ano, mes-1, dia);

            Date dataNascimento = cal.getTime();
            p[i].setDataNascimento(dataNascimento);
            
            totalCadastrados = i + 1;
        }
        
            for(int i = 0; i < totalCadastrados ; i++){
                    System.out.println("\n<--------------------------------->");
                    System.out.println("Cadastro: " + (i+1) + ":\n");
                
                    System.out.println("Nome: " + p[i].getNome()+ " " + p[i].getSobrenome());
                    System.out.println("Nome de referencia: " + p[i].getSobrenome().toUpperCase() + ", " + p[i].getNome().toUpperCase());

                    
                    System.out.println("Idade: " + p[i].calculaIdade());
                    
                    double imc = p[i].calcularIMC();
                    System.out.println("Indice de IMC " + imc);

                    String classificacao = p[i].informaObesidade();
                    System.out.println("Classificacao = " + classificacao);
            }
       
        sc.close();
        
        }
}
