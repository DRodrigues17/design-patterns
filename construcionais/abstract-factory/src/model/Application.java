package model;

import model.app.Programa;
import model.factory.Fabrica;
import model.iso.Iso;

public class Application {

    private Iso iso;
    private Programa programa;

    public Application(Fabrica fabrica) {
        iso = fabrica.instalarIso();
        programa = fabrica.baixarPrograma();
    }

    public void print(){
        iso.instalarIso();
        programa.baixarApp();
    }
}
