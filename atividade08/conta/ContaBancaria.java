package conta;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso.");
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);

        try {
            conta.sacar(500.0);
            conta.depositar(200.0);
            conta.sacar(800.0); 
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
