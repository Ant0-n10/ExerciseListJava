/*
7 - Faça um algoritmo que leia dois valores booleanos (lógicos)
e determine se ambos são VERDADEIRO ou FALSO.
**/
package ex07;

public class Main {
    public static void main(String[] args) {

        boolean v = false;
        boolean f = false;

        if (v != false && f != false){
            System.out.println("Ambos são Verdadeiros");
        } else if (v != true &&f != true ) {
            System.out.println("Ambos são Falsos");
        }else {
            System.out.println("Eles não tem valores iguais" +" 1 é: "+ v +" 2 é: "+ f);
        }

    }
}
