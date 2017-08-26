
public class Salle {
	private int num_sal;
	private String nom_sal;
	private Centre centre;
	
	public Salle(int num_sal, String nom_sal, Centre centre) {
		super();
		this.num_sal = num_sal;
		this.nom_sal = nom_sal;
		this.centre = centre;
	}
	public int getNum_sal() {
		return num_sal;
	}
	public void setNum_sal(int num_sal) {
		this.num_sal = num_sal;
	}
	public String getNom_sal() {
		return nom_sal;
	}
	public void setNom_sal(String nom_sal) {
		this.nom_sal = nom_sal;
	}
	public Centre getCentre() {
		return centre;
	}
	public void setCentre(Centre centre) {
		this.centre = centre;
	}
	protected void affiche(){
		
	System.out.println("nom_sal" +getNom_sal());
	
	}

	
}
