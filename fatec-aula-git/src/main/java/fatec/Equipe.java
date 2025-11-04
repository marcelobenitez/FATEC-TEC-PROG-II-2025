package fatec;

/**
 * Interface (Contrato) que todas as equipes devem implementar
 * para se apresentar no projeto.
 */
public interface Equipe {

    /**
     * @return O nome oficial do grupo.
     */
    String getNomeEquipe();

    /**
     * @return O nome dos membros (separados por vírgula ou como preferir).
     */
    String getMembros();

    /**
     * @return Uma breve descrição ou "grito de guerra" da equipe.
     */
    String getDescricao();

    /**
     * Método padrão que imprime a apresentação da equipe no console.
     */
    default void apresentar() {
        System.out.println("\n--- Apresentação da Equipe ---");
        System.out.println("Nome: " + getNomeEquipe());
        System.out.println("Membros: " + getMembros());
        System.out.println("Descrição: " + getDescricao());
    }
}