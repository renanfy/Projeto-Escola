package uniderp.poo.escola.servico;

import java.util.ArrayList;

import uniderp.poo.escola.dominio.Tecnico;
import uniderp.poo.escola.repositorio.TecnicoRepositorio;

public class TecnicoServico extends BaseGenericaServico<TecnicoRepositorio, Tecnico> {

    public TecnicoServico() {
        this.repo = new TecnicoRepositorio();
    }

    @Override
    public Tecnico Inserir(Tecnico tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public Tecnico Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Tecnico> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Tecnico Atualizar(Tecnico tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Tecnico Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }

}
