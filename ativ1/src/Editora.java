public class Editora {
    private String nome_editora;
    private int id;
    
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

}