package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoaFisica { // 'Aluno' é subclasse da classe 'BasePessoaFisica' logo herda seus
                                              // atributos e métodos.
    private String matricula;
    private LocalDate dataMatricula;

    // GETTERS E SETTERS

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    // MÉTODO CONSTRUTOR.
    // Este é o construtor da classe 'Aluno'. Ao criar um objeto 'Aluno' esse
    // construtor é chamado para inicializar as informações do aluno, incluindo os
    // herdados da classe
    // 'BasePessoaFisica', além dos atributos específicos da classe 'Aluno'.

    public Aluno(int codigo, LocalDate dataInsercao, String endereco, String telefone, String nome, String rg,
            String cpf, LocalDate dataNascimento, String matricula, LocalDate dataMatricula) {
        super(codigo, dataInsercao, endereco, telefone, nome, rg, cpf, dataNascimento);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }

    @Override // Esse método é sobrescrito da classe 'BasePessoaFisica' e imprime as
              // informações sobre o aluno.
    public void Imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Data de Matrícula: " + this.dataMatricula);
        System.out.println("Data de Inserção:" + this.dataInsercao);
    }
}
