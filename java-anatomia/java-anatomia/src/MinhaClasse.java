public class MinhaClasse {
  public static void main(String[] args) {

    String primeiroNome = "Davidson";
    String segundoNome = "Pacifico";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return "Resultado: " + primeiroNome.concat(" ").concat(segundoNome);
  }
}
