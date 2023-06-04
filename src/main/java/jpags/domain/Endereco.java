package jpags.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	
	private String rua, complemento, cidade, estado, bairro;

	public Endereco() {}
	
	public Endereco(String rua, String complemento, String cidade, String estado, String bairro) {
		super();
		this.rua = rua;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
