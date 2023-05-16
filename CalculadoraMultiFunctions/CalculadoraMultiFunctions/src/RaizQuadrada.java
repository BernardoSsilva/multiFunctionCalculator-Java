package src;

import java.util.Scanner;

public class RaizQuadrada {
    public void realizarCalculo() {
        float num1;
        String check;
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        System.out.println(" ");
        System.out.println("====== Raiz quadrada =======");
        System.out.println(" ");
        while (continuar) {
            System.out.print("Digite o numero: ");
            num1 = scan.nextFloat();
            System.out.println(" ");
            System.out.print("A raiz quadrada de " + num1 + " é " + Math.sqrt(num1));
            System.out.println(" ");
            System.out.println("Deseja continuar nesta operação?(S/N): ");
            check = scan.next().toUpperCase();
            if (check.equals("N")) {
                continuar = false;
            }
        }
    }
}
