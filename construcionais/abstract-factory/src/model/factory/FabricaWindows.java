package model.factory;

import model.app.Programa;
import model.iso.Iso;
import model.app.ProgramaWindows;
import model.iso.WindowsIso;

public class FabricaWindows implements Fabrica {

    @Override
    public Iso instalarIso() {
        return new WindowsIso();
    }

    @Override
    public Programa baixarPrograma() {
        return new ProgramaWindows();
    }
}
