package Atividades;

import java.text.NumberFormat;
public class Funcionario {
	private double salario;
	private double bonus;
	private double imposto;
	
	public Funcionario(double salario) {
		this.salario = salario;
		bonus = 5;
		imposto = 7;
				
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double getSalarioLiquido()
	{
		return salario - valoImposto() + valorBonus();
	}
	
	public double valoImposto()
	{
		return salario * imposto / 100;
	}
	
	public double valorBonus()
	{
		return salario * bonus / 100;
	}

	@Override
	public String toString() {
		NumberFormat formatMoeda = NumberFormat.getCurrencyInstance();
		
		return "Salario: " + formatMoeda.format(salario)
				+"\nImposto: " + formatMoeda.format(valoImposto())
				+ "\nBonus: " + formatMoeda.format(valorBonus())
				+"\nSalario Liquido: " + formatMoeda.format(getSalarioLiquido());
	}
	
	
}
