package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);
        imprimirSelecao();
    }

    static void imprimirSelecao(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("Imprimindo com a ordem de seleção pelo índice");
		for(int x=0; x < candidatos.length; x++) {
			System.out.println((x+1)+ "° Candidato é " + candidatos [x] );
		}
		
		System.out.println("Imprimindo todos sem a necessidade de exibir o índice");
		
		for(String candidato: candidatos) {
			System.out.println(candidato);
		}
		
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
