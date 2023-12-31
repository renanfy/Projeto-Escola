package uniderp.poo.escola.repositorio;

import uniderp.poo.escola.dominio.Professor;
import uniderp.poo.escola.fakedb.ProfessorFakeDB;

public class ProfessorRepositorio extends BaseGenericaCRUD<ProfessorFakeDB, Professor> {

    public ProfessorRepositorio() {
        this.db = new ProfessorFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Professor Create(Professor instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Professor Read(int codigo) {
        for (Professor professor : this.dataset) {
            if (professor.getCodigo() == codigo) {
                return professor;
            }
        }
        return null;
    }

    @Override
    public Professor Update(Professor instancia) {
        Professor alvo = this.Read(instancia.getCodigo());
        alvo.setCadeira(instancia.getCadeira());
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
        alvo.setTelefone(instancia.getTelefone());
        return alvo;
    }

    @Override
    public Professor Delete(int codigo) {
        Professor alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }

}
