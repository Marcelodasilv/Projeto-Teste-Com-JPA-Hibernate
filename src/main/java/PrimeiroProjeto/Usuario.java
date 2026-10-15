package PrimeiroProjeto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private int idade;
	private double dinheiro;

	public Usuario() {
	}

	public Usuario(String nome, int idade, double dinheiro) {
		this.nome = nome;
		this.idade = idade;
		this.dinheiro = dinheiro;
	}

	public void exibir() {
		System.out.println("ID: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Dinheiro: " + dinheiro);

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

}