package uniderp.poo.escola.fakedb;

import java.util.ArrayList;

public abstract class BaseGenericaFakeDB<TDominio> {

    public ArrayList<TDominio> tabela;

    public ArrayList<TDominio> getTabela() {
        if (this.tabela == null) {
            this.tabela = new ArrayList<TDominio>();
        }
        return this.tabela;
    }

    protected abstract void CarregarDados();

    public BaseGenericaFakeDB() {
        this.CarregarDados();
    }
}
