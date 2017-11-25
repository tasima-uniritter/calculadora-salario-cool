package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.CalculadoraSalario;
import main.Desenvolvedor;

public class CalculaSalarioTest {

	@Test
	public void CalculaSalarioDesenvolvedor10PorCento() {
		Desenvolvedor f = new Desenvolvedor(3000);		
		CalculadoraSalario c = new CalculadoraSalario(f);
		assertEquals(2700.00, c.calcula(), 2);				
	}
	
	@Test
	public void CalculaSalarioDesenvolvedor20PorCento() {
		Desenvolvedor f = new Desenvolvedor(3001);		
		CalculadoraSalario c = new CalculadoraSalario(f);
		assertEquals(2400.80, c.calcula(), 2);				
	}

}
