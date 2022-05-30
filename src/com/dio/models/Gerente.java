package com.dio.models;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao  {
	private Double valorDaBonificacao;
	
	public Gerente(String nome, String documento, Endereco endereco, Integer horasTrabalhadas, Double valorHora) {
		super(nome, documento, endereco, horasTrabalhadas, valorHora);
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + nome + 
				", documento=" + documento + 
				", endereco=" + endereco.getRua() +
				", horasTrabalhadas=" + horasTrabalhadas + 
				", valorHora=" + valorHora + 
				", valorRemuneracao=" + valorRemuneracao +
				", valorBonificacao=" + this.valorDaBonificacao +
				"]";
	}

	@Override
	public void calculaBonificacao(Double porcentagemBonificacao) {
		this.valorDaBonificacao = (this.valorRemuneracao * (porcentagemBonificacao/100d));
	}

	
}
