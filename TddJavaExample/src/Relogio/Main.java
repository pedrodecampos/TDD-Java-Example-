package Relogio;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      

      // inicializando a classe relogio
      Relogio relogio = new Relogio();

      // criando um input ( scanner)
        Scanner input = new Scanner(System.in);

        int aux = 9999;
        int hora, minuto,segundo=0;
        while (aux != 0 ){
            System.out.println("1 -  Registrar um horario");
            System.out.println("2 - iniciar o cronometro");
            System.out.println("3 - reniciar o relogio para meia-noite");
            System.out.println("4 - imprimir horario padrao 00:00:00");
            System.out.println("5 - imprimir horario padrao AM:PM");


            System.out.println("0 sair ");

            System.out.println("\nDigite a opocao que deseja: ");
            aux = input.nextInt();

            // criando o menu
           switch (aux){
               case 1:
                   System.out.println("Digite a Hora: ");
                   hora = input.nextInt();
                   System.out.println("Digite o Minuto: ");
                   minuto = input.nextInt();
                   System.out.println("Digite o segundo: ");
                   segundo = input.nextInt();
                   relogio.Relogio(hora, minuto, segundo);               
                   break;
               case 2:
                   relogio.cronometro();
                   break;
               case 3:
                   relogio.zerarRelogio();
                   break;
               case 4 :
                   relogio.imprimirHorarioPadrao();
                   break;
               case 5:
                   relogio.imprimirAmPm();
                   break;

               
           }
        }

    }
}