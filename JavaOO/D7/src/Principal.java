// Crie uma classe idadePessoa com os atributos privados nome e idade.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

public class Principal {

    public static void main(String[] args) {

        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Carol");
        pessoa1.setIdade(22);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Camila");
        pessoa2.setIdade(16);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();
    }
}
