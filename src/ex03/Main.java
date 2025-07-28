/*
3 - Faça um algoritmo que leia dois valores inteiros A e B,
 se os valores de A e B forem iguais, deverá somar os dois valores,
caso contrário devera multiplicar A por B.
 Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.

*/

package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("entre com o primeiro valor:");
       float A = sc.nextFloat();
        System.out.println("entre com o segundo valor:");
       float B = sc.nextFloat();
       float C;

       if (A == B){
           C = A + B;
           System.out.println("O resultado é: " + C);
       }else {
           C = A * B;
           System.out.println("O resultado é: " + C);
       }

       sc.close();
    }
}
