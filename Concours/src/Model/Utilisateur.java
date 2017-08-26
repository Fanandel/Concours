package Model;
import java.util.ArrayList;
import java.util.Date;


public class Utilisateur {
	private int idutulisateur;
	private String login;
	private String mdp;
	private int num_cal;
	private Date date_deb;
	private Date date_fin;
	private String libelle;
	private Activite activite;
	private ArrayList<Phase> lphase;
	private ArrayList<Avis> lavis;
	
	public Utilisateur(int idutulisateur, String login, String mdp,
			int num_cal, Date date_deb, Date date_fin, String libelle,
			Activite activite, ArrayList<Phase> lphase, ArrayList<Avis> lavis) {
		super();
		this.idutulisateur = idutulisateur;
		this.login = login;
		this.mdp = mdp;
		this.num_cal = num_cal;
		this.date_deb = date_deb;
		this.date_fin = date_fin;
		this.libelle = libelle;
		this.activite = activite;
		this.lphase = lphase;
		this.lavis = lavis;
	}
	public int getIdutulisateur() {
		return idutulisateur;
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
	public void setIdutulisateur(int idutulisateur) {
		this.idutulisateur = idutulisateur;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public int getNum_cal() {
		return num_cal;
	}
	public void setNum_cal(int num_cal) {
		this.num_cal = num_cal;
	}
	public Date getDate_deb() {
		return date_deb;
	}
	public void setDate_deb(Date date_deb) {
		this.date_deb = date_deb;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Activite getActivite() {
		return activite;
	}
	public void setActivite(Activite activite) {
		this.activite = activite;
	}
	protected void affiche(){
		System.out.println("login" +getLogin());
		System.out.println("mdp" +getMdp());
		System.out.println("date_deb" +getDate_deb());
		System.out.println("date_fin" +getDate_fin());
		System.out.println("libelle" +getLibelle());
	}
	

}
