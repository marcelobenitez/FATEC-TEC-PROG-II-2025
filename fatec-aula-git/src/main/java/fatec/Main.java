package fatec;

// Importe aqui a classe do seu exemplo
import fatec.equipes.Professor;

// Os grupos deverão importar suas classes aqui

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("  Bem-vindos ao Nosso Projeto Colaborativo!");
        System.out.println("=========================================");
        System.out.println("Apresentação das Equipes:");

        // 1. Exemplo do Professor (já no commit inicial)
        Equipe prof = new Professor();
        prof.apresentar();


        // 2. CADA GRUPO DEVE ADICIONAR SUA APRESENTAÇÃO AQUI
        // Siga o modelo acima:
        //
        // Equipe grupoX = new GrupoX();
        // grupoX.apresentar();
        

    }
}