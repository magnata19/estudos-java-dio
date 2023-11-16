public class FormatadorCepExemplo {

  public static void main(String[] args) {
    
    try {
      String cepFormatado = formatarCep("2525999");
      System.out.println(cepFormatado);
    } catch (CepInvalidoExcecao e) {
      // TODO Auto-generated catch block
      CepInvalidoExcecao.imprimirErro();
    }

  }
  static String formatarCep (String cep) throws CepInvalidoExcecao {
    if(cep.length() != 8) {
      throw new CepInvalidoExcecao();
    }
    return "25-252-999";
  }
}