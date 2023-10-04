package uniderp.poo.escola.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.poo.escola.dominio.Fornecedor;

public class FornecedorFakeDB {

    private ArrayList<Fornecedor> tabela;

    public ArrayList<Fornecedor> getTabela() {
        if (this.tabela == null) {
            this.tabela = new ArrayList<Fornecedor>();
        }
        return this.tabela;
    }

    private void CarregarDados() {
        this.tabela = new ArrayList<Fornecedor>();
        this.tabela.add(new Fornecedor(1, LocalDate.now(), "Rua dos Anjos, 109", "999999999", "Capital FM",
                "Capital 95", "99999", "123", LocalDate.of(2000, 7, 31), "Jogos", LocalDate.of(2017, 7, 17), 12));
    }

    public FornecedorFakeDB() {
        this.CarregarDados();
    }
}
