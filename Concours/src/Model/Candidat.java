package Model;
import java.util.ArrayList;
import java.util.Date;

public class Candidat {
    private int num_cand;
    private String nom_cand;
    private String pren_cand;
    private Date date_nais; 
    private String lieu_nais;
    private String adress_cand;
    private Avis avis;
	private ArrayList<Note> lnote;
    private ArrayList<Resultat> lresusltat;
    private Phase phase;
	
    public Candidat(int num_cand, String nom_cand, String pren_cand,
			Date date_nais, String lieu_nais, String adress_cand, Avis avis,
			ArrayList<Note> lnote, ArrayList<Resultat> lresusltat, Phase phase) {
		super();
		this.num_cand = num_cand;
		this.nom_cand = nom_cand;
		this.pren_cand = pren_cand;
		this.date_nais = date_nais;
		this.lieu_nais = lieu_nais;
		this.adress_cand = adress_cand;
		this.avis = avis;
		this.lnote = lnote;
		this.lresusltat = lresusltat;
		this.phase = phase;
	}

	public int getNum_cand() {
		return num_cand;
	}

	public void setNum_cand(int num_cand) {
		this.num_cand = num_cand;
	}

	public String getNom_cand() {
		return nom_cand;
	}

	public void setNom_cand(String nom_cand) {
		this.nom_cand = nom_cand;
	}

	public String getPren_cand() {
		return pren_cand;
	}

	public void setPren_cand(String pren_cand) {
		this.pren_cand = pren_cand;
	}

	public Date getDate_nais() {
		return date_nais;
	}

	public void setDate_nais(Date date_nais) {
		this.date_nais = date_nais;
	}

	public String getLieu_nais() {
		return lieu_nais;
	}

	public void setLieu_nais(String lieu_nais) {
		this.lieu_nais = lieu_nais;
	}

	public String getAdress_cand() {
		return adress_cand;
	}

	public void setAdress_cand(String adress_cand) {
		this.adress_cand = adress_cand;
	}

	public Avis getAvis() {
		return avis;
	}

	public void setAvis(Avis avis) {
		this.avis = avis;
	}

	public ArrayList<Note> getLnote() {
		return lnote;
	}

	public void setLnote(ArrayList<Note> lnote) {
		this.lnote = lnote;
	}

	public ArrayList<Resultat> getLresusltat() {
		return lresusltat;
	}

	public void setLresusltat(ArrayList<Resultat> lresusltat) {
		this.lresusltat = lresusltat;
	}

	public Phase getPhase() {
		return phase;
	}

	public void setPhase(Phase phase) {
		this.phase = phase;
	}
    
	protected void affiche(){
		
	System.out.println("nom_cand" +getNom_cand());
	System.out.println("pren_cand" +getPren_cand());
	System.out.println("date_nais" +getDate_nais());
	System.out.println("lieu_nais" +getLieu_nais());
	System.out.println("adress_cand" +getAdress_cand());
	
	} 

    
}
