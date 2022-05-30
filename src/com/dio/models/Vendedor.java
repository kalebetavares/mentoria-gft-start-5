package com.dio.models;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao{
	public Vendedor(String nome, String documento, Double valorSalario, Endereco endereco) {
		super(nome, documento, valorSalario, endereco);
	}

	private Double valorDaBonificacao;
	
	@Override
	public String toString() {
		return "Vendedor [nome=" + nome + 
				", documento=" + documento + 
				", valorSalario=" + valorSalario + 
				", endereco="+ endereco.getRua() + 
				", valorBonificacao=" + this.valorDaBonificacao + 
				"]";
	}
	
	@Override
	public void calculaBonificacao(Double porcentagemBonificacao) {
	this.valorDaBonificacao = (this.valorSalario * (porcentagemBonificacao/100d));
	}
}
