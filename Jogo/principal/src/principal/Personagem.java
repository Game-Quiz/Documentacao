package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Personagem extends Pergunta {

    private String nome;
    private boolean status;
    private String habilidades;
    private int tempoDeVida;

    Scanner input = new Scanner(System.in);

    public Personagem() {

    }

    public void escolherPersonagem() {
        String[][] personagem = {{"Zambia", "Gigante", "Naomi", "Arqueira", "Thor"},
        {"Inteligência", "Força", "Agilidade", "Precisão", "Velocidade"}};
        System.out.println("Escolha seu personagem: ");
        for (int i = 0; i < personagem[0].length; i++) {
            System.out.println("[" + (i + 1) + "] " + personagem[0][i]);
        }
        int escolha = input.nextInt() - 1;
        this.nome = personagem[0][escolha];
        this.habilidades = personagem[1][escolha];
        System.out.println(this.nome + "-" + this.habilidades);
    }

    public String getNome() {
        return nome;

    }

    public boolean getStatus() {
        return status;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public int getTempoDeVida() {
        return tempoDeVida;
    }

    @Override
    public String toString() {
        return "nome: " + this.nome + "\n"
                + "Status: " + this.status + "\n"
                + "habilidades: " + this.habilidades + "\n"
                + "tempo de vida: " + this.tempoDeVida;

    }

}
