package crudapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "cliente") //nome da tabele
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column (nullable = false , length = 45)
	private String nome;
	
	@Column (nullable = false, length = 11)
	private String cpf;
	
	@Column (nullable = false, length = 50)
	private String email;
	
	@Column (nullable = false, length = 15)
	private String telefone;
		
	public Cliente () {}
	
	public Cliente(String nome, String cpf, String email, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}
	public Integer getCodigo() {
		return id;
	}
	public void setCodigo(Integer codigo) {
		this.id = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	

}
