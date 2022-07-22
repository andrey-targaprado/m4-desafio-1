import java.time.LocalDate;

public class Pessoa {

    private String nomePessoa;
    private LocalDate dataNascimento;

    public Pessoa(String nomePessoa, LocalDate dataNascimento) {
        this.nomePessoa = nomePessoa;
        this.dataNascimento = dataNascimento;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
}
