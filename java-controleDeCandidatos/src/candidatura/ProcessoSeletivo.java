package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);
        selecaoDeCandidatos();
    }

    static void selecaoDeCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;          
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual <  candidatos.length) {
            String canditado = candidatos[candidatoAtual];
            double salarioPretendido =valorPretendido();
            System.out.println("Canditado " + canditado + " Deseja " + salarioPretendido);
            if (salarioPretendido <= salarioBase) {
                System.out.println("Candidato " + canditado + " foi selecionado ");
                candidatosSelecionados ++;  
            }
            candidatoAtual++;

        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA OCANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else {
            System.out.println(" AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }
}
