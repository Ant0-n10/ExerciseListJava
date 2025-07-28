/*4 - Faça um algoritmo que receba um número inteiro
e imprima na tela o seu antecessor e o seu sucessor.*/

package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número:");
        int num = sc.nextInt();

        mostraAntecessorAndSucessor(num);

        sc.close();
    }

    public static void mostraAntecessorAndSucessor(int num){
        int antecessor = num -1;
        int sucessor = num +1;
        System.out.printf("Resultado: " +num+ " o seu antecessor é " +antecessor+ " e o sucessor é " + sucessor);
    }
}
