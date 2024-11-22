package alugueldepatins;

public class Cliente {
    private int numeroPeCliente;
    private String cpf;
    //private int idCLiente;

    public int obterNumeroPeCliente() {
        return numeroPeCliente;
    }

    public String obterCpf() {
        return cpf;
    }

    /*public int obterIdCLiente() {
        return idCLiente;
    }*/

    public void alterarNumeroPeCliente(int numeroPeCliente) {
        this.numeroPeCliente = numeroPeCliente;
    }

    public void alterarCpf(String cpf) {
        this.cpf = cpf;
    }

    /*public void alterarIdCLiente(int idCLiente) {
        this.idCLiente = idCLiente;
    }*/
}
