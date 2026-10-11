package br.com.cadastroSimples.EntradaDeDados;

import java.util.Scanner;

public class LeitorDeDados {
    private Scanner scanner;


    public LeitorDeDados(){
         this.scanner = new Scanner(System.in);
    };


    public String pegarDadosTexto(){
        return scanner.nextLine();
    }

    public int pegarInteiro(){
      while(!scanner.hasNextInt()){
          System.out.println("Entrada inválida! Digite um número inteiro.");
          scanner.next(); // limpa a entrada incorreta
      }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    };

}
