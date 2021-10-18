package testeestagjava;
import java.util.*;

/**
 *
 * @author Millena
 */
public class Questao2 {

/**
 * Escreva uma função que substitua um caractere específico em uma string
 */

    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int i;
        StringBuilder texto = new StringBuilder();
        System.out.println("Digite o seu texto: ");
        String conteudo = in.nextLine();
        texto.append(conteudo);//une a stringbuilder com a string digitada
        
        System.out.println("Substituir o caractere: ");
        char carac1 = in.next().charAt(0);//guarda a char digitada

        System.out.println("Pelo caractere: ");
        char carac2 = in.next().charAt(0);//guarda a char digitada
        
        char[]stringChar = conteudo.toCharArray();//transforma a string em um array de char para ser comparado
        
        for(i=0; i<stringChar.length; i++){//varre a array de char
            if(stringChar[i] == carac1 ){//verifica se o char que esta sendo verificado é igual ao digitado
               texto.setCharAt(i, carac2);//seta o char
            }
        }

        System.out.println(texto);
    }
}