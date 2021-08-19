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
public class Revisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);//usar no console
        boolean verefica;//Var booleana | true or false | 0 or 1
        int num1;//var do tipo inteiro 11 posições
        short num2;//var = smalint inteiro pequeno 4 posições
        long num3;//var = bigint inteiro grande
        double num4;//var = decimal, numeric com casas decimais
        float num5;// var = com casa decimais é menor que o double
        byte b;//num inteiro valor maximo 127
        String texto;//aceita tudo em formato texto
        String textoCurto;
        char sexo;


        System.out.println("Revisão manhã");
        System.out.println("Informe um numero inteiro: ");
        num1 = ler.nextInt();
        System.out.println("informe um inteiro até 127");
        b = ler.nextByte();
        System.out.println("informe um numero inteiro pequeno:");
        num2 = ler.nextShort();
        System.out.println("informe um numero inteiro grande: ");
        num3 = ler.nextLong();
        System.out.println("informe um numero com decimal: ");
        num4 = ler.nextDouble();
        System.out.println("informe um numero decimal pequeno: ");
        num5 = ler.nextFloat();
        System.out.println("informe seu nome completo: ");
        ler.nextLine();
        texto = ler.nextLine();
        texto = texto.toUpperCase();
        System.out.println("informe o primeiro nome da sua mãe: ");
        textoCurto = ler.next();
        System.out.println("informe seu sexo: ");
        sexo = ler.next().charAt(0);
        
        System.out.println("----impressão----");
        System.out.println("inteiro"+num1);
        System.out.println("byte"+b);
        System.out.println("short"+num2);
        System.out.println("long"+num3);
        System.out.println("double"+num4);
        System.out.println("float"+num5);
        System.out.println("seu nome é: "+texto);
        System.out.println("nome da sua mãe é: "+textoCurto);
        System.out.println("seu sexo é: "+sexo);
        verefica = num1>num2;
        if(verefica){
            System.out.println("num1 é maior ou igual que num2.");
        }else{
            System.out.println("num2 é maior que num1.");
        }
    }

}
