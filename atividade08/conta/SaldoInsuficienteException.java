package conta;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
