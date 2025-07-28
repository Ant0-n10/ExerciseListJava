/*
6 - Faça um algoritmo que leia um valor qualquer
 e imprima na tela com um reajuste de 5%.
**/

package ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor para ser taxado em 5%: ");
         int num = sc.nextInt();

         tax(num);

        sc.close();
    }

    private static void tax(double num){
       double surcharge = (0.05) * num;
       num = num + surcharge;
        System.out.println(num);
    }

}
