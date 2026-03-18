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
        Pessoa p = new Pessoa();
        
        System.out.println("Digite quantas pessoas voce deseja. (maximo de 10 pessoas");
        int numPessoa = sc.nextInt();
        if(numPessoa > 10){
            System.out.println("Numero de pessoas maior que o permitido. Processo encerrando");
            System.exit(0);
        }
        for(int i = 0; i <= numPessoa; i++){
        
            System.out.println("Digite o nome");
            p[i].setNome(sc.nextLine());

            System.out.println("Digite o sobrenome");
            p[i].setSobrenome(sc.nextLine());
            
            if(p[i].nome == p[i-1].nome && p[i].nome == p[i-1].sobrenome){
                System.out.println("Nome semelhante com o ultimo cadastrado. Sistema encerrando");
                System.exit(0);
            }

            System.out.println("Digite a altura");
            p[i].setAltura(sc.nextFloat());

            System.out.println("Digite o peso");
            p[i].setPeso(sc.nextFloat());

            System.out.println("Digite o dia do seu nascimento");
            int dia = sc.nextInt();

            System.out.println("Digite o mes do seu nascimento");
            int mes = sc.nextInt();

            System.out.println("Digite o ano do seu nascimento");
            int ano = sc.nextInt();

            System.out.println("Dados coletados.");

            Calendar Cal = Calendar.getInstance();
            Cal.set(ano, mes-1, dia);

            Date dataNascimento = Cal.getTime();
            p1.setDataNascimento(dataNascimento);

            System.out.println("Nome: " + p[i].getNome()+ " " + p[i].getSobrenome());

            System.out.println("Idade: " + p[i].calculaIdade());

            double imc = p[i].calcularIMC();
            System.out.println("Indice de IMC " + imc);

            String classificacao = p[i].informaObesidade();
            System.out.println("Classificacao = " + classificacao);
        }
       
        sc.close();
        
        }
}
