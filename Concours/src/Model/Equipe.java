package Model;
import java.util.ArrayList;


public class Equipe {
	private int num_eqp;
	private String design_eqp;
	private Mission mission;
	private Copie copie;
	private ArrayList<Phase> lphase;
	private ArrayList<Avis> lavis;
	private ArrayList<Resultat> lresultat;
	private ArrayList<Note> lnote;

	
	public Equipe(int num_eqp, String design_eqp, Mission mission, Copie copie,
			ArrayList<Phase> lphase, ArrayList<Avis> lavis,
			ArrayList<Resultat> lresultat, ArrayList<Note> lnote) {
		super();
		this.num_eqp = num_eqp;
		this.design_eqp = design_eqp;
		this.mission = mission;
		this.copie = copie;
		this.lphase = lphase;
		this.lavis = lavis;
		this.lresultat = lresultat;
		this.lnote = lnote;
	}


	public int getNum_eqp() {
		return num_eqp;
	}


	public void setNum_eqp(int num_eqp) {
		this.num_eqp = num_eqp;
	}


	public String getDesign_eqp() {
		return design_eqp;
	}


	public void setDesign_eqp(String design_eqp) {
		this.design_eqp = design_eqp;
	}


	public Mission getMission() {
		return mission;
	}


	public void setMission(Mission mission) {
		this.mission = mission;
	}


	public Copie getCopie() {
		return copie;
	}


	public void setCopie(Copie copie) {
		this.copie = copie;
	}


	public ArrayList<Phase> getLphase() {
		return lphase;
	}


	public void setLphase(ArrayList<Phase> lphase) {
		this.lphase = lphase;
	}


	public ArrayList<Avis> getLavis() {
		return lavis;
	}


	public void setLavis(ArrayList<Avis> lavis) {
		this.lavis = lavis;
	}


	public ArrayList<Resultat> getLresultat() {
		return lresultat;
	}


	public void setLresultat(ArrayList<Resultat> lresultat) {
		this.lresultat = lresultat;
	}


	public ArrayList<Note> getLnote() {
		return lnote;
	}


	public void setLnote(ArrayList<Note> lnote) {
		this.lnote = lnote;
	}
	protected void affiche(){
		System.out.println("design_eqp" +getDesign_eqp());
	}
	
}
