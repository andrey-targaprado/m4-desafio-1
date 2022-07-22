import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    private List<Pessoa> cadastro = new ArrayList<>();

    public CadastroPessoas() {
    }

    public void cadastrar (Pessoa pessoa) {
        this.cadastro.add(pessoa);
    }

    public void listarPessoas (){
        cadastro.stream().
            forEach(e -> System.out.println(e.getNomePessoa() + " -> " + e.getDataNascimento()));
    }

    public void listarIdade () {
        cadastro.stream().
            forEach(e -> System.out.println(e.getNomePessoa() + " -> " + Period.between(e.getDataNascimento(), LocalDate.now()).getYears() + " anos."));
    }
    
}
