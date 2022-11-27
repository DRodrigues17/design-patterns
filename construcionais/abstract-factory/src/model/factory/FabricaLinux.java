package model.factory;

import model.app.Programa;
import model.iso.Iso;
import model.app.ProgramaLinux;
import model.iso.LinuxIso;

public class FabricaLinux implements Fabrica {

    @Override
    public Iso instalarIso() {
        return new LinuxIso();
    }

    @Override
    public Programa baixarPrograma() {
        return new ProgramaLinux();
    }
}
