public class App {
    public static void main(String[] args) throws Exception {
       Autor autor1 = new Autor(1, "Sarah J Maas", "New York");
      
       Editora editora1 = new Editora ("Galera Record", 1);

       TipoCapa tipoCapa1 = new TipoCapa(1, "Dura");

       Livro livro1 = new Livro(1, "Trono de Vidro", "Assassina, Lenda, Heroína.", 1, 400, autor1, editora1, tipoCapa1);

        //metodos

        autor1.salvarAutor();
        autor1.alterarAutor();
        autor1.excluirAutor();
        autor1.pesquisarAutor();

        editora1.salvarEditora();
        editora1.alterarEditora();
        editora1.excluirEditora();
        editora1.pesquisarEditora();

        tipoCapa1.salvarTipoCapa();
        tipoCapa1.alterarTipoCapa();
        tipoCapa1.excluirTipoCapa();
        tipoCapa1.pesquisarTipoCapa();

        livro1.salvarLivro();
        livro1.alterarLivro();
        livro1.excluirLivro();
        livro1.pesquisarLivro();
    }
}
