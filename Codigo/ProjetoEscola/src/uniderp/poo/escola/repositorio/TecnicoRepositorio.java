package uniderp.poo.escola.repositorio;

import uniderp.poo.escola.dominio.Tecnico;
import uniderp.poo.escola.fakedb.TecnicoFakeDB;

public class TecnicoRepositorio extends BaseGenericaCRUD<TecnicoFakeDB, Tecnico> {

    @Override
    public Tecnico Create(Tecnico instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Tecnico Read(int codigo) {
        for (Tecnico tecnico : this.dataset) {
            if (tecnico.getCodigo() == codigo) {
                return tecnico;
            }
        }
        return null;
    }

    @Override
    public Tecnico Update(Tecnico instancia) {
        Tecnico alvo = this.Read(instancia.getCodigo());
        alvo.setCodigo(instancia.getCodigo());
        alvo.setCpf(instancia.getCpf());
        alvo.setCracha(instancia.getCracha());
        alvo.setDataInsercao(instancia.getDataInsercao());
        alvo.setDataNascimento(instancia.getDataNascimento());
        alvo.setDataVinculoFinal(instancia.getDataVinculoFinal());
        alvo.setDataVinculoInicial(instancia.getDataVinculoInicial());
        alvo.setEndereco(instancia.getEndereco());
        alvo.setNome(instancia.getNome());
        alvo.setRegistro(instancia.getRegistro());
        alvo.setRg(instancia.getRg());
        alvo.setSetor(instancia.getSetor());
        alvo.setTelefone(instancia.getTelefone());
        return alvo;

    }

    @Override
    public Tecnico Delete(int codigo) {
        Tecnico alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }

}
