package principal;

import java.util.Scanner;

/**
 *
 *
 * @author Dayvson
 */
public class PRINCIPAL_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("SEJA BEM VINDO AO GAME QUIZ!\n"
                + "1 - Iniciar o Jogo.\n"
                + "2 - Informação dos Desenvolvedores.\n"
                + "3 - Regras do Jogo.\n"
                + "4 - SAIR.");
        Scanner input = new Scanner(System.in);
        int escolha = input.nextInt();
        switch (escolha) {
            case 1:
                Jogo();
                break;
            case 2:
                info();
                break;
            case 3:
                regra();
                break;
            case 4:
                break;

        }
    }

    public static void Jogo() {

        Pergunta p1 = new Pergunta();

        Jogador j1 = new Jogador();
        j1.cadastro();
        j1.escolherPersonagem();
        Jogador j2 = new Jogador();
        j2.cadastro();
        j2.escolherPersonagem();
        p1.preencherPergunta(j1.getNome(), j2.getNome());

    }

    public static void info() {
        System.out.println("DESENVOLVEDORES:\n"
                + "*****************************************\n"
                + "Ana Paula Carolina de Medeiros, RA: 321218617, aluna do curso de ADS.\n"
                + "Dayvson do Carmo Gomes, RA: 321217293, aluno do curso de Sistemas de informação.\n"
                + "Vagner Souza Rodrigues, RA:321221005, aluno do curso de Sistemas de informação.\n"
                + "Wesley Filipe da Silva, RA:321219499, aluno do curso de Ciências da computação."
        );

    }

    public static void regra() {
        System.out.println("REGRAS DO JOGO: \n\n******************************\n"
                + "Cada jogador dever escoher um personagem;\n"
                + "Ambos iniciam com 100% de vida;\n"
                + "cada pergunta errada será decrementada 10% de vida;\n"
                + "Para iniciar o jogo é necessário dois jogadores;\n"
                + "O primeiro jogador a atingir 05 de vida será o perdedor da partida;\n"
                + "Vence o jogador que tiver a maior porcentagem de vida.");
    }
}
/*  Scanner jogador = new Scanner(System.in);
        
                   
       int acesso = 0;
        
       System.out.println("*************");
       System.out.println("***   SEJA BEM VINDO AO GAME QUIZ!   ***");
       System.out.println("************");
       
        Scanner menu = new Scanner(System.in);
        Scanner personagem = new Scanner(System.in);
        int opcao = 1;
        
             
            System.out.println("\nDIGITE A OPÇÃO DESEJADA DO MENU:" );
            System.out.println("___________________________________");
            System.out.println("1 - Iniciar o jogo.");
            System.out.println("2 - Informações dos desenvolvedores.\n");
                      
            System.out.println("3 - Explicação do Jogo Game Quiz.");
            System.out.println("4 - SAIR.");
            System.out.println("NÚMERO: ");
            
         
          int escolhaMenu = menu.nextInt();
                Jogador j = new Jogador();
                System.out.println (Jogador.toString)();
                System.out.println(jogador);
            
          switch(escolhaMenu){
              
              case 1 :
                 Jogador j = new Jogador("Daniel","123@hotmail.com","jj","123");
                 System.out.println(jogador.toString());
                 
          break; 
          
              case 2 :
                 System.out.println("Informações dos desenvolvedores: " ); 
          break;
          
              case 3 :
                 System.out.println("Explicação do jogo");
          break;
          
              case 4 :
                System.out.println("Sair. ");
         break;
          }      
       }
    } */
