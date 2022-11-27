package model.factory;

import model.iso.Iso;
import model.app.Programa;

public interface Fabrica {

    Iso instalarIso();
    Programa baixarPrograma();
}
