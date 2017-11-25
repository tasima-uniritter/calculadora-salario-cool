package main;

public class Desenvolvedor implements Funcionario {

	private double salario;

	public Desenvolvedor(double salario) {
		this.salario = salario;
	}

	@Override
	public double getSalario() {
		return salario;
	}

	
}
