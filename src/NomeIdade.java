

import java.util.Scanner;



public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Para o programa ler um dado

        String nome; //Declarando variável
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();

        }



    }

}
