
package principal;

import java.util.Scanner;
public class Jogador extends Personagem{
    private String nome;
    private String email;
    private String apelido;
    private String telefone;
    
   Scanner input = new Scanner(System.in); 
    public Jogador(){
       
        }
         
    public String getNome(){
         return nome;
    }
    public void setNome(){
       System.out.println("Insira seu nome: ");
        this.nome = input.nextLine();
    }
   
      
    public String getEmail() {
        return email;
    }

    public void setEmail() {
         System.out.println("Digite o email: ");
        this.email = input.nextLine();
       
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido() {
         System.out.println("Digite o apelido: ");
        this.apelido = input.nextLine();
      
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone() {
       System.out.println("Digite o telefone: ");
        this.telefone = input.nextLine();
    }


   public void cadastro(){
       this.setNome();
       this.setApelido();
       this.setEmail();
       this.setTelefone();
       
   }


@Override
public String toString(){//Não tem parâmetro, a forma que quero que seja mostrada esse objeto
//Polimorfismo, aqui estou pegando o método com a mesma assinatura e modificando o corpo dele
        return "Nome: " + this.nome + "\n" +
        "email: " + this.email + "\n" +
                "Apelido: " + this.apelido + "\n"+
                "Telefone: " + this.telefone + "\n";
}
}
    