public class Livro {
    private int id;
    private String nome;
    private String resenha;
    private int edicao;
    private int npaginas;
    private Autor autor;
    private Editora editora;
    private TipoCapa tipoCapa;

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
    public String getResenha() {
        return resenha;
    }
    public void setResenha(String resenha) {
        this.resenha = resenha;
    }
    public int getEdicao() {
        return edicao;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    public int getNpaginas() {
        return npaginas;
    }
    public void setNpaginas(int npaginas) {
        this.npaginas = npaginas;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public Editora getEditora() {
        return editora;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    public TipoCapa getTipoCapa() {
        return tipoCapa;
    }
    public void setTipoCapa(TipoCapa tipoCapa) {
        this.tipoCapa = tipoCapa;
    } 

    public Livro () {
        // Construtor padrão vazio
    }
    public Livro (int id, String nome, String resenha, int edicao, int npaginas, Autor autor, Editora editora, TipoCapa tipoCapa) {
        this.id = id;
        this.nome = nome;
        this.resenha = resenha;
        this.edicao = edicao;
        this.npaginas = npaginas;
        this.autor = autor;
        this.editora = editora;
        this.tipoCapa = tipoCapa;
        // Construtor cheio - substitui/constroi os valores da classe sem os sets
    }

}
