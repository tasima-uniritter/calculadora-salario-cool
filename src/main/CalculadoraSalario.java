package main;

public class CalculadoraSalario {
	

	private Funcionario funcionario;

	public CalculadoraSalario(Funcionario f) {
		this.funcionario = f;
	}

	public double calcula() {
		double salario = this.funcionario.getSalario();
		if(salario > 3000)
			return salario * 0.8; 
		return salario * 0.9;
	}

}
