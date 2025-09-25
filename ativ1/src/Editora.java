public class Editora {
    private String nome_editora;
    private int id;
    
    //gets and sets
    public String getNome_editora() {
        return nome_editora;
    }
    public void setNome_editora(String nome_editora) {
        this.nome_editora = nome_editora;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Editora () {
        // Construtor padrão vazio
    }   
    public Editora (String nome_editora, int id) {
        this.nome_editora = nome_editora;
        this.id = id;
        // Construtor cheio - substitui/constroi os valores da classe sem os sets
    }
   
    //metodos ilustrativos
    public void salvarEditora() {
        System.out.println("Editora salva com sucesso!");
    }
    public void alterarEditora() {
        System.out.println("Editora alterada!");
    }
    public void excluirEditora() {
        System.out.println("Editora excluída!");
    }
    public void pesquisarEditora() {
        System.out.println("Editora pesquisada!");
    }
}