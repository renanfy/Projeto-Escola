package uniderp.poo.escola.servico;

import java.util.ArrayList;

import uniderp.poo.escola.dominio.Fornecedor;
import uniderp.poo.escola.repositorio.FornecedorRepositorio;

public class FornecedorServico extends BaseGenericaServico<FornecedorRepositorio, Fornecedor> {

    public FornecedorServico() {
        this.repo = new FornecedorRepositorio();
    }

    @Override
    public Fornecedor Inserir(Fornecedor tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public Fornecedor Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Fornecedor> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Fornecedor Atualizar(Fornecedor tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Fornecedor Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }

}
