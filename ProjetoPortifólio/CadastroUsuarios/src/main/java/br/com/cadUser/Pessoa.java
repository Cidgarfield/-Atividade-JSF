package br.com.cadUser;
import java.util.ArrayList;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

@Named("meuBean")
@RequestScoped

public class Pessoa {
	private String nome;
	private ArrayList<String> nomes;
	
	public Pessoa() {
		this.nomes = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<String> getNomes(){
		return nomes;
	}
	
	public void setNomes(ArrayList<String> nomes) {
		this.nomes = nomes;
	}
	
	public void adicionarNome(String nome) {
		this.nomes.add(nome);
	}	


	public String salvar() {
		//Lógica para salvar o nome 
		System.out.println("Nome salvo: " + nome);
		return null; // Retorna para a mesma página
	}
	
}




