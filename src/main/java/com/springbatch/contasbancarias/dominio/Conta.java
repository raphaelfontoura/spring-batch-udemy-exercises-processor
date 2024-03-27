package com.springbatch.contasbancarias.dominio;

public class Conta {
	public String id;
	public Tipo tipo;
	public Double limite;

	public String clienteId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public String getClienteId() {
		return clienteId;
	}

	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}

	@Override
	public String toString() {
		return "Conta{" +
				"id='" + id + '\'' +
				", tipo=" + tipo +
				", limite=" + limite +
				", clienteId='" + clienteId + '\'' +
				'}';
	}
}
