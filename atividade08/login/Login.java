package login;

public class Login {

    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean fazerLogin(String usuarioDigitado, String senhaDigitada) throws LoginInvalidoException {
        if (usuario.equals(usuarioDigitado) && senha.equals(senhaDigitada)) {
            return true;
        } else {
            throw new LoginInvalidoException("Usuário ou senha incorretos.");
        }
    }

    public boolean loginValido(String usuarioDigitado, String senhaDigitada) {
        return usuario.equals(usuarioDigitado) && senha.equals(senhaDigitada);
    }

    public static void main(String[] args) {
        Login login = new Login("lucas", "1234");

        try {
            boolean loginSucesso = login.fazerLogin("lucas", "123");
            System.out.println("Login bem-sucedido: " + loginSucesso);
        } catch (LoginInvalidoException e) {
            System.out.println("Erro ao fazer login: " + e.getMessage());
        }
    }
}
