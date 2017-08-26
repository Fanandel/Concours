package Model;
import java.util.ArrayList;

public class Centre {
	private int num_cen;
	private String nom_cen;
	private ArrayList<Phase> lphase;
	private ArrayList<Salle> lsalle;

	public Centre(int num_cen, String nom_cen, ArrayList<Phase> lphase,
			ArrayList<Salle> lsalle) {
		super();
		this.num_cen = num_cen;
		this.nom_cen = nom_cen;
		this.lphase = lphase;
		this.lsalle = lsalle;
	}

	public int getNum_cen() {
		return num_cen;
	}

	public void setNum_cen(int num_cen) {
		this.num_cen = num_cen;
	}
//test
	public String getNom_cen() {
		return nom_cen;
	}

	public void setNom_cen(String nom_cen) {
		this.nom_cen = nom_cen;
	}

	public ArrayList<Phase> getLphase() {
		return lphase;
	}

	public void setLphase(ArrayList<Phase> lphase) {
		this.lphase = lphase;
	}

	public ArrayList<Salle> getLsalle() {
		return lsalle;
	}

	public void setLsalle(ArrayList<Salle> lsalle) {
		this.lsalle = lsalle;
	}

	protected void affiche() {

		System.out.println("nom_cen" + getNom_cen());

	}

}
