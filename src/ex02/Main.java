/*
2 - Faça um algoritmo para receber um número qualquer e imprimir na tela
se o número é par ou ímpar, positivo ou negativo.
 */

package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o número:");
        int num = sc.nextInt();
        String resultado;

       resultado = (num % 2 == 0) ? "par": "ímpar";

       if (num > 0){
           System.out.println("O número é POSITIVO e " + resultado);
       }else {
           System.out.println("O número é NEGATIVO e " + resultado);
       }

        sc.close();
    }
}
