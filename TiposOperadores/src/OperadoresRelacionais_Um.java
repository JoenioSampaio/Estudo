package TiposOperadores.src;

public class OperadoresRelacionais_Um {
    
    public static void main(String[] args) {
        
        String nomeUm = "GLEYSON";
        String nomeDois = new String("GLEYSON");

        System.out.println(nomeUm.equals(nomeDois));    // equals para objetos ou textos para comparar se os objetos são iguais.
        
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);



    }
}