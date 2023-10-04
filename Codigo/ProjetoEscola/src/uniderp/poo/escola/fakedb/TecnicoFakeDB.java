package uniderp.poo.escola.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.poo.escola.dominio.Tecnico;

public class TecnicoFakeDB {
    private ArrayList<Tecnico> tabela;

    public ArrayList<Tecnico> getTabela() {
        if (this.tabela == null) {
            this.tabela = new ArrayList<Tecnico>();
        }
        return this.tabela;
    }

    private void CarregarDados() {
        this.tabela = new ArrayList<Tecnico>();
        this.tabela.add(new Tecnico(22, LocalDate.now(), "Rua dos Deuses, 21", "99991111", "Marcel", "123", "123123",
                LocalDate.of(2002, 4, 10), "123a", "123123123", LocalDate.of(2021, 5, 30), LocalDate.of(2023, 8, 1),
                "Azul"));
    }

    public TecnicoFakeDB() {
        this.CarregarDados();
    }
}
