import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int variavel = 0;
        while(variavel == 0) {
            double somaResultado, subResultado, multiResultado, divResultado, expResultado, raizResultado;
            System.out.println("Para calcular, primeiro, digite um número: ");
            Scanner entrada = new Scanner(System.in);
            double entradaNumero = entrada.nextDouble();
            System.out.println("""
                    Okay, qual operação você deseja fazer? Digite:\s
                     1 ->soma
                     2 ->subtração
                     3 ->multiplicação
                     4 ->divisão
                     5 ->expoente
                     6 ->raiz""");
            Scanner operacoes = new Scanner(System.in);
            int operacao = operacoes.nextInt();
            if (operacao == 1) {
                System.out.println("Certo, você quer somar " + entradaNumero + " com o que?");
                double entradaNumero2 = entrada.nextDouble();
                somaResultado = entradaNumero + entradaNumero2;
                System.out.println("A conta: " + entradaNumero + " + " + entradaNumero2 + " é igual a \n" + somaResultado);
            }
            if (operacao == 2) {
                System.out.println("Certo, você quer subtrair " + entradaNumero + " com o que?");
                double entradaNumero2 = entrada.nextDouble();
                subResultado = entradaNumero - entradaNumero2;
                System.out.println("A subtração: " + entradaNumero + " - " + entradaNumero2 + " é igual a \n " + subResultado);
            }
            if (operacao == 3) {
                System.out.println("Certo, você quer multiplicar " + entradaNumero + " com o que?");
                double entradaNumero2 = entrada.nextDouble();
                multiResultado = entradaNumero * entradaNumero2;
                System.out.println("A multiplicação: " + entradaNumero + " x " + entradaNumero2 + " é igual a \n" + multiResultado);
            }
            if (operacao == 4) {
                System.out.println("Certo, você quer dividir " + entradaNumero + " pelo que?");
                double entradaNumero2 = entrada.nextDouble();
                if (entradaNumero2 == 0) {
                    System.out.println("Não é possível dividir qualquer número por 0");
                } else {
                    divResultado = entradaNumero / entradaNumero2;
                    System.out.println("A divisão: " + entradaNumero + " / " + entradaNumero2 + " é igual a \n" + divResultado);
                }
            }
            if (operacao == 5){
                System.out.println("Certo você quer elevar "+entradaNumero+" a quanto?");
                double entradaNumero2 = entrada.nextDouble();
                System.out.println(entradaNumero+" elevado a "+entradaNumero2+" é igual a "+Math.pow(entradaNumero,entradaNumero2));
            }
            if (operacao == 6){
                System.out.println("Certo,você quer saber a raiz quadrada ou cubica de "+entradaNumero+" ?\n Quadrada --> 2\n Cúbica -->3");
                int entradaNumero2 = entrada.nextInt();
                switch (entradaNumero2){
                    case 2:
                        System.out.println("A raiz quadrada de "+entradaNumero+" é igual a \n "+Math.sqrt(entradaNumero));
                        break;
                    case 3:
                        System.out.println("A raiz cúbica de "+entradaNumero+" é igual a \n"+Math.cbrt(entradaNumero));
                        break;
                }
            }
            System.out.println("""
                        Deseja fazer uma nova operação?\s
                        Se sim digite 0
                        Se não digite 1""");
            variavel = entrada.nextInt();

        }
    }

}