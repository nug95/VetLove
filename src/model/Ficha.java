package model;

import java.util.ArrayList;

public class Ficha {
	private int id;
	private String data,
				   nome_vacina,
				   preco_vacina;
	ArrayList<Consulta> arConsultas;
	
	public Ficha(String data, String nome_vacina, String preco_vacina, ArrayList<Consulta> arConsultas) {
		super();
		this.data = data;
		this.nome_vacina = nome_vacina;
		this.preco_vacina = preco_vacina;
		this.arConsultas = arConsultas;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNome_vacina() {
		return nome_vacina;
	}

	public void setNome_vacina(String nome_vacina) {
		this.nome_vacina = nome_vacina;
	}

	public String getPreco_vacina() {
		return preco_vacina;
	}

	public void setPreco_vacina(String preco_vacina) {
		this.preco_vacina = preco_vacina;
	}

	public ArrayList<Consulta> getArConsultas() {
		return arConsultas;
	}

	public void setArConsultas(ArrayList<Consulta> arConsultas) {
		this.arConsultas = arConsultas;
	}
}
