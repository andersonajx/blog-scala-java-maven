package br.com.blog

case class Cep(codigo: String) {

  require(codigo != null, "Código não pode ser nulo")
  require(codigo.matches("\\d{8}"), "Formato de CEP inválido")

}
