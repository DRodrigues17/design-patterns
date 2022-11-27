package model.pessoa;

import model.Evento;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa{

  private String login;
  private String senha;
  List<Evento> eventos = new ArrayList<>();

  public Usuario(PessoaBuilder builder) {
   super(builder);
  }

  public static UsuarioBuilder builder(){
    return new UsuarioBuilder();
  }

  public static class UsuarioBuilder extends Pessoa.PessoaBuilder{

    private String login;
    private String senha;
    private List<Evento> eventos;

    public UsuarioBuilder login(String login){
      this.login = login;
      return this;
    }

    public UsuarioBuilder senha(String senha){
      this.senha = senha;
      return this;
    }

    public UsuarioBuilder eventos(List<Evento> eventos){
      this.eventos = eventos;
      return this;
    }


    @Override
    public Usuario build(){
      return new Usuario(this);
    }

  }

  public String getLogin() {
    return login;
  }

  public String getSenha() {
    return senha;
  }

  public List<Evento> getEventos() {
    return eventos;
  }

  public int getIdade(){
    Period tempo = Period.between(getNascimento(), LocalDate.now());
    return tempo.getYears();
  }

  public void adcionarEvento(Evento evento) {
    this.eventos.add(evento);
  }

  public String listarEventos(){
    return eventos.toString();
  }
}
