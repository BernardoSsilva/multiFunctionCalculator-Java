package src;

import java.util.Scanner;

public class Bhaskara {
    public void realizarCalculo() {
        float valorA, valorB, delta;
        String check;
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        System.out.println(" ");
        System.out.println("====== Equação de segundo grau =======");
        System.out.println(" ");
        float valorC, xLinha, xDuas;
        while (continuar) {
            System.out.print("Digite o valor de A: ");
            valorA = scan.nextFloat();
            System.out.println(" ");
            System.out.print("Digite o valor de B: ");
            valorB = scan.nextFloat();
            System.out.println(" ");
            System.out.print("Digite o valor de C: ");
            valorC = scan.nextFloat();

            delta = ((valorB * valorB) + (-4 * valorA * valorC));

            if (delta < 0) {
                System.out.println("Valor não é um numero real");
            } else if (delta == 0) {
                System.out.println("Ambos os valores são iguais a : " + ((-1 * (valorB)) / 2 * valorA));
            } else {
                xLinha = (float) ((-1 * (valorB)) + Math.sqrt(delta)) / (2 * valorA);
                xDuas = (float) ((-1 * (valorB)) - Math.sqrt(delta)) / (2 * valorA);
                System.out.println("Os valores do X1 e X2 são respectivamente: " + xLinha + " e " + xDuas);
            }

            System.out.println(" ");
            System.out.println("Deseja continuar a operação?(S/N): ");
            check = scan.next().toUpperCase();
            if (check.equals("N")) {
                continuar = false;
            }

        }
    }
}
