package model.pessoa;

import java.time.LocalDate;

public abstract class Pessoa {

    private String nome;
    private LocalDate nascimento;
    private boolean isEstudante;
    private String documento;

    public Pessoa(PessoaBuilder builder) {
        this.nome = builder.nome;
        this.nascimento = builder.nascimento;
        this.isEstudante = builder.isEstudante;
        this.documento = builder.documento;
    }

    public static PessoaBuilder builder(){
        return new  PessoaBuilder();
    }

    public static class PessoaBuilder{

        protected String nome;
        protected LocalDate nascimento;
        protected boolean isEstudante;
        protected String documento;

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder nascimento(LocalDate nascimento) {
            this.nascimento = nascimento;
            return this;
        }

        public PessoaBuilder isEstudante(boolean isEstudante) {
            this.isEstudante = isEstudante;
            return this;
        }

        public PessoaBuilder documento(String documento) {
            this.documento = documento;
            return this;
        }

        public Pessoa build(){
            return new Pessoa(this) {
            };
        }
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public boolean isEstudante() {
        return isEstudante;
    }

    public String getDocumento() {
        return documento;
    }
}
