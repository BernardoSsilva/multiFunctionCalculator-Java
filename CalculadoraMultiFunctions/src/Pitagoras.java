package src;

import java.util.Scanner;

public class Pitagoras {
    public void realizarCalculo() {
        float catetoAdj, catetoOpos, hipotenusa;
        String check;
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        System.out.println(" ");
        System.out.println("====== Teorema de pitagoras =======");
        System.out.println(" ");
        while (continuar) {
            System.out.print("Digite o valor do cateto adjescente: ");
            catetoAdj = scan.nextFloat();
            System.out.println(" ");
            System.out.print("Digite o valor do cateto oposto: ");
            catetoOpos = scan.nextFloat();
            hipotenusa = (float) Math.sqrt((catetoAdj * catetoAdj) + (catetoOpos * catetoOpos));
            System.out.println(" ");
            System.out.printf("O valor da hipotenusa é de: %.2f", hipotenusa);
            System.out.println(" ");
            System.out.print("Deseja continuar a operação? (s/n): ");
            check = scan.next().toUpperCase();
            if (check.equals("N")) {
                continuar = false;
            }
        }
    }
}
