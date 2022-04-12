package me.dio.domain;

public abstract class FuncionarioCLT {
  //atributos
  protected String nome;
  protected String documento;
  protected Double valorSalario;
  protected Endereco endereco;

  public FuncionarioCLT(String nome, String documento, Double valorSalario, Endereco endereco) {
    this.nome = nome;
    this.documento = documento;
    this.valorSalario = valorSalario;
    this.endereco = endereco;
  }


  public FuncionarioCLT() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public Double getValorSalario() {
    return valorSalario;
  }

  public void setValorSalario(Double valorSalario) {
    this.valorSalario = valorSalario;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  @Override
  public String toString() {
    return "FuncionarioCLT{" +
        "nome='" + nome + '\'' +
        ", documento='" + documento + '\'' +
        ", valorSalario=" + valorSalario +
        ", endereco=" + endereco +
        '}';
  }
}
