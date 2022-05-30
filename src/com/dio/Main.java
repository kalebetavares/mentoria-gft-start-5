package com.dio;

import com.dio.models.Endereco;
import com.dio.models.Gerente;
import com.dio.models.OperadorDeCaixa;
import com.dio.models.Vendedor;

public class Main {

	public static void main(String[] args) {
		Endereco enderecoVendedor1 = new Endereco("Avenida das Torres", "numero 457, Ap300", "Centro");
		Endereco enderecoOperador1 = new Endereco("Flores da Cunha", "numero 835", "Campinas");
		Endereco enderecoGerente1 = new Endereco("Avenida Duque de Caxias", "numero 763", "Fragata");
		
		Vendedor vendedor1 = new Vendedor("Kalebe Tavares", "123.456.789-00", 2500.50, enderecoVendedor1);
		vendedor1.calculaBonificacao(10d);
		
		OperadorDeCaixa operador1 = new OperadorDeCaixa("Claudio Martins", "078.876.432-91", 4250.75, enderecoOperador1);
		
		Gerente gerente1 = new Gerente("Tatiana Fernandes", "666.666.987-12", enderecoGerente1, 20, 150.00);
		gerente1.calculaRemuneracao();
		gerente1.calculaBonificacao(15d);
		
		System.out.println(vendedor1);
		System.out.println(operador1);
		System.out.println(gerente1);
	}

}
