package model;

public class Pessoa {
     private String nome;
     private int numeroIrmaos;
     private String paisDeOrigem;
     private int idade;

     private static Pessoa instance = null;

     private Pessoa(){
        this.nome = "4M4Z0";
        this.numeroIrmaos = 2;
        this.paisDeOrigem = "Estados Unidos da América";
        this.idade = 10;
     }

    public static Pessoa getInstance() {
         if (instance == null){
             instance = new Pessoa();
         }
         return Pessoa.instance;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", numeroIrmaos=" + numeroIrmaos +
                ", paisDeOrigem='" + paisDeOrigem + '\'' +
                ", idade=" + idade +
                '}';
    }
}
