public class Autor {
    private int id;
    private String nome;
    private String cidade;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Autor () {
        // Construtor padrão vazio
    }
    public Autor (int id, String nome, String cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        // Construtor cheio - substitui/constroi os valores da classe sem os sets
    }
    
}