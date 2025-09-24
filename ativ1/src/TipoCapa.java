public class TipoCapa {
    private int id;
    private String descricao;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public TipoCapa () {
        // Construtor padrão vazio
    }   
    public TipoCapa (int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        // Construtor cheio - substitui/constroi os valores da classe sem os sets
    }
    
}
