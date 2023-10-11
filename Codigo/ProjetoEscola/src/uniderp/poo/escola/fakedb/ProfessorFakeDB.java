package uniderp.poo.escola.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.poo.escola.dominio.Professor;

public class ProfessorFakeDB extends BaseGenericaFakeDB<Professor> { // Subclasse da classe 'BaseGenericaFakeDB'
                                                                     // parametrizada com o tipo 'Professor'.
    @Override
    protected void CarregarDados() { // Este é um método de inicialização que carrega dados iniciais na tabela de
                                     // professores. No caso da classe ProfessorFakeDB, ele adiciona um professor
                                     // fictício à tabela.
        this.tabela = new ArrayList<Professor>();
        this.tabela.add(new Professor(10, LocalDate.now(), "Rua da Rua, 10", "99999999", "Marcos", "1234", "1234",
                LocalDate.of(1980, 11, 11), "123ab", "123123", LocalDate.of(2017, 5, 23), LocalDate.of(2022, 12, 10),
                "ab1")); // Um objeto 'Professor' é criado e adicionado à tabela de professores.
    }

    public ProfessorFakeDB() { // Método construtor da classe 'FornecedorFakeDB'. Quando um objeto dessa classe
                               // é criado, ele inicializa a tabela chamando 'CarregarDados()'.
        super(); // O construtor chama o construtor da classe pai usando 'super()' e isso garante
                 // que a tabela seja inicializada.
    }
}
