package model;

public class Consulta {
	private int id;
	private String data_consulta,
				   descricao;
	
	public Consulta(String data_consulta, String descricao) {
		super();
		this.data_consulta = data_consulta;
		this.descricao = descricao;
	}

	public String getData_consulta() {
		return data_consulta;
	}

	public void setData_consulta(String data_consulta) {
		this.data_consulta = data_consulta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
