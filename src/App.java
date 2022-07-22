import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        CadastroPessoas cadastro = new CadastroPessoas();
        cadastro.cadastrar(new Pessoa("Skyline", LocalDate.of(1990, 9, 22)));
        cadastro.cadastrar(new Pessoa("Dom", LocalDate.of(2000, 4, 12)));
        cadastro.cadastrar(new Pessoa("Toretto", LocalDate.of(1956, 7, 2)));
        cadastro.cadastrar(new Pessoa("Braia", LocalDate.of(1972, 3, 22)));

        cadastro.listarPessoas();
        cadastro.listarIdade();
    }
}
