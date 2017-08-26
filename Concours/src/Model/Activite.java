package Model;
import java.util.ArrayList;
import java.util.Date;


public class Activite {
	private int num_act;
	private Date date_act;
	private String charge;
	private ArrayList<Phase> lphase;
	

	public Activite(int num_act, Date date_act, String charge,
			ArrayList<Phase> lphase) {
		super();
		this.num_act = num_act;
		this.date_act = date_act;
		this.charge = charge;
		this.lphase = lphase;
	}
	public int getNum_act() {
		return num_act;
	}
	public void setNum_act(int num_act) {
		this.num_act = num_act;
	}
	public Date getDate_act() {
		return date_act;
	}
	public void setDate_act(Date date_act) {
		this.date_act = date_act;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public ArrayList<Phase> getLphase() {
		return lphase;
	}
	public void setLphase(ArrayList<Phase> lphase) {
		this.lphase = lphase;
	}
	protected void affiche(){
		
	System.out.println("date_act" +getDate_act());
	System.out.println("charge" +getCharge());
	
	}
}
