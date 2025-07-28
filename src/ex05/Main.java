/*5 - Faça um algoritmo que leia o valor do salário mínimo
 e o valor do salário de um usuário, calcule quantos salários mínimos
  esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20). */

package ex05;

import java.math.BigDecimal;
import java.math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o salário do usuario: ");
        double salarioUsuario = sc.nextDouble();

        BigDecimal minimunWage = new BigDecimal(1293.20);
        BigDecimal salary = new BigDecimal(salarioUsuario);

        BigDecimal resultado = salary.divide(minimunWage,new MathContext(5, RoundingMode.FLOOR));

        System.out.printf("A quantidade de salários recebida é: %.2f%n ",resultado);

        sc.close();
    }
}
