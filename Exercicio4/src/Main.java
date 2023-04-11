import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double resultado;
        System.out.println("Digite um número por favor: ");
        Scanner entrada = new Scanner(System.in);
        double numero = entrada.nextDouble();
        if(numero%2==0){
            resultado = Math.cbrt(numero);
            System.out.println("A raíz cúbica do numero que você me informou é: "+ resultado);
            // eu tentei formatar para ficar apenas dois valores depois do ponto, mas sempre arredondava,
            // inclusive tentei usar a classe "DecimalFormat", mas aconteceu a mesma coisa...
            System.out.printf("A raíz cúbica do numero que você me informou, arredondada, é: %.2f", resultado);

        }
        else{
            resultado = Math.sqrt(numero);
            System.out.println("A raiz quadrada do numero que você me informou é: "+ resultado);
            // eu tentei formatar para ficar apenas dois valores depois do ponto, mas sempre arredondava,
            // inclusive tentei usar a classe "DecimalFormat", mas aconteceu a mesma coisa...
            System.out.printf("A raiz quadrada do numero que você me informou, arredondada, é: %.2f", resultado);

        }
    }
}
