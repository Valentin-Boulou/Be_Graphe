package org.insa.algo.shortestpath;
import org.insa.graph.Node;
import org.insa.algo.AbstractInputData.Mode;
import org.insa.graph.Arc ;
import java.util.* ;


public class Label implements Comparable<Label>{
	static Node idDest;
	static Mode mode;
	static int ms;
	private int sommet_Courant; 
	private boolean marque;
	protected double cout;
	private Arc arc_Pere;
	
	public Label(int sc, boolean m, double c) {
		this.sommet_Courant = sc;
		this.marque = m;
		this.cout = c;
		this.arc_Pere = null;
	}
	
	public Label(int sc, boolean m, double c, Arc Popa) {
		this.sommet_Courant = sc;
		this.marque = m;
		this.cout = c;
		this.arc_Pere = Popa;
	}
	
	public double getCost() {
		return this.cout;
	}
	
	public int compareTo(Label lab) {
		int result = 0 ;
		if((this.cout-lab.cout)<0.0) {
			result = -1 ;
		}else if((this.cout-lab.cout)>0.0){
			result = 1 ;
		}
		return result;
	}
	
	public int getSommet() {
		return this.sommet_Courant ;
	}
	
	public boolean estMarque() {
		return this.marque;
	}
	
	public void setMarque(boolean b) {
		this.marque = b;
	}
	
	public Arc getArc() {
		return this.arc_Pere;
	}
	
	public double getTotalCost() {
		return this.getCost();
	}
}
