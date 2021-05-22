package application;

import entities.Pokemon;

public class Buscar {

	public static void main(String[] args) {
		
		Pokemon[] pokemon = {
				new Pokemon("MewTwo", 30, 170),
				new Pokemon("Blastoide", 120, 100),
				new Pokemon("Pikachu", 50, 130),
				new Pokemon("Gyarados", 130, 150),
				new Pokemon("Venusaur", 90, 180)
		};
		
		int maisForte = buscar(pokemon, 0, 4);
		
		System.out.println("O pokemon mais forte é " + pokemon[maisForte].getNome() + " com ataque de " + pokemon[maisForte].getAtaque());

	}
	
	public static int buscar(Pokemon[] pokemon, int inicio, int termino) {
		
		int maisForte = inicio;
		
		for(int atual = 0 ; atual < termino ; atual++) {
			
			if(pokemon[atual].getAtaque() > pokemon[maisForte].getAtaque()) {
				maisForte = atual;
			}
			
		}
		
		return maisForte;
	}

}
