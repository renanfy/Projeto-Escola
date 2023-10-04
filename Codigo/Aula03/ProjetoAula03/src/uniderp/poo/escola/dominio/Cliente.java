package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Cliente extends Pessoa {
    public Cliente(){
        
    }

    public Cliente(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
        String cpf, LocalDate dataInsercao) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
    } 
}
