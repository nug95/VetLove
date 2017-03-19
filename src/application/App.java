package application;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GereCliente;

public class App {
	
	//ArrayList de Menus
	ArrayList<String> arM = new ArrayList<String>(); 		//Menu Principal
	ArrayList<String> arMCli = new ArrayList<String>(); 	//Menu Gerir Clientes
	ArrayList<String> arMCon = new ArrayList<String>(); 	//Menu Gerir Consultas
	ArrayList<String> arMAni = new ArrayList<String>(); 	//Menu Gerir Animais
	ArrayList<String> arMFic = new ArrayList<String>(); 	//Menu Gerir Fichas
	
	//Scanner
	Scanner sc = new Scanner(System.in);
	
	int opc 		= 0,
		opcCliente 	= 0;
	boolean sair = true;
	
	//Construtor
	public App(){
		
		//Faz a criação de todos os menus
		setMenu();
		
		GereCliente gc = new GereCliente();
		
		do{
			switch(opc){
				case 1: //Gerir Clientes;
					while(opcCliente != 5){
						switch(opcCliente){
							case 1:
								System.out.println("Nome do Cliente");
								String nome = sc.nextLine();
								System.out.println("Morada do Cliente");
								String morada = sc.nextLine();
								System.out.println("Email do Cliente");
								String email = sc.nextLine();
								System.out.println("Telefone do Cliente");
								String telefone = sc.nextLine();
								gc.addCliente(nome, morada, email, telefone);
								opcCliente = 0;
								break;
							case 4:
								gc.showAllClientes();
								opcCliente = 0;
							default:
								opcCliente = menuCliente();			
						}
					}
					opc = 0;
					break;
				case 2: //Gerir Consultas;
					opc = 0;
					break;
				case 3: //Gerir Animais;
					opc = 0;
					break;
				case 4: //Gerir Fichas;
					opc = 0;
					break;
				case 5: //Terminar Programa;
					sair=false;
					break;
				default:
					opc = callMenu();
			}
		}while(sair);
		System.out.printf("\n\n\tPrograma terminado com Sucesso!");
	}
	
	//Insere valores nos Menus
	public void setMenu(){
		
		/** Menu Principal **/
		arM.add("Menu");
		arM.add("Gerir Clientes");
		arM.add("Gerir Consultas");
		arM.add("Gerir Animais");
		arM.add("Gerir Fichas");
		arM.add("Terminar Programa");
		
		/** Menu Gerir Clientes **/
		arMCli.add("Menu");
		arMCli.add("Registar Cliente");
		arMCli.add("Procurar Cliente");
		arMCli.add("Editar Cliente");
		arMCli.add("Listar todos os clientes");
		arMCli.add("Voltar ao menu anterior");
		
		/** Menu Gerir Consultas **/
		arMCon.add("Menu");
		arMCon.add("Procurar Consulta");
		arMCon.add("Cancelar Consulta");
		arMCon.add("Listar todas as consultas");
		arMCon.add("Procurar Consulta de um Cliente");
		arMCon.add("Voltar ao menu anterior");
	}
	
	//Chama o Menu principal
	public int callMenu(){
		
		for(int i=0; i<arM.size(); i++){
			if (i == 0) { System.out.printf("%s: \n", arM.get(i)); }
			else { System.out.printf("\t%d - %s\n", i, arM.get(i)); }
		}
		int x;
		System.out.printf("-> ");
		x = sc.nextInt();
		
		return x;
	}

	//Chama o Menu principal
	public int menuCliente(){
		
		for(int i=0; i<arMCli.size(); i++){
			if (i == 0) { System.out.printf("%s: \n", arMCli.get(i)); }
			else { System.out.printf("\t%d - %s\n", i, arMCli.get(i)); }
		}
		int x;
		System.out.printf("-> ");
		x = sc.nextInt();
		
		return x;
	}

	public static void main(String[] args) {
		new App();
	}

}
