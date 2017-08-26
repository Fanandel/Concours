package Model;
 import java.util.ArrayList;


public class Archiver {
	private int code_arch;
	private ArrayList<Utilisateur> lutilisateur;
	private Phase phase;
	private Resultat resultat;
	private Copie copie;
	
	public Archiver(int code_arch, ArrayList<Utilisateur> lutilisateur,
			Phase phase, Resultat resultat, Copie copie) {
		super();
		this.code_arch = code_arch;
		this.lutilisateur = lutilisateur;
		this.phase = phase;
		this.resultat = resultat;
		this.copie = copie;
	}

	public int getCode_arch() {
		return code_arch;
	}

	public void setCode_arch(int code_arch) {
		this.code_arch = code_arch;
	}

	public ArrayList<Utilisateur> getLutilisateur() {
		return lutilisateur;
	}

	public void setLutilisateur(ArrayList<Utilisateur> lutilisateur) {
		this.lutilisateur = lutilisateur;
	}

	public Phase getPhase() {
		return phase;
	}

	public void setPhase(Phase phase) {
		this.phase = phase;
	}

	public Resultat getResultat() {
		return resultat;
	}

	public void setResultat(Resultat resultat) {
		this.resultat = resultat;
	}

	public Copie getCopie() {
		return copie;
	}

	public void setCopie(Copie copie) {
		this.copie = copie;
	}
	

}
