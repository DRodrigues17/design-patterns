package model.factory;

import model.app.Programa;
import model.iso.Iso;
import model.app.ProgramaMac;
import model.iso.MacIso;

public class FabricaMac implements Fabrica {

    @Override
    public Iso instalarIso() {
        return new MacIso();
    }

    @Override
    public Programa baixarPrograma() {
        return new ProgramaMac();
    }
}
