package src;

import java.util.Scanner;

public class Soma {
    public void realizarSoma(){
        float num1, num2;
        String check;
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        System.out.println(" ");
        System.out.println("====== Soma =======");
        System.out.println(" ");
        while(continuar){

            System.out.print("Digite o primeiro numero: ");
            num1 = scan.nextFloat();
            System.out.println(" ");
            System.out.print("Digite o segundo numero: ");
            num2 = scan.nextFloat();
            System.out.println(" ");
            System.out.print("O resultado é: "+(num1+num2));
            System.out.println(" ");
            System.out.println("Deseja continuar? (S/N): ");
            check = scan.next().toUpperCase();
            System.out.println(" ");
            if (check.equals("N")){
                continuar = false;
            }
        }
    } 
}
