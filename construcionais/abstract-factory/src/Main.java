import model.Application;
import model.factory.Fabrica;
import model.factory.FabricaLinux;
import model.factory.FabricaMac;
import model.factory.FabricaWindows;

public class Main {



    private static Application configureApplication() {
        Application app;
        Fabrica fabrica;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            fabrica = new FabricaMac();
        } else if (osName.contains("windows")){
            fabrica = new FabricaWindows();
        } else {
            fabrica = new FabricaLinux();
        }
        app = new Application(fabrica);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.print();
    }
}