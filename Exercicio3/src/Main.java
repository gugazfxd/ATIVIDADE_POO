import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int repeticao=0;
        do {
            System.out.println("Digite seu nome e sobrenome: ");
            Scanner entrada = new Scanner(System.in);
            String nome = entrada.nextLine().toLowerCase();
            if (nome.equals("diana")) {
                System.out.println("Bem-vinda, Princesa de Themyscara");
            } else {
                System.out.println("Digite seu sobrenome");
                String sobrenome = entrada.nextLine().toLowerCase();
                if (sobrenome.equals("wayne")) {
                    System.out.println("Acesso liberado, sr.Wayne");
                    System.exit(0);
                } else if (sobrenome.equals("kent")) {
                    System.out.println("Sai daí,mané!");
                    System.out.println("Quer tentar novamente?? \n 0-[Sim] \n Outro numero-[Não]");
                    repeticao = entrada.nextInt();
                } else {
                    System.out.println("Cai fora!");
                    System.out.println("Quer tentar novamente?? \n 0-[Sim] \n Outro numero-[Não]");
                    repeticao = entrada.nextInt();
                }
            }
        }while(repeticao==0);
    }
}