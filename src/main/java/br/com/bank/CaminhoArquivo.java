package br.com.bank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CaminhoArquivo {

    private Path diretorio;
    private Path arquivo;
    private static final String RAIZ = "/tmp/";

    private CaminhoArquivo(Path diretorio, Path arquivo) {
        super();
        this.diretorio = diretorio;
        this.arquivo = arquivo;
    }

    public Path getDiretorio() {
        return diretorio;
    }

    public Path getArquivo() {
        return arquivo;
    }

    public static CaminhoArquivo getInstance(Integer id) {
        String diretorio = null;
        String arquivo = null;
        int subdiretorio = 1;

        if (id > 1000) {
            subdiretorio = subdiretorio + 1;
        }
        if (id > 2000) {
            subdiretorio = subdiretorio + 1;
        }
        diretorio = RAIZ + subdiretorio;
        arquivo = diretorio + "/" + id;

        return new CaminhoArquivo(Paths.get(diretorio), Paths.get(arquivo));

    }

}
