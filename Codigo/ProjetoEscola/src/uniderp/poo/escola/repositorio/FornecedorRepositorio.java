package uniderp.poo.escola.repositorio;

import uniderp.poo.escola.dominio.Fornecedor;
import uniderp.poo.escola.fakedb.FornecedorFakeDB;

public class FornecedorRepositorio extends BaseGenericaCRUD<FornecedorFakeDB, Fornecedor> {

    public FornecedorRepositorio() {
        this.db = new FornecedorFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Fornecedor Create(Fornecedor instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Fornecedor Read(int codigo) {
        for (Fornecedor fornecedor : this.dataset) {
            if (fornecedor.getCodigo() == codigo) {
                return fornecedor;
            }
        }
        return null;
    }

    @Override
    public Fornecedor Update(Fornecedor instancia) {
        Fornecedor alvo = this.Read(instancia.getCodigo());
        alvo.setCnpj(instancia.getCnpj());
        alvo.setCodigo(instancia.getCodigo());
        alvo.setDataAbertura(instancia.getDataAbertura());
        alvo.setDataContrato(instancia.getDataContrato());
        alvo.setDataInsercao(instancia.getDataInsercao());
        alvo.setEndereco(instancia.getEndereco());
        alvo.setIe(instancia.getIe());
        alvo.setNomeFantasia(instancia.getNomeFantasia());
        alvo.setPeriodoEmMeses(instancia.getPeriodoEmMeses());
        alvo.setRazaoSocial(instancia.getRazaoSocial());
        alvo.setServico(instancia.getServico());
        alvo.setTelefone(instancia.getTelefone());
        return alvo;
    }

    @Override
    public Fornecedor Delete(int codigo) {
        Fornecedor alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }

}
