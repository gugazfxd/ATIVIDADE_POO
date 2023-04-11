import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double formulaDeConversao;
        System.out.println("""
                Digite qual a escala de temperatura será o valor a ser digitado:
                1---> Celsius(ºC);
                2---> Fahrenheit (ºF);
                3---> Kelvin (K).""");
        Scanner entrada = new Scanner(System.in);
        int escala = entrada.nextInt();
        switch(escala){
            // caso escolha Celsius --------------------------------------
            case 1:
                System.out.println("""
                        Okay você quer converter graus Celsius em qual escala?
                        1---> Fahrenheit (ºF);
                        2---> Kelvin (k).""");
                int conversao = entrada.nextInt();
                if(conversao == 1){
                    System.out.println("Okay, qual a temperatura em Celsius que voce quer converter para Fahrenheit?");
                    float temperatura = entrada.nextFloat();
                    formulaDeConversao = temperatura*(9/5)+32;
                    System.out.println("Conversão: "+formulaDeConversao+"ºF");
                } else if (conversao == 2) {
                    System.out.println("Okay, qual a temperatura em Celsius que voce quer converter para Kelvin?");
                    float temperatura = entrada.nextFloat();
                    formulaDeConversao = temperatura+273.15;
                    System.out.println("Conversão: "+formulaDeConversao+"K");
                }
                break;
            // caso escolha Fahrenheit -------------------------------
            case 2:
                System.out.println("""
                        Okay você quer converter graus Fahrenheit em qual escala?
                        1---> Celsius (ºC);
                        2---> Kelvin (k).""");
                conversao = entrada.nextInt();
                if(conversao == 1){
                    System.out.println("Okay, qual a temperatura em Fahrenheit que voce quer converter para Celsius?");
                    float temperatura = entrada.nextFloat();
                    formulaDeConversao = (temperatura-32)*(5/9);
                    System.out.println("Conversão: "+formulaDeConversao+"ºC");

                } else if (conversao == 2) {
                    System.out.println("Okay, qual a temperatura em Fahrenheit que voce quer converter para Kelvin?");
                    float temperatura = entrada.nextFloat();
                    formulaDeConversao = (temperatura-32)*(5/9)+273.15;
                    System.out.println("Conversão: "+formulaDeConversao+"ºK");

                }
                break;
            // caso escolha Kelvin ----------------------------------
            case 3:
                System.out.println("""
                        Okay você quer converter graus Kelvin em qual escala?
                        1---> Celsius (ºC);
                        2---> Fahrenheit (ºF).""");
                conversao = entrada.nextInt();
                if(conversao == 1){
                    System.out.println("Okay, qual a temperatura em Kelsin que voce quer converter para Celsius?");
                    float temperatura = entrada.nextFloat();
                    formulaDeConversao = temperatura - 273.15;
                    System.out.println("Conversão: "+formulaDeConversao+"ºC");
                } else if (conversao == 2) {
                    System.out.println("Okay, qual a temperatura em Kelsin que voce quer converter para Fahrenheit?");
                    float temperatura = entrada.nextFloat();
                    formulaDeConversao = (temperatura - 273.15)*(9/5)+32;
                    System.out.println("Conversão: "+formulaDeConversao+"ºF");
                }
                break;
        }

    }
}
