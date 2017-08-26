package Model;
import java.util.ArrayList;


public class Mission {
	private int num_mis;
	private String design_mis;
	private ArrayList<Equipe> lequipe;
	
	public Mission(int num_mis, String design_mis, ArrayList<Equipe> lequipe) {
		super();
		this.num_mis = num_mis;
		this.design_mis = design_mis;
		this.lequipe = lequipe;
	}
	public int getNum_mis() {
		return num_mis;
	}
	public void setNum_mis(int num_mis) {
		this.num_mis = num_mis;
	}
	public String getDesign_mis() {
		return design_mis;
	}
	public void setDesign_mis(String design_mis) {
		this.design_mis = design_mis;
	}
	public ArrayList<Equipe> getLequipe() {
		return lequipe;
	}
	public void setLequipe(ArrayList<Equipe> lequipe) {
		this.lequipe = lequipe;
	}
	protected void affiche(){
		System.out.println("design_mis" +getDesign_mis());
	}

}
