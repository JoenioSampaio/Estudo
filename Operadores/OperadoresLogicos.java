package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {      
        boolean condicao1 = true;
        boolean condicao2 = true;

        // if (condicao1 && condicao2){      // valida se as condiçoes são verdadeiras
        //     System.out.println("as duas condiçoes são verdadeiras");
        // }

        if (condicao1 && (7 > 4 )) {  // tambem representa uma declaração bolleana
            System.out.println("As duas condições são verdadeiras");
            
        }

        if (condicao1 || condicao2){
            System.out.println("Uma das condições e verdadeira");
        }

        System.out.println("fim");


    }
}
