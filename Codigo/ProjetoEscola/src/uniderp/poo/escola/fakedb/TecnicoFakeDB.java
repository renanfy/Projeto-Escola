package uniderp.poo.escola.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.poo.escola.dominio.Tecnico;

public class TecnicoFakeDB extends BaseGenericaFakeDB<Tecnico> {// Subclasse da classe 'BaseGenericaFakeDB'
                                                                // parametrizada com o tipo 'Tecnico'.

    @Override
    protected void CarregarDados() { // Este é um método de inicialização que carrega dados iniciais na tabela de
                                     // técnicos. No caso da classe TecnicoFakeDB, ele adiciona um técnico fictício à
                                     // tabela.
        this.tabela = new ArrayList<Tecnico>();
        this.tabela.add(new Tecnico(23, LocalDate.now(), "Rua da Rua, 1000", "67998224701", "Renan", "123321", "123321",
                LocalDate.of(2003, 8, 19), "Cracha123", "Registro123", LocalDate.of(2023, 8, 10),
                LocalDate.of(2023, 10, 31), "TI")); // Um objeto 'Tecnico' é criado e adicionado à tabela de técnicos.
    }

    public TecnicoFakeDB() { // Método construtor da classe 'TecnicoFakeDB'. Quando um objeto dessa classe
                             // é criado, ele inicializa a tabela chamando 'CarregarDados()'.
        super(); // O construtor chama o construtor da classe pai usando 'super()' e isso garante
        // que a tabela seja inicializada.
    }
}
