package src;

import java.util.Scanner;

public class Area {
    public void Calcular() {
        boolean continuar = true;
        String check;
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("============== Calculo de Area ================ ");
        System.out.println(" ");
        while (continuar) {
            float resultado = 0, altura, base, largura;
            System.out.println(
                    "Digite o formato da area que sera calculada \n 'Q' para quadrado \n 'T' para trapézio \n 'R' para retângulo \n 'TP' para triângulo \n 'E' para uma esfera: ");
            String tipoDeForma = scan.next().toUpperCase();
            if (tipoDeForma.equals("Q")) {
                System.out.println(" ");
                System.out.print("Digite a altura do quadrado: ");
                altura = scan.nextFloat();
                resultado = altura * altura;
            } else if (tipoDeForma.equals("T")) {
                System.out.println(" ");
                System.out.print("Digite a altura do trapézio: ");
                altura = scan.nextFloat();
                System.out.print("Digite a base maior do trapézio: ");
                base = scan.nextFloat();
                System.out.print("Digite a base menor do trapézio: ");
                largura = scan.nextFloat();
                resultado = (base + largura) * altura;
                resultado = resultado / 2;
            } else if (tipoDeForma.equals("R")) {
                System.out.println(" ");
                System.out.print("Digite a altura do retângulo: ");
                altura = scan.nextFloat();
                System.out.print("Digite a base do retângulo: ");
                base = scan.nextFloat();
                resultado = (base * altura);
            } else if (tipoDeForma.equals("TP")) {
                System.out.println(" ");
                System.out.print("Digite a altura do triângulo: ");
                altura = scan.nextFloat();
                System.out.print("Digite a base do triângulo: ");
                base = scan.nextFloat();
                resultado = (base * altura) / 2;
            } else if (tipoDeForma.equals("E")) {
                System.out.println(" ");
                System.out.print("Digite o raio da esfera: ");
                base = scan.nextFloat();
                resultado = (float) ((base * base) * 3.14);
            } else {
                System.out.println("Valor invalido");
            }
            System.out.println(" ");
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
