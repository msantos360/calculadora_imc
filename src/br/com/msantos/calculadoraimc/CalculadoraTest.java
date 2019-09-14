package br.com.msantos.calculadoraimc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void deveRetornarOIMCcomCategoriaAbaixoDoPeso() {
		Calculadora calculadora = new Calculadora("Joaquina", 42.0, 1.70);

		String categoriaImcEsperada = "ABAIXO_DO_PESO";
		String resultadoEsperado = "14.53";
		
		assertEquals(resultadoEsperado, calculadora.getResultadoSimples());
		assertEquals(categoriaImcEsperada, calculadora.getCategoriaImc());
	}

	@Test
	public void deveRetornarOIMCcomCategoriaPesoNormal() {
		Calculadora calculadora = new Calculadora("Joaquina", 62.0, 1.70);

		String categoriaImcEsperada = "PESO_NORMAL";
		String resultadoEsperado = "21.45";

		assertEquals(resultadoEsperado, calculadora.getResultadoSimples());
		assertEquals(categoriaImcEsperada, calculadora.getCategoriaImc());
	}

	@Test
	public void deveRetornarOIMCcomCategoriaSobrepeso() {
		Calculadora calculadora = new Calculadora("Joaquina", 75.0, 1.70);

		String categoriaImcEsperada = "SOBREPESO";
		String resultadoEsperado = "25.95";

		assertEquals(resultadoEsperado, calculadora.getResultadoSimples());
		assertEquals(categoriaImcEsperada, calculadora.getCategoriaImc());
	}

	@Test
	public void deveRetornarOIMCcomCategoriaObesidadeGrauI() {
		Calculadora calculadora = new Calculadora("Joaquina", 90, 1.70);

		String categoriaImcEsperada = "OBESIDADE_GRAL_I";
		String resultadoEsperado = "31.14";

		assertEquals(resultadoEsperado, calculadora.getResultadoSimples());
		assertEquals(categoriaImcEsperada, calculadora.getCategoriaImc());
	}

	@Test
	public void deveRetornarOIMCcomCategoriaObesidadeGrauII() {
		Calculadora calculadora = new Calculadora("Joaquina", 115, 1.70);

		String categoriaImcEsperada = "OBESIDADE_GRAL_II";
		String resultadoEsperado = "39.79";

		assertEquals(resultadoEsperado, calculadora.getResultadoSimples());
		assertEquals(categoriaImcEsperada, calculadora.getCategoriaImc());
	}

	@Test
	public void deveRetornarOIMCcomCategoriaObesidadeGrauIII() {
		Calculadora calculadora = new Calculadora("Joaquina", 450, 1.80);

		String categoriaImcEsperada = "OBESIDADE_GRAL_III";
		String resultadoEsperado = "138.89";

		assertEquals(resultadoEsperado, calculadora.getResultadoSimples());
		assertEquals(categoriaImcEsperada, calculadora.getCategoriaImc());
	}

	@Test(expected = RuntimeException.class)
	public void deveLancarUmaExceptionParaValoresIncorretosAlturaEPeso() {

		new Calculadora("Joaquina", -70, 0);

	}
	
}
