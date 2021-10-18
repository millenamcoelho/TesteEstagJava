package testeestagjava;

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Millena
 */
public class Questao1 {

    /**
     * Escreva um script para ler um arquivo do sistema e exibir seu conteúdo
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);
        FileWriter arquivo;

        System.out.println("Bem Vindo(a)!");
        System.out.println("Deseja criar um arquivo novo ou ler um já existente? 1- Novo  |  2- Existente");
        int escolha = in.nextInt();

        switch (escolha) {
            case 1://caso escolha um novo arquivo
                try {
                    arquivo = new FileWriter(new File("F:\\testesem.txt"));//cria o novo arquivo
                    System.out.println("Digite seu texto:\n");
                    String conteudo = texto.nextLine();

                    arquivo.write("Conteúdo escrito: \n");//grava essa frase no arquivo
                    arquivo.write(conteudo);//grava o conteudo escrito
                    arquivo.close();//fecha o arquivo

                    System.out.println("*****Arquivo criado com sucesso!*****");

                } catch (IOException e) {
                    e.printStackTrace();//caso haja o erro, imprimir na tela
                }
                break;

            case 2:
                try {
                    System.out.printf("Informe o nome de arquivo texto:\n");
                    String nome = texto.nextLine();

                    System.out.println("\nConteúdo do arquivo digitado:\n");

                    FileReader arquivoD = new FileReader(nome);//encontra o arquivo
                    BufferedReader lerArquivo = new BufferedReader(arquivoD);//le o conteudo do arquivo

                    String linha = lerArquivo.readLine(); // este método lê o arquivo linha por linha
                    while (linha != null) {//se linha for diferente de nulo
                        System.out.printf("%s\n", linha);//imprime linha por linha
                        linha = lerArquivo.readLine();
                    }

                    arquivoD.close();//fecha o arquivo
                } catch (IOException e) {
                    System.out.printf("Erro na abertura do arquivo!");//tratamento de erro
                }
                break;

        }
    }
}