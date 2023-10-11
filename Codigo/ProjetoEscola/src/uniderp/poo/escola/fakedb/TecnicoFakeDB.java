package uniderp.poo.escola.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.poo.escola.dominio.Tecnico;

public class TecnicoFakeDB extends BaseGenericaFakeDB<Tecnico> {

    @Override
    protected void CarregarDados() {
        this.tabela = new ArrayList<Tecnico>();
        this.tabela.add(new Tecnico(23, LocalDate.now(), "Rua da Rua, 1000", "67998224701", "Renan", "123321", "123321",
                LocalDate.of(2003, 8, 19), "Cracha123", "Registro123", LocalDate.of(2023, 8, 10),
                LocalDate.of(2023, 10, 31), "TI"));
    }

    public TecnicoFakeDB() {
        super();
    }
}
