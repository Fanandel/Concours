package Model;

public class Avis {
	private int num_avis;
	private String titre_avis;
	private String contenu;
	private Candidat candidat;
	private Equipe equipe;
	private Utilisateur utilisateur;
	
	public Avis(int num_avis, String titre_avis, String contenu,
			Candidat candidat, Equipe equipe, Utilisateur utilisateur) {
		super();
		this.num_avis = num_avis;
		this.titre_avis = titre_avis;
		this.contenu = contenu;
		this.candidat = candidat;
		this.equipe = equipe;
		this.utilisateur = utilisateur;
	}

	public int getNum_avis() {
		return num_avis;
	}

	public void setNum_avis(int num_avis) {
		this.num_avis = num_avis;
	}

	public String getTitre_avis() {
		return titre_avis;
	}

	public void setTitre_avis(String titre_avis) {
		this.titre_avis = titre_avis;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	protected void affiche(){
		
	System.out.println("titre_avis" +getTitre_avis());
	System.out.println("contenu" +getContenu());
	
	}
}
