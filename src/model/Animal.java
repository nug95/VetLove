package model;

import java.util.ArrayList;

public class Animal {
	private int id;
	private String categoria,
				   raca,
				   data_nascimento;
	ArrayList<Ficha> arFicha;
	
	public Animal(String categoria, String raca, String data_nascimento, ArrayList<Ficha> arFicha) {
		super();
		this.categoria = categoria;
		this.raca = raca;
		this.data_nascimento = data_nascimento;
		//this.arFicha = arFicha;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public ArrayList<Ficha> getArFicha() {
		return arFicha;
	}

	public void setArFicha(ArrayList<Ficha> arFicha) {
		this.arFicha = arFicha;
	}

}
