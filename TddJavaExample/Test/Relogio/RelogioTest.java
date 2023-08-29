package Relogio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.experimental.theories.suppliers.TestedOnSupplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RelogioTest {
	
	  Relogio teste = new Relogio();

//	@Test 
//    void verificarHorario() {
//          teste.Relogio(10, 20, 30);
//          teste.setHora(10);
//          // teste que verifica se a hora esta como o determinado acima
//          assertEquals(10, teste.getHora());
//		  
//          // teste que verifica se o minuto esta como determinado acima
//          assertEquals(20,teste.getMinuto());
//          
//          // teste que verifica se o segundo esta como determinado acima
//          assertEquals(30,teste.getSegundo());
//	}	
	  
	  @Test 
	  void verificarHora() {
		  teste.setHora(0);
		  assertEquals(0,teste.getHora());
	  }

	@Test 
	void verificarMinuto(){
		teste.setMinuto(0);
		assertEquals(0, teste.getMinuto());
	}
	
	@Test
	void verificarSegundo() {
		teste.setSegundo(0);
		assertEquals(0,teste.getMinuto());
	}
	
	
	
}
