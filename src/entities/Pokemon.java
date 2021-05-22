package entities;

public class Pokemon {
	
	private String nome;
	private int ataque;
	private int defesa;
	
	public Pokemon() {
		
	}
	
	public Pokemon(String nome, int ataque, int defesa) {
		this.nome = nome;
		this.ataque = ataque;
		this.defesa = defesa;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAtaque() {
		return ataque;
	}

}
