package Model;
import java.util.ArrayList;


public class Copie {
	private int num_copie;
	private String intitul_copie;
	private Equipe equipe;
	private ArrayList<Archiver> larchiver;
	

	public Copie(int num_copie, String intitul_copie, Equipe equipe,
			ArrayList<Archiver> larchiver) {
		super();
		this.num_copie = num_copie;
		this.intitul_copie = intitul_copie;
		this.equipe = equipe;
		this.larchiver = larchiver;
	}

	
	public ArrayList<Archiver> getLarchiver() {
		return larchiver;
	}


	public void setLarchiver(ArrayList<Archiver> larchiver) {
		this.larchiver = larchiver;
	}


	public int getNum_copie() {
		return num_copie;
	}

	public void setNum_copie(int num_copie) {
		this.num_copie = num_copie;
	}

	public String getIntitul_copie() {
		return intitul_copie;
	}

	public void setIntitul_copie(String intitul_copie) {
		this.intitul_copie = intitul_copie;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	protected void affiche(){
		System.out.println("intitul_copie" +getIntitul_copie());
	}
}
