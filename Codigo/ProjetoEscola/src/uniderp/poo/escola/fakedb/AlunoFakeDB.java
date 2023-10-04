package uniderp.poo.escola.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.poo.escola.dominio.Aluno;

public class AlunoFakeDB {
    private ArrayList<Aluno> tabela;

    // Design Pattern Singleton
    public ArrayList<Aluno> getTabela() {
        if (this.tabela == null) {
            this.tabela = new ArrayList<Aluno>();
        }
        return this.tabela;
    }

    private void CarregarDados() {
        this.tabela = new ArrayList<Aluno>();
        this.tabela.add(new Aluno(1, LocalDate.now(), "Rua X, 10", "991023456", "Mateus", "123456", "987654",
                LocalDate.of(1994, 6, 5), "20201001", LocalDate.of(2020, 1, 20)));
        this.tabela.add(new Aluno(2, LocalDate.now(), "Rua X, 15", "991023454", "Lucas", "123455", "987653",
                LocalDate.of(1993, 6, 5), "20201002", LocalDate.of(2020, 1, 20)));
        this.tabela.add(new Aluno(3, LocalDate.now(), "Rua X, 20", "991023453", "Pedro", "123454", "987652",
                LocalDate.of(1994, 7, 5), "20201003", LocalDate.of(2020, 1, 20)));
        this.tabela.add(new Aluno(4, LocalDate.now(), "Rua X, 25", "991023452", "Tiago", "123453", "987651",
                LocalDate.of(1994, 3, 5), "20201004", LocalDate.of(2020, 1, 2)));
        this.tabela.add(new Aluno(5, LocalDate.now(), "Rua X, 30", "991023451", "João", "123452", "987658",
                LocalDate.of(1995, 2, 25), "20201005", LocalDate.of(2020, 1, 10)));
    }

    public AlunoFakeDB() {
        this.CarregarDados();
    }
}
