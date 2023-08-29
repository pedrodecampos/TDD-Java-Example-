package Relogio;
import java.util.Scanner;
public class Relogio {

    private int hora, minuto, segundo = 0;

    // criando o construtor cheio/vazio
  public void  horario(int hora, int minuto, int segundo){
      if(hora <=23 && minuto <=60 && segundo <=60) {  
	  this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        System.out.println("Horario registrado com sucesso");
        } else {
        	System.out.println("Horario Informado de forma incorrenta");
        }
      
    }

    Relogio(){

    }

    // metodo para imprimir horario padrao 00:00:00
    void imprimirHorarioPadrao(){
        System.out.println("Horario Digitado: "+ "" + hora + ":"+  "" + minuto + ":"+  "" + segundo);
    }

    // metodo para imprimir no padrao AM/PM
    void imprimirAmPm(){
    	int Am, Pm;
    	
        if ( hora <= 12 )
        	System.out.println("Hora Digitada AM:" + hora + "" + minuto);
        else 
        	System.out.println(" Hora Digitada PM:" + hora +  "" + minuto );
    }

    // metodo para zerar o relogio
    void zerarRelogio(){
        hora = 0;
        minuto = 0;
        segundo = 0;
        System.out.print("Horario Reniciado Para 00h00");
    }

    // metodo para iniciar cronometro
    void cronometro(){
        Scanner input = new Scanner(System.in);

        System.out.println("Clique no botao enter para iniciar: ");
        input.nextLine();

       // variavel que contem o metodo currentTime para salvar o tempo
        long inicio = System.currentTimeMillis();

        System.out.println("Clique no botao enter para parar : ");
        input.nextLine();

        // variavel para pegar o tempo novamente
        long fim = System.currentTimeMillis();

        // calcular a diferenca de fim - inicio
        long calc = fim - inicio;
        long prox=0;
        // caluclando segundos
        prox = calc/1000;
        System.out.println("Tempo On: " + prox + " Segundos");
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

}
