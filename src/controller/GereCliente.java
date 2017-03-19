package controller;

import java.util.ArrayList;

import model.Animal;
import model.Cliente;
import model.Ficha;

public class GereCliente {
	
	ArrayList<Cliente> arCliente;
	
	public GereCliente(){
		arCliente = new ArrayList<Cliente>();
	}
	
	public void addCliente(String nome, String morada, String email, String telefone){
		
		Cliente c = new Cliente(nome,morada,email, telefone);
		
		arCliente.add(c);
	}
	
	public void showAllClientes(){
		
		for(Cliente c : arCliente){
			System.out.println(c.getNome());
		}
	}
}
