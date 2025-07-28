/*
9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa,
leia o seu peso e sua altura e imprima na tela sua condição
de acordo com a tabela abaixo:
Fórmula do IMC = peso / (altura) ²

Tabela Condições IMC
 Abaixo de 18,5   | Abaixo do peso
 Entre 18,6 e 24,9 | Peso ideal (parabéns)
 Entre 25,0 e 29,9 | Levemente acima do peso
 Entre 30,0 e 34,9 | Obesidade grau I
 Entre 35,0 e 39,9 | Obesidade grau II (severa)
 Maior ou igual a 40 | Obesidade grau III (mórbida)
*/

package ex09;

import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;
import  java.math.*;

public class Main {

    public static NavigableMap<Double,String> navigableMap = new TreeMap<>();

    static {
        navigableMap.put(0.0,"Abaixo do peso");
        navigableMap.put(18.6, "Peso ideal (parabéns)");
        navigableMap.put(25.0, "Levemente acima do peso");
        navigableMap.put(30.0, "Obesidade grau I");
        navigableMap.put(35.0, "Obesidade grau II (severa)");
        navigableMap.put(40.0, "Obesidade grau III (mórbida)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Entre com sua altura: ");
        double altura = sc.nextDouble();

        double IMC = peso/ (Math.pow(altura,2));

        System.out.println(navigableMap.floorEntry(IMC).getKey());

        sc.close();
    }
}
