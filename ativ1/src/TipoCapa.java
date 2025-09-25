public class TipoCapa {
    private int id;
    private String descricao;

    //gets and sets
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

    //metodos
    public void salvarTipoCapa() {
        System.out.println("Tipo de capa salvo com sucesso!");
    }
    public void alterarTipoCapa() {
        System.out.println("Tipo de capa alterado!");
    }
    public void excluirTipoCapa() {
        System.out.println("Tipo de capa excluído!");
    }
    public void pesquisarTipoCapa() {
        System.out.println("Tipo de capa pesquisado!");
    }
}
