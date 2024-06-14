import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares { 
 
    public static void main(String[] args) {
        System.out.println("*********** TESTE LOGIN ***********");
        System.out.println("Apenas letras: " + validarLogin("lucas"));
        System.out.println("Apenas números: " + validarLogin("111111"));
        System.out.println("Apenas caracteres especiais: " + validarLogin("!!!!!!"));
        System.out.println("Menor que 5 caracteres: " + validarLogin("1A@"));
        System.out.println("Maior que 30 caracteres: " + validarLogin("lucaslucaslucaslucaslucaslucas!1@"));
        System.out.println("Login ideal: " + validarLogin("lucas1!"));
        System.out.println("***********************************");

        System.out.println("");

        System.out.println("*********** TESTE SENHA ***********");
        System.out.println("Apenas letras: " + validarSenha("lucas"));
        System.out.println("Apenas números: " + validarSenha("111111"));
        System.out.println("Apenas caracteres especiais: " + validarSenha("!!!!!!"));
        System.out.println("Menor que 8 caracteres: " + validarSenha("L1@"));
        System.out.println("Maior que 12 caracteres: " + validarSenha("Lcaslu1cas!1@"));
        System.out.println("Senha ideal: " + validarSenha("Lucas11!"));
        System.out.println("***********************************");

    }

    /*
        ^: Indica o início da string.
        (?=.*\d): Verifica se há pelo menos um dígito.
        (?=.*[@$!%*?&]): Verifica se há pelo menos um dos caracteres especiais listados.
        [A-Za-z\d@$!%*?&]{5,30}: Garante que a string tenha entre 5 e 30 caracteres, consistindo apenas de letras, números e os caracteres especiais especificados.
        $: Indica o fim da string.
    */
    private static boolean validarLogin(String login) {
        String regex = "^(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{5,30}$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(login);

        return matcher.matches();
    }

    /*
        (?=.*[A-Z]): Verifica se há pelo menos uma letra maiúscula. 
    */
    private static boolean validarSenha(String senha) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,12}$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(senha);

        return matcher.matches();
    }
}