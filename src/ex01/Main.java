/*
1 - Faça um algoritmo que leia os valores de A, B, C e
em seguida imprima na tela a soma entre A e B e
 mostre se a soma é menor que C.
 */
package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.println("Digite 3 valores:");

        System.out.println("Valor de A:");
        a = sc.nextInt();

        System.out.println("Valor de B:");
        b = sc.nextInt();

        System.out.println("Valor de C:");
        c = sc.nextInt();

        int soma = a+b;

        if(a + b > c){
            System.out.println("O resultado entra A+B: " + soma + " é maior que " + c);
        } else{
            System.out.println("O resultado entra A+B: " + soma + " não é maior que " + c);
        }

        sc.close();
    }
}
