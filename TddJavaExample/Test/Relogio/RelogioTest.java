package Relogio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.experimental.theories.suppliers.TestedOnSupplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RelogioTest {

	
	 
	@Test 
    void verificationHorario() {
		Relogio teste = new Relogio();
          teste.horario(10, 20, 30);
          // teste que verifica se a hora esta como o determinado acima
          assertEquals(10, teste.getHora());
		  
          // teste que verifica se o minuto esta como determinado acima
          assertEquals(20,teste.getMinuto());
          
          // teste que verifica se o segundo esta como determinado acima
          assertEquals(30,teste.getSegundo());
	}	

	
	
	
	
	
}
