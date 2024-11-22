package alugueldepatins;

public class Aluguel {
    private Cliente cliente;
    private Patins patins;
    private String horaInicio;
    private int idAluguel;

    public Cliente obterCliente() {
        return cliente;
    }

    public Patins obterPatins() {
        return patins;
    }

    public String obterHoraInicio() {
        return horaInicio;
    }

    public int obterIdAluguel() {
        return idAluguel;
    }

    public void alterarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void alterarPatins(Patins patins) {
        this.patins = patins;
    }

    public void alterarHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void alterarIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }
    
    public String retornaAluguel(){
        Cliente cliente = obterCliente();
        Patins patins = obterPatins();
        String mensagemCliente = String.format("{CPF: %s, Número do Pe: %d}", cliente.obterCpf(), cliente.obterNumeroPeCliente());
        String mensagemPatins = String.format("{ID Patins: %d, Número do Pé: %d, Quant. Disponivel: %d, Preço: R$%.2f, Status Disponível: %s}", patins.obterIdPatins(), patins.obterNumeroPe(), patins.obterQuantidadeDisponivel(), patins.obterPreco(), patins.obterStatusDisponivel());
        return "ID do Aluguel: " + obterIdAluguel() + "\n" +
               "Cliente: " + mensagemCliente+ "\n" +
               "Patins: " + mensagemPatins + "\n" +
                "Hora Inicio: " + obterHoraInicio();
    }
}
