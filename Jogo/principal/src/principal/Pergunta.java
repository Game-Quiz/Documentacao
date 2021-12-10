package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Pergunta {
    
    private String enunciado;
   
    
    Scanner input = new Scanner(System.in);
    
    public Pergunta() {
        
        
    }
    
           
    
    public void preencherPergunta(String jogador1, String jogador2) {
        Alternativa a1 = new Alternativa();
        
        String[] pergunta = {"O que é encapsulamento?",
            "Como você pode recuperar um valor de um método",
            "O Java fornece automaticamente um cronstrutor para cada classe",
            "Qual afirmação é verdadeira sobre pacotes",
            "Qual método retorna o comprimento de uma String",
            "Qual classe é usada para gerar números aleatórias",
            "A instanciação de uma classe é feita usando qual palavra-chave",
            "Qual é o risco de usar nomes de classe totalmente qualificados durante a importação",
            "A classe Scanner considera o espaço como um delimitador padrão enquanto lê",
            "Qual a palavra chave faz com que o valor da variável seja invariável?"};
        char[] respostasEnun = {'B', 'B', 'A', 'B', 'C', 'D', 'D', 'A', 'A', 'D'};
        
        int respostaPar = 0, respostaImpar = 0;
        
        for (int i = 0; i < pergunta.length; i++) {
            System.out.println("{" + (i + 1) + "}" + pergunta[i]);
            a1.respostas(i);
            char resposta = input.nextLine().toUpperCase().charAt(0);
            if (resposta == respostasEnun[i]) {
                System.out.println("Você Acertou!");
                
                if (i % 2 == 0) {
                    respostaPar++;
                } else {
                    respostaImpar++;
                }
            } else {
                System.out.println("Você Errou!");
            }
        }
        String vencedor;
        if (respostaPar > respostaImpar) {
            vencedor = jogador2;
        } else if (respostaImpar > respostaPar) {
            vencedor = jogador1;
        } else {
            vencedor = "Empatou";
        }
        resultado(respostaPar, respostaImpar, vencedor, jogador1, jogador2);
    }

    public void resultado(int respostaPar, int respostaImpar, String vencedor, String nomej1, String nomej2) {
        System.out.println(nomej1 + " = " + respostaImpar);
        System.out.println(nomej2 + " = " + respostaPar);
        if (vencedor != "Empatou.") {
            System.out.println("O vencedor foi = " + vencedor);
        } else {
            System.out.println(vencedor);
        }
    }    
    
}
