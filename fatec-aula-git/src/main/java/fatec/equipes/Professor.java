package fatec.equipes;

import fatec.Equipe;

/**
 * Classe de exemplo do Professor para a atividade.
 */
public class Professor implements Equipe {

    @Override
    public String getNomeEquipe() {
        return "Equipe de Exemplo (Professor)";
    }

    @Override
    public String getMembros() {
        return "Prof. Marcelo Benitez";
    }

    @Override
    public String getDescricao() {
        return "Classe modelo para a atividade de Git.";
    }
    
    // O método apresentar() já é fornecido pela interface!
}