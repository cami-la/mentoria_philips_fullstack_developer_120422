package me.dio.domain;

import me.dio.domain.CalculaBonificacao;
import me.dio.domain.FuncionarioCLT;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
  private Double valorDaBonificacao;

  @Override
  public void calculaBonificacao(Double porcentagemBonificacao) {
    this.valorDaBonificacao = super.valorSalario * (porcentagemBonificacao/100d);
  }

  @Override
  public String toString() {
    return "Vendedor{" +
        "nome='" + nome + '\'' +
        ", documento='" + documento + '\'' +
        ", valorSalario=" + valorSalario +
        ", endereco=" + endereco.getRua() +
        ", valorDaBonificacao=" + valorDaBonificacao +
        '}';
  }
}
