import java.util.Scanner;

import src.Multiplicacao;
import src.Soma;
import src.Subtracao;


public class main{
    public static void main(String[] args) {
        int value;
        Soma somar = new Soma();
        Subtracao subtrair = new Subtracao();
        Multiplicacao multiplicar = new Multiplicacao();
        boolean continuar = true;
        while(continuar){
            Scanner scan = new Scanner(System.in);        
            System.out.println("Calculadora Multifunções");
            System.out.println(" ");
            System.out.println("============ ");
            System.out.println(" ");
            System.out.println("Digite 1 para realizar soma: ");
            System.out.println(" ");
            System.out.println("Digite 2 para realizar subtração: ");
            System.out.println(" ");
            System.out.println("Digite 3 para realizar multiplicação: ");
            System.out.println(" ");
            System.out.println("Digite 4 para realizar divisão: ");
            System.out.println(" ");
            System.out.println("Digite 5 para teorema de pitagoras: ");
            System.out.println(" ");
            System.out.println("Digite 6 para bhaskara: ");
            System.out.println(" ");
            System.out.println("Digite 7 para calcular raiz quadrada: ");
            System.out.println(" ");
            System.out.println("Digite 8 para exponenciação: ");
            System.out.println(" ");
            System.out.println("Digite 9 para encontrar a raiz cubica: ");
            System.out.println(" ");
            System.out.println("Digite 10 para calcular area: ");
            System.out.println(" ");
            System.out.println("Digite 11 para calcular o perimetro de uma circunferencia: ");
            System.out.println(" ");
            System.out.println("Digite 12 para calcular velocidade media: ");
            System.out.println(" ");
            System.out.println("Digite a operação que voce deseja: ");
            value = scan.nextInt();
            switch(value){
                case 1: 
                    somar.realizarSoma();
                    break;
                case 2:
                    subtrair.realizarSubtracao();;
                    break;
                case 3:
                    multiplicar.realizarMultiplicacao();;
                    break;
                
            }
        }
    }
}