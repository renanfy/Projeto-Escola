package uniderp.poo.escola.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.poo.escola.dominio.Fornecedor;

public class FornecedorFakeDB extends BaseGenericaFakeDB<Fornecedor> { // Subclasse da classe 'BaseGenericaFakeDB'
                                                                       // parametrizada com o tipo 'Fornecedor'.

    @Override // Método sobrescrito da classe pai, está substituindo um método da classe pai.
    protected void CarregarDados() {
        this.tabela = new ArrayList<Fornecedor>();
        this.tabela.add(new Fornecedor(9977, LocalDate.now(), "Rua da Garrafa, 51", "67999999999", "Nome Fantasia",
                "Razao123", "08000123000120", "1202000", LocalDate.of(2002, 7, 22), "Peças", LocalDate.of(2014, 2, 13),
                24));
        this.tabela.add(new Fornecedor(99772, LocalDate.now(), "Rua da Garrafa, 5221", "679999999", "Nome Fansia",
                "Ra23", "08000143000120", "1241241", LocalDate.of(2002, 7, 30), "Alimentício",
                LocalDate.of(2014, 2, 29), 12));
    }

    public FornecedorFakeDB() { // Método construtor da classe 'FornecedorFakeDB'. Quando um objeto dessa classe
                                // é criado, ele inicializa a tabela chamando 'CarregarDados()'.
        super(); // O construtor chama o construtor da classe pai usando 'super()' e isso garante
                 // que a tabela seja inicializada.
    }
}
