// Classe abstrata que define a estrutura comum para contas bancárias
public abstract class Conta {
    protected double saldo; // Saldo da conta
    protected Cliente cliente; // Cliente associado à conta
    protected int numero; // Número da conta
    private static int contador = 1; // Contador para gerar números únicos

    // Construtor que associa a conta ao cliente e define um número único
    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.numero = contador++;
    }

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para sacar um valor da conta, se houver saldo suficiente
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    // Método para imprimir as informações básicas da conta
    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo: R$ " + saldo);
    }
}
