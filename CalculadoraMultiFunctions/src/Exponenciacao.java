package src;

import java.util.Scanner;

public class Exponenciacao {
    public void realizarExponenciacao() {

        String check;
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        System.out.println(" ");
        System.out.println("====== Exponenciação =======");
        System.out.println(" ");
        while (continuar) {
            float base, resultado = 1;
            int potencia;
            System.out.print("Digite o numero que servira como base: ");
            base = scan.nextFloat();
            System.out.println(" ");
            System.out.print("Digite a potencia: ");
            potencia = scan.nextInt();
            System.out.println(" ");
            for (int i = 1; i <= potencia; i++) {
                resultado = resultado * base;
            }
            System.out.printf("O resultado é: %.2f", resultado);
            System.out.println(" ");
            System.out.println("Deseja continuar nesta operação?(S/N): ");
            check = scan.next().toUpperCase();
            if (check.equals("N")) {
                continuar = false;
            }
        }
    }
}