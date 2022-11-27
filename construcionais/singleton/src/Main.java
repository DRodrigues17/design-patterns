import model.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa du = Pessoa.getInstance();
        Pessoa dudu = Pessoa.getInstance();
        Pessoa edu = Pessoa.getInstance();

        System.out.println("du = " + du.toString());
        System.out.println("dudu = " + dudu.toString());
        System.out.println("edu = " + edu.toString());
    }

}