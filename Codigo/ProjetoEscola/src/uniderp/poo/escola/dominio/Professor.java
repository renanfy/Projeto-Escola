package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Professor extends BaseFuncionario { // 'Professor' é subclasse da classe 'BaseFuncionario' logo herda seus
                                                 // atributos e métodos.
    private String cadeira;

    // GETTERS E SETTERS

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    // MÉTODO CONSTRUTOR.
    // Este é o construtor da classe 'Professor'. Ao criar um objeto 'Professor'
    // esse
    // construtor é chamado para inicializar as informações do Professor, incluindo
    // os
    // herdados da classe
    // 'BaseFuncionario', além dos atributos específicos da classe 'Professor'.

    public Professor(int codigo, LocalDate dataInsercao, String endereco, String telefone, String nome, String rg,
            String cpf, LocalDate dataNascimento, String cracha, String registro, LocalDate dataVinculoInicial,
            LocalDate dataVinculoFinal, String cadeira) {
        super(codigo, dataInsercao, endereco, telefone, nome, rg, cpf, dataNascimento, cracha, registro,
                dataVinculoInicial, dataVinculoFinal);
        this.cadeira = cadeira;
    }

    @Override // Esse método é sobrescrito da classe 'BaseFuncionario' e imprime as
    // informações sobre o Professor.
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
        System.out.println("Cadeira: " + this.cadeira);
        System.out.println("Data de Vínculo Inicial: " + this.dataVinculoInicial);
        System.out.println("Data de Vínculo Final: " + this.dataVinculoFinal);
        System.out.println("Data de Inserção:" + this.dataInsercao);
    }
}
