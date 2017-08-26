package Model;
import java.util.ArrayList;


public class Resultat {
	private int num_resul;
	private Candidat candidat;
	private Equipe equipe;
	private ArrayList<Archiver> larchiver;
	

	public Resultat(int num_resul, Candidat candidat, Equipe equipe,
			ArrayList<Archiver> larchiver) {
		super();
		this.num_resul = num_resul;
		this.candidat = candidat;
		this.equipe = equipe;
		this.larchiver = larchiver;
	}

	public Resultat(int num_resul, Candidat candidat) {
		super();
		this.num_resul = num_resul;
		this.candidat = candidat;
	}

	public ArrayList<Archiver> getLarchiver() {
		return larchiver;
	}

	public void setLarchiver(ArrayList<Archiver> larchiver) {
		this.larchiver = larchiver;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public Resultat(int num_resul) {
		super();
		this.num_resul = num_resul;
	}

	public int getNum_resul() {
		return num_resul;
	}

	public void setNum_resul(int num_resul) {
		this.num_resul = num_resul;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}
	

}
