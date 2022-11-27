package model.cliente;

public class Endereco {

    private String logradouro;
    private String numero;
    private String cep;
    private String estado;
    private Contato contatoCLiente;

    public Endereco(EnderecoBuilder builder) {
        this.logradouro = builder.logradouro;
        this.numero = builder.numero;
        this.cep = builder.cep;
        this.estado = builder.estado;
        this.contatoCLiente = builder.contatoCLiente;
    }

    public static EnderecoBuilder builder(){
        return new EnderecoBuilder();
    }

    public static class EnderecoBuilder{

        private String logradouro;
        private String numero;
        private String cep;
        private String estado;
        private Contato contatoCLiente;

        public EnderecoBuilder logradouro(String logradouro){
            this.logradouro = logradouro;
            return this;
        }

        public EnderecoBuilder numero(String numero){
            this.numero = numero;
            return this;
        }

        public EnderecoBuilder cep(String cep){
            this.cep = cep;
            return this;
        }

        public EnderecoBuilder estado(String estado){
            this.estado = estado;
            return this;
        }

        public EnderecoBuilder contatoCLiente(Contato contatoCLiente){
            this.contatoCLiente = contatoCLiente;
            return this;
        }


        public Endereco build(){
            return new Endereco(this);
        }

    }

}
