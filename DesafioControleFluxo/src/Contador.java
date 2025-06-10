import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        // Instanciando Scanner
        Scanner terminal = new Scanner(System.in);

        int paramUm;
        int paramDois;

        // Solicitando parametros e atribuindo às suas variáveis
        System.out.println("Insira o primeiro parametro");
        paramUm = terminal.nextInt();
        System.out.println("Insira o segundo parametro");
        paramDois = terminal.nextInt();

        contar(paramUm, paramDois);

        terminal.close();
    }

    private static void contar(int paramUm, int paramDois){

        // Checando parametros e lançando exceção
        if (paramUm > paramDois) {
            throw new ParametrosInvalidosException("O primeiro parametro não pode ser menor que o segundo");
        }

        // Definindo limite do contador
        int contador = paramDois - paramUm;

        // Realizando a contagem
        for(int i = 1; i <= contador; i++){
            System.out.println("Imprimindo o número "+i);
        }

    }
}