package Model;



public class Localite {
	private int num_loc;
	private String design_loc;
	private Phase phase;
	public Localite(int num_loc, String design_loc, Phase phase) {
		super();
		this.num_loc = num_loc;
		this.design_loc = design_loc;
		this.phase = phase;
	}

	public int getNum_loc() {
		return num_loc;
	}
	public void setNum_loc(int num_loc) {
		this.num_loc = num_loc;
	}
	public String getDesign_loc() {
		return design_loc;
	}
	public void setDesign_loc(String design_loc) {
		this.design_loc = design_loc;
	}
	public Phase getPhase() {
		return phase;
	}
	public void setPhase(Phase phase) {
		this.phase = phase;
	}
	protected void affiche(){
		
	System.out.println("design_loc" +getDesign_loc());
	
	}
	


}
