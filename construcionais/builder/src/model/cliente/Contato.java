package model.cliente;

import java.time.LocalDate;

public class Contato {

    private String telefoneResidencial;
    private String telefoneCelular;
    private String email;

    public Contato(ContatoBuilder builder) {
        this.telefoneResidencial = builder.telefoneResidencial;
        this.telefoneCelular = builder.telefoneCelular;
        this.email = builder.email;
    }

    public static ContatoBuilder builder(){
        return new  ContatoBuilder();
    }

    public static class ContatoBuilder{

        private String telefoneResidencial;
        private String telefoneCelular;
        private String email;

        public ContatoBuilder telefoneResidencial(String telefoneResidencial) {
            this.telefoneResidencial = ContatoBuilder.this.telefoneResidencial;
            return this;
        }

        public ContatoBuilder telefoneCelular(String telefoneCelular) {
            this.telefoneCelular = ContatoBuilder.this.telefoneCelular;
            return this;
        }

        public ContatoBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Contato build(){
            return new Contato(this) {
            };
        }
    }
}
