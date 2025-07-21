package contador;

import excecoes.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Digite o número inicial: ");
            int n1 = scanner.nextInt();
            System.out.print("Digite o número final: ");
            int n2 = scanner.nextInt();
            if (n1 > n2) {
                try {
                    throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
                } catch (ParametrosInvalidosException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                contar(n1, n2);
                break;
            }
        }
    }
    public static void contar(int n1, int n2){
        for(int i=n1;i<=n2;i++){
            System.out.println(i);
        }
    }
}