/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import java.util.Scanner;

/**
 *
 * @author casso
 */
public class imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
    Como é calculado?
    O IMC é a relação entre peso e altura e o cálculo é feito de acordo 
    com a fórmula: IMC = peso/ (altura x altura), devendo o peso estar 
    em kg e a altura em metro, e o resultado é dado em kg/m2. 
    Depois de obter o resultado, é possível verificar em que faixa o IMC 
    se encontra, podendo indicar:
    Magreza, quando o resultado é menor que 18,5 kg/m2;
    Normal, quando o resultado está entre 18,5 e 24,9 kg/m2;
    Sobrepeso, quando o resultado está entre 24,9 e 30 kg/m2;
    Obesidade, quando o resultado é maior que 30 kg/m2.
         */
        Scanner ler = new Scanner(System.in);
        float peso, altura, imc;
        String nome, saida="s";
        boolean s=true;

        while(saida.equalsIgnoreCase("s")){
        System.out.println("---calculadora IMC---");
        System.out.println("");
        System.out.println("");
        System.out.print("Informe seu nome: ");
        nome = ler.nextLine();
        nome = nome.toUpperCase();
        System.out.print("informe seu peso: ");
        peso = ler.nextFloat();
        System.out.print("Informe sua altura: ");
        altura = ler.nextFloat();
        imc = peso / (altura * altura);
        
        System.out.println("");
        System.out.println("resultado com if");
        if (imc <= 18.5) {
            System.out.println(nome + " Seu IMC é: " + imc + ", e define Magreza.");
        } else if (imc <= 24.9) {
            System.out.println(nome + " Seu IMC é: " + imc + ", e define normal.");
        } else if (imc <= 30) {
            System.out.println(nome + " Seu IMC é: " + imc + ", e define sobrepeso.");
        } else {
            System.out.println(nome + " Seu IMC é: " + imc + ", e define obesidade..");
        }

        System.out.println("resultado com 2 numeros apos virgula");
        if (imc < 18.5) {
            System.out.printf(nome + " seu IMC é: %.2f, e define Magreza.", imc);
        } else if (imc <= 24.9) {
            System.out.printf(nome + " seu IMC é: %.2f, e define Normal.", imc);
        } else if (imc <= 30) {
            System.out.printf(nome + " seu IMC é: %.2f, e define Sobrepeso.", imc);
        } else {
            System.out.printf(nome + " seu IMC é: %2.f, e define Obesidade.", imc);

        }
            System.out.println("");
            System.out.println("Você deseja calcular o imc novamente? (s) para continuar");
            saida = ler.next();
            s =saida.equalsIgnoreCase("s");
            ler.nextLine();
        }// fim do while
        System.out.println("Aplicação encerrada pelo usuário!");
    }

}
