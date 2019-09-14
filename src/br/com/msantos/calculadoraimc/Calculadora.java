package br.com.msantos.calculadoraimc;

import java.text.DecimalFormat;

public class Calculadora {

	private String nomePaciente;

	private double peso;

	private double altura;

	private String categoriaImc;

	private String resultado;

	private double imcCalculado;

	public Calculadora(String nomePaciente, double peso, double altura) {
		this.nomePaciente = nomePaciente;
		this.peso = peso;
		this.altura = altura;

		if (peso < 1 | altura < 1) {
			throw new RuntimeException("Valores inválidos");
		}

		realizaCalculo();
	}

	private void realizaCalculo() {

		imcCalculado = peso / (altura * altura);

		TipoImc tipoImc[] = TipoImc.values();

		for (TipoImc imc : tipoImc) {

			if (imcCalculado >= imc.getValorMinimo() && imcCalculado <= imc.getValorMaximo()) {

				this.categoriaImc = imc.name();
				this.resultado = new DecimalFormat("0.00").format(imcCalculado);
			}
		}
	}
	
	public String getResultadoCompleto() {
		
		StringBuilder sb = new StringBuilder("****************");
		sb.append("\nPaciente:\t" + nomePaciente);
		sb.append("\nIMC calculado:\t" + resultado);
		sb.append("\nCategoria:\t" + categoriaImc);
		sb.append("\nPeso:\t\t" + peso + " Kg");
		sb.append("\nAltura:\t\t" + altura);
		
		return sb.toString();
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public String getCategoriaImc() {
		return categoriaImc;
	}

	public String getResultadoSimples() {
		return resultado;
	}

	@Override
	public String toString() {
		return "Calculadora [nomePaciente=" + nomePaciente + ", peso=" + peso + ", altura=" + altura + ", categoriaImc="
				+ categoriaImc + ", resultado=" + resultado + "]";
	}

}
