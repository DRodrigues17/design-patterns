package model.cliente;

import java.time.LocalDate;

public class Cliente {

    private String nome;
    private String documento;
    private LocalDate dataNascimento;
    private Endereco endereco;

    public Cliente(ClienteBuilder builder) {
        this.nome = builder.nome;
        this.documento = builder.documento;
        this.dataNascimento = builder.dataNascimento;
        this.endereco = builder.endereco;
    }

    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }

    public static class ClienteBuilder {

        private String nome;
        private String documento;
        private LocalDate dataNascimento;
        private Endereco endereco;

        public ClienteBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public ClienteBuilder documento(String documento) {
            this.documento = documento;
            return this;
        }

        public ClienteBuilder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public ClienteBuilder endereco(Endereco endereco){
            this.endereco = endereco;
            return this;
        }

        public Cliente build(){
            return new Cliente(this);
        }
    }



    public String getNome() {
        return nome;
    }

}
