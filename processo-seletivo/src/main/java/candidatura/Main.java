package candidatura;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Processo Seletivo");
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 0;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
                System.out.println(tentativasRealizadas);
            }else{
                System.out.println("Contato realizado com sucesso");
            }
        }while(continuarTentando && tentativasRealizadas<3);
        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM "+candidato+" NA TENTATIVA "+(tentativasRealizadas+1));
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM "+candidato+", NUMERO MAXIMO DE TENTATIVAS "+tentativasRealizadas);
        }
    }

    //Função auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        int io=0;
        System.out.println("FOR EACH");
        for(String escolhidos : candidatos){
            System.out.println("O candidato " + (1+io++) + escolhidos + " foi selecionado");
        }
        System.out.println("Normal");
        for(int i=0;i<candidatos.length;i++){
            System.out.printf("O candidato de nº %d é o %s\n",i+1,candidatos[i]);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou este valor de salário %.2f\n",candidato, salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;

            }
            analisarCandidato(salarioPretendido,candidato);
            candidatoAtual++;
            if(candidatoAtual==candidatos.length){
                System.out.println("Sem candidatos o suficiente, "+candidatosSelecionados+" conseguiram a vaga");
            }
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido, String candidato){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO "+candidato);
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA PARA "+candidato);
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}