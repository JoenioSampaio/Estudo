package AnatomiaDasClasses;
     
    public class minhaClasse {    /**  METODOS */
    public static void main(String[] args) {
        
        String primeiroNome = "Refrigerante";
        String segundoNome = "Coca Cola Lata 350ml";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    } 
        
}




