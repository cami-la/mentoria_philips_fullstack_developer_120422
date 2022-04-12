package me.dio;

import me.dio.domain.Endereco;
import me.dio.domain.Gerente;
import me.dio.domain.OperadorDeCaixa;
import me.dio.domain.Vendedor;

public class Main {
  public static void main(String[] args) {
    Endereco endereco = new Endereco();
    endereco.setRua("Endereço para essa rua");
    System.out.println(endereco.getRua());

    Endereco endereco1 =
        new Endereco("Rua funcionário",
            "Complemento endereço funcionário", "bairro funcionário");
    System.out.println(endereco1);
    System.out.println("-----");

    Vendedor vendedor = new Vendedor();
    vendedor.setNome("Camila Vendedora");
    vendedor.setDocumento("123.456.789-00");
    vendedor.setValorSalario(1000d);
    vendedor.calculaBonificacao(2d);
    vendedor.setEndereco(endereco);
    System.out.println(vendedor);
    System.out.println("-----");

    OperadorDeCaixa operadorCaixa =
        new OperadorDeCaixa("Camila Op Caixa",
            "789.456.123-00",
            2000d, endereco);
    System.out.println(operadorCaixa);
    System.out.println("-----");

    Gerente gerente = new Gerente();
    gerente.setNome("Camila Gerente");
    gerente.setDocumento("456.123.789-00");
    gerente.setEndereco(endereco);
    gerente.setHorasTrabalhadas(20);
    gerente.setValorHora(100d);
    gerente.calculaRemuneracao();
    gerente.calculaBonificacao(3d);
    System.out.println(gerente);
  }
}
