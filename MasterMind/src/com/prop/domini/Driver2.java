package com.prop.domini;

import java.util.*;

public class Driver2 {
	// Driver para las clases Jugador,Registre,Ranking,Fila Ranking
	
	public static void case4(Ranking r) {
		if (r != null)
			System.out.println("Ja existeix un Ranking");
		else {
			r = new Ranking();
			System.out.println("Ranking creat correctament");
		}
	}
	
	public static void case5(Ranking r) {
		if (r == null)
			System.out.println("Primer has de crear un Ranking");
		else {
			if (r.ranking_buit(1))
				System.out.println("Ranking fácil vacio, añade primero algun record");
			else
				r.mostra_ranking(1);
			if (r.ranking_buit(2))
				System.out.println("Ranking medio vacio, añade primero algun record");
			else
				r.mostra_ranking(2);
			if (r.ranking_buit(3))
				System.out.println("Ranking difícil vacio, añade primero algun record");
			else
				r.mostra_ranking(3);
		}
	}

	public static void case6(Scanner lector, Ranking r,FilaRanking f) {
		if (r == null)
			System.out.println("Primer has de crear un Ranking");
		else {
			if (f == null)
				System.out.println("Primer has de crear una fila Ranking");
			else {
				System.out.println("Escriu la dificultat entre 1(minima) y 3(maxima)");
				int dif = lector.nextInt();
				r.afegeix_fila(f, dif);
				System.out.println("FilaRanking actualitzada correctament");
			}
		}
	}

	public static void case7(Scanner lector, FilaRanking f) {
		System.out.println("Escriu la puntuació entre 1 y 25");
		int puntuacio = lector.nextInt();
		System.out.println("Escriu el nom del jugador");
		String nom = lector.next();
		f = new FilaRanking(puntuacio, nom);
		System.out.println("FilaRanking creada correctament");
	}

	
	public static void main(String args[]) {
		System.out.println("Benvingut a Mastermind! Selecciona una de les següents opcions:");
		System.out.println(" 0. Sortir del menú");
		System.out.println(" 1. Registrar un Jugador");
		System.out.println(" 2. Crear un Registre");
		System.out.println(" 3. Consultar informació d'un jugador");
		System.out.println(" 4. Crear un Ranking");
		System.out.println(" 5. Consultar el Ranking");
		System.out.println(" 6. Actualitzar el Ranking");
		System.out.println(" 7. Crea una FilaRanking");

		
		Scanner lector = new Scanner(System.in);
		Registre reg = null;
		char c;
		Ranking r = null;
		FilaRanking f = null;
		
		try {
			while ((c = (char) System.in.read()) != '0') {
				switch (c) {
				case '1':
					if (reg == null)
						System.out.println("No has creat cap Registre");
					else {
						System.out.print("Nom d'usuari del jugador: ");
						String id = lector.next();
						ArrayList<Jugador> jugadors = new ArrayList<Jugador>();
						jugadors = reg.registrar(id);
						System.out.println("Aquests son tots els jugadors registrats:");
						for (int i = 0; i < jugadors.size(); i++)
							System.out.println("  " + jugadors.get(i).getIdJugador());
					}
					break;
				case '2':
					if (reg != null)
						System.out.println("Ja has creat un Registre");
					else {
						reg = new Registre();
						System.out.println("Registre creat.");
					}
					break;
				case '3':
					System.out.print("Nom d'usuari del jugador: ");
					String idJugador = lector.next();
					Jugador jug = reg.getJugador(idJugador);
					System.out.println("Nom Jugador: " + jug.getIdJugador());
                    System.out.println("Partides jugades: " + jug.getPartidesJugades());
                    System.out.println("Partides guanyades: " + jug.getPartidesGuanyades());
					break;
				case '4':
					case4(r);
					break;
				case '5':
					case5(r);
					break;
				case '6':
					case6(lector,r,f);
					break;
				case '7':
					case7(lector,f);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
