/*
10 - Faça um algoritmo que leia três notas obtidas por um aluno,
 e imprima na tela a média das notas.
*/

package ex010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1º: ");
        double n1 = sc.nextDouble();
        System.out.println("Nota 2º: ");
        double n2 = sc.nextDouble();
        System.out.println("Nota 3º: ");
        double n3 = sc.nextDouble();

        double media = (n1+n2+n3)/3;

        System.out.println("A média das notas é: " + media);

        sc.close();
    }
}
