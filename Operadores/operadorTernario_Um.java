package Operadores;

public class operadorTernario_Um {
    public static void main(String[] args) {                // expressão bolleana para true ou false
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";
        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);
    }
}
