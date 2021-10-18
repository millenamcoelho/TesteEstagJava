package testeestagjava;
import java.util.Scanner;
/**
 *
 * @author Millena
 */
public class Questao3 {

    /**
     * Escreva uma função que verifica se uma string é uma versão rotacionada de outra string.  
     *  Exemplo: Se s1 = 'BrasilEUAChile' e s2 = 'ChileBrasilEUA' então a função deve retornar 'true' (s2 é uma rotação de s1). Caso s2 = 'BrasilChileEUA', então deve retornar 'false'
     */

    static boolean saoRotacoes(String string1, String string2) { //metodo para verificar se e uma rotacao
        if ((string1.length() == string2.length()) && ((string1 + string1).contains(string2))) {// verifica se as string tem o mesmo tamanho e se a string2 contem a string1
            return true;//para verificar a rotacao basta colocar a string1 uma ao lado da outra, duas vezes seguidas, e o contains veriica se a segunda string aparece nessa juncao
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bem Vindo(a)!");
        System.out.println("Digite o texto completo: ");
        String texto = in.nextLine();
        
        System.out.println("Digite o texto a ser comparado: ");
        String compara = input.nextLine();

        if (saoRotacoes(texto, compara) == true){
            System.out.println("Parabéns! São rotações!");
        }else{
            System.out.println("Não são rotações.");
        }

    }

}
