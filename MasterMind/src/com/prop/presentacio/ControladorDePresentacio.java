package com.prop.presentacio;
import java.util.ArrayList;
import com.prop.domini.ControladorDeDomini;
import java.util.Dictionary;
import javax.swing.JLabel;

public class ControladorDePresentacio {
	
        public static ControladorDePresentacio controller = new ControladorDePresentacio();
        private String[] colorsEspigues = {"/images/espigaVacia.png", // Array on la posició és el número de color.
                                           "/images/espigaBlanca.png",
                                           "/images/espigaNegra.png" };
        private String[] colorsJugada = {"/images/red.png", // Array on la posició és el número de color.
                                         "/images/green.png",
                                         "/images/blue.png",
                                         "/images/orange.png",
                                         "/images/purple.png" };
        private Partida tauler;
	private ControladorDeDomini c;
	private String nomJugador;
        private int numJugada;
        
        // Constructor
	public ControladorDePresentacio() {
            c = new ControladorDeDomini(this);
            nomJugador = null;
	}
        
        public String getNomJugador() {
            return nomJugador;
        }
        
        public void setTauler(Partida t) {
            tauler = t;
        }
	
        //Obté la partida identificada per idPartida y mostra el tauler en l'estat guardat.
	public void getPartidaSeleccionada(String idPartida) {
            //Obtiene los datos de la partida, instancia vista partida y le pasa la información para rellenar la vista.
	}
	
        // Retorna true si alies existeix, i false en cas contrari.
	public boolean clickIniciarSessio(String alies) {
            nomJugador = alies;
            return c.iniciasessio(alies);
	}
	
        // Si s'ha creat retorna true. Si alies ja existeix, retorna false.
	public boolean clickRegistrarse(String alies) {
            nomJugador = alies;
            return c.registrar(alies);	
	}
	
        // Afegeix a la vista la resposta lògica al codi que s'ha proposat.
	public void mostraCodiRespost(ArrayList<Integer> codi) {
            ArrayList<String> codiR = transformaColors(colorsEspigues, codi);
            tauler.mostraCodiRespost(codiR, numJugada);
	}
                
        private ArrayList<String> transformaColors(String[] tipus, ArrayList<Integer> codi) {
            ArrayList<String> codiR = new ArrayList<String>();
            for (int i = 0; i < codi.size(); i++)
                codiR.add(tipus[codi.get(i)]);
            
            return codiR;
        }
        
        // Afegeix una nova jugada a la vista de la partida en mode codeMaker (automàtic).
	public void jugadaCompleta(ArrayList<Integer> codiRespost, ArrayList<Integer> codiProposat) {
            ArrayList<String> codiR = transformaColors(colorsEspigues, codiRespost);
            ArrayList<String> codiP = transformaColors(colorsJugada, codiProposat);
            
            tauler.pintaJugada(codiP, numJugada);
            tauler.mostraCodiRespost(codiR, numJugada);
            
            numJugada++;
	}
	
	public void jugaCodeMaker() {
            c.jugarPartida();
	}
        
        // Obté les dades per restaurar una partida, i la mostra al tauler.
	public void restauraPartida(String idPartida) { 
            ArrayList<ArrayList<ArrayList<Integer>>> tauler = c.continuarPartida(idPartida);
            for (int i = 0; i < tauler.size(); ++i) {
                ArrayList<ArrayList<Integer>> fila = tauler.get(i);
                ArrayList<Integer> codiP = fila.get(0);
                ArrayList<Integer> codiR = fila.get(1);
                
                ArrayList<String> proposta = transformaColors(colorsJugada, codiP);
                ArrayList<String> resposta = transformaColors(colorsEspigues, codiR);
                
                this.tauler.pintaJugada(proposta, i);
                this.tauler.mostraCodiRespost(resposta, i);
                this.tauler.setEditable(i);
            }
	}
        
        // Acaba la partida
        public void acabaPartida() {
            c.finalitzarPartida();
        }
	
        // Crea una partida amb Mode = mode y Dificultat = dificultat
	public void crearPartida(String mode, String dificultat) {
            numJugada = 0;
            int dif;
            
            if ("facil".equals(dificultat))         dif = 1;
            else if ("mitjana".equals(dificultat))  dif = 2;
            else dif = 3;
            
            boolean b = ("CodeMaker".equals(mode));
            
            c.generarJoc(dif, b);
	}

        // Obté el Ranking de la capa de domini i el formateja.
	public ArrayList<String> getRanking() {
            ArrayList<String> ranking = c.consultarRanking();
            return ranking;
	}
        
        // Obté les els IDs de les partides guardades de la capa de domini.
	public ArrayList<String> getIdPartidesGuardades() {
            return c.getIdPartidesGuardades(nomJugador);
	}
	
        // Desde la vista s'envia el codi proposat (en forma d'INTs) i avisa a la 
        // capa de domini per computar la jugada i obtenir la resposta a mostrar
	public void ferJugada(int[] codi) {
            c.ferJugada(codi);
            numJugada++;
	}
        
        // Per al mode CodeMaker, estableix el codi a endevnar.
        public void setCodi(int[] codi) {
            c.emmagatzemaCodi(codi);
        }
        
        // Guarda la partida.
        public void guardarPartida() {
            c.guardarPartida();
        }
        
        // Estableix un codi aleatori per la partida
        public void setRandomCodi() {
            c.setRandomCodi();
        }
        
        // Retorna true si el mode de la partida és CodeMaker
        public boolean esCodeMaker() {
            return c.esCodeMaker();
        }
        
        // Retorna el codi proposat en forma de URLs a les imatges
        public ArrayList<String> getSolucio() {
            return transformaColors(colorsJugada, c.getSolucio());
        }
        
        // Retorna true si la partida està guanyada
        public boolean haGuanyat() {
            return c.hasGuanyat();
        }
        
        // Retorna true si ha perdut la partida
        public boolean haPerdut() {
            return c.hasPerdut();
        }
}
