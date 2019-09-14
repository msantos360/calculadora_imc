package br.com.msantos.calculadoraimc;

public enum TipoImc {

	ABAIXO_DO_PESO (0,18.49),
	PESO_NORMAL (18.5, 24.99),
	SOBREPESO (25, 29.99),
	OBESIDADE_GRAL_I (30, 34.99),
	OBESIDADE_GRAL_II (35, 39.99),
	OBESIDADE_GRAL_III (40, 1000);

	private double valorMinimo;
	private double valorMaximo;

	TipoImc(double valorMinimo, double valorMaximo) {
		
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
	}

	public double getValorMaximo() {
		return valorMaximo;
	}

	public double getValorMinimo() {
		return valorMinimo;
	}

}
