package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Tecnico extends BaseFuncionario { // 'Tecnico' é subclasse da classe 'BaseFuncionario' logo herda seus
                                               // atributos e métodos.
    private String setor;

    // GETTERS E SETTERS

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    // MÉTODO CONSTRUTOR.
    // Este é o construtor da classe 'Tecnico'. Ao criar um objeto 'Tecnico' esse
    // construtor é chamado para inicializar as informações do Tecnico, incluindo os
    // herdados da classe
    // 'BaseFuncionario', além dos atributos específicos da classe 'Tecnico'.

    public Tecnico(int codigo, LocalDate dataInsercao, String endereco, String telefone, String nome, String rg,
            String cpf, LocalDate dataNascimento, String cracha, String registro, LocalDate dataVinculoInicial,
            LocalDate dataVinculoFinal, String setor) {
        super(codigo, dataInsercao, endereco, telefone, nome, rg, cpf, dataNascimento, cracha, registro,
                dataVinculoInicial, dataVinculoFinal);
        this.setor = setor;
    }

    @Override // Esse método é sobrescrito da classe 'BaseFuncionario' e imprime as
    // informações sobre o Funcionário.
    public void Imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Crachá: " + this.cracha);
        System.out.println("Registro: " + this.registro);
        System.out.println("Setor: " + this.setor);
        System.out.println("Data de Vínculo Inicial: " + this.dataVinculoInicial);
        System.out.println("Data de Vínculo Final: " + this.dataVinculoFinal);
        System.out.println("Data de Inserção:" + this.dataInsercao);
    }
}
