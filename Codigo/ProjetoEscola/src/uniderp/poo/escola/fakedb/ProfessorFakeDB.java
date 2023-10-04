package uniderp.poo.escola.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.poo.escola.dominio.Professor;

public class ProfessorFakeDB {
    private ArrayList<Professor> tabela;

    public ArrayList<Professor> getTabela() {
        if (this.tabela == null) {
            this.tabela = new ArrayList<Professor>();
        }
        return this.tabela;
    }

    private void CarregarDados() {
        this.tabela = new ArrayList<Professor>();
        this.tabela.add(new Professor(10, LocalDate.now(), "Rua da Rua, 10", "99999999", "Marcos", "1234", "1234",
                LocalDate.of(1980, 11, 11), "123ab", "123123", LocalDate.of(2017, 5, 23), LocalDate.of(2022, 12, 10),
                "ab1"));
    }

    public ProfessorFakeDB() {
        this.CarregarDados();
    }
}
