import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       // Solicita dois numeros ao usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int numero1 = scanner.nextInt();

        System.out.println("Sidigite o seundo numero");
        int numero2 = scanner.nextInt();


        // realiza as operaçõs matematicas
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;


        //exibe os rsultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        }
    }
