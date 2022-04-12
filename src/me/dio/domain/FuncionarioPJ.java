package me.dio.domain;

public abstract class FuncionarioPJ {
  //atributo
  private String nome;
  private String documento;
  private Endereco endereco;
  private Integer horasTrabalhadas;
  private Double valorHora;
  private Double valorRemuneracao;

  public void calculaRemuneracao(){
    this.valorRemuneracao = this.horasTrabalhadas * this.valorHora;
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

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public Integer getHorasTrabalhadas() {
    return horasTrabalhadas;
  }

  public void setHorasTrabalhadas(Integer horasTrabalhadas) {
    this.horasTrabalhadas = horasTrabalhadas;
  }

  public Double getValorHora() {
    return valorHora;
  }

  public void setValorHora(Double valorHora) {
    this.valorHora = valorHora;
  }

  public Double getValorRemuneracao() {
    return valorRemuneracao;
  }


}
