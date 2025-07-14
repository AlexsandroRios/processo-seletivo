package candidatura;
public class Main {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        analisarCandidato(1820.65);
        analisarCandidato(3000);
        analisarCandidato(2000);
    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}