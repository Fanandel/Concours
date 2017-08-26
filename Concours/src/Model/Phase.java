package Model;
import java.util.ArrayList;


public class Phase {
	private int num_phas;
	private String nom_phas;
	private String duree;
	private Activite activite;
	private Utilisateur utilisateur;
	private Centre centre;
	private Equipe equipe;
	private Localite localité;
	private ArrayList<Candidat> lcandidat;
	private ArrayList<Archiver> larchiver;

	
	public Phase(int num_phas, String nom_phas, String duree,
			Activite activite, Utilisateur utilisateur, Centre centre,
			Equipe equipe, Localite localité, ArrayList<Candidat> lcandidat,
			ArrayList<Archiver> larchiver) {
		super();
		this.num_phas = num_phas;
		this.nom_phas = nom_phas;
		this.duree = duree;
		this.activite = activite;
		this.utilisateur = utilisateur;
		this.centre = centre;
		this.equipe = equipe;
		this.localité = localité;
		this.lcandidat = lcandidat;
		this.larchiver = larchiver;
	}


	public int getNum_phas() {
		return num_phas;
	}


	public void setNum_phas(int num_phas) {
		this.num_phas = num_phas;
	}


	public String getNom_phas() {
		return nom_phas;
	}


	public void setNom_phas(String nom_phas) {
		this.nom_phas = nom_phas;
	}


	public String getDuree() {
		return duree;
	}


	public void setDuree(String duree) {
		this.duree = duree;
	}


	public Activite getActivite() {
		return activite;
	}


	public void setActivite(Activite activite) {
		this.activite = activite;
	}


	public Utilisateur getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


	public Centre getCentre() {
		return centre;
	}


	public void setCentre(Centre centre) {
		this.centre = centre;
	}


	public Equipe getEquipe() {
		return equipe;
	}


	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}


	public Localite getLocalité() {
		return localité;
	}


	public void setLocalité(Localite localité) {
		this.localité = localité;
	}


	public ArrayList<Candidat> getLcandidat() {
		return lcandidat;
	}


	public void setLcandidat(ArrayList<Candidat> lcandidat) {
		this.lcandidat = lcandidat;
	}


	public ArrayList<Archiver> getLarchiver() {
		return larchiver;
	}


	public void setLarchiver(ArrayList<Archiver> larchiver) {
		this.larchiver = larchiver;
	}
	protected void affiche(){
		System.out.println("nom_phas" +getNom_phas());
		System.out.println("duree" +getDuree());
	}



}
