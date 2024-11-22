package alugueldepatins;

public class Patins {
    private int numeroPe;
    private int quantidadeDisponivel;
    private float preco;
    private boolean statusDisponivel;
    private int idPatins;

    public int obterNumeroPe() {
        return numeroPe;
    }

    public int obterQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public float obterPreco() {
        return preco;
    }

    public boolean obterStatusDisponivel() {
        return statusDisponivel;
    }

    public int obterIdPatins() {
        return idPatins;
    }

    public void alterarNumeroPe(int numeroPe) {
        this.numeroPe = numeroPe;
    }

    public void alterarQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void alterarPreco(float preco) {
        this.preco = preco;
    }

    public void alterarStatusDisponivel(boolean statusDisponivel) {
        this.statusDisponivel = statusDisponivel;
    }

    public void alterarIdPatins(int idPatins) {
        this.idPatins = idPatins;
    }   
    
    /*Adicionado retornaPatins para retornar os dados do patins e exibi-los*/
    public String retornaPatins(){
        return "ID do Patins: " + obterIdPatins() + "\n" +
               "Numero do Pe: " + obterNumeroPe() + "\n" +
               "Quantidade Disponivel: " + obterQuantidadeDisponivel() + "\n" +
                "Preco: " + obterPreco() + "\n" +
                "Status Disponivel: " + obterStatusDisponivel();
    }
}
