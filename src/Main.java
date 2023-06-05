import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a expressão matemática: ");
        String expressao = scanner.nextLine();

        // Remove espaços em branco
        expressao = expressao.replaceAll("\\s+", "");

        //divide a expressão em operandos e operadores
        String[] partes = expressao.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");

        // validação da expressão
        if(partes.length != 3){
            System.out.println("Expressão invalida");
            return;
        }

        double resultado = 0;
        try{
            //coverte os operandos em numeros
            double numero1 = Double.parseDouble(partes[0]);
            double numero2 = Double.parseDouble(partes[0]);

            //realiza a operação de acordo com operador
            switch(partes[1]){
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    resultado = numero1 / numero2;
                    break;
                default:
                    System.out.println("Operador Invalido");
                    return;
            }

            //exibe o resultado
            System.out.println("Resultado: " + resultado);

             } catch (NumberFormatException e){
            System.out.println("Operandos inválidos!");
        }

        }
    }
