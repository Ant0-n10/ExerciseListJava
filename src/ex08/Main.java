/*8 - Faça um algoritmo que leia três valores inteiros diferentes
e imprima na tela os valores em ordem decrescente.*/

package ex08;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //poderia ser assim -> List<Integer> arrayList = Arrays.asList(100,80,60);

        List<Integer> integerList = new ArrayList<>();

        System.out.println("1 Valor:");
        integerList.add(sc.nextInt());
        System.out.println("2 Valor:");
        integerList.add(sc.nextInt());
        System.out.println("3 Valor:");
        integerList.add(sc.nextInt());

        Collections.sort(integerList,Collections.reverseOrder());
        integerList.stream()
                .forEach(numeros -> System.out.println("Valores:" + numeros));


        sc.close();
    }
}
