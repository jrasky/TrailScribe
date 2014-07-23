package edu.cmu.sv.trailscribe.model;
import java.util.ArrayList;

public class SyncItems {
//  TODO: Implement toString() to print the class in Json format

	private ArrayList<Map> maps;
	private ArrayList<Kml> kmls;
	
	public SyncItems(ArrayList<Map> mapsToSync, ArrayList<Kml> kMLsToSync){
		this.setMaps(mapsToSync);
		this.setKMLs(kMLsToSync);
	}
	
	public void setKMLs(ArrayList<Kml> kMLsToSync) {
		this.kmls = kMLsToSync;
	}

	public void setMaps(ArrayList<Map> mapsToSync) {
		this.maps = mapsToSync;
		
	}
	
	public ArrayList<Kml> getKmls(){
		return this.kmls;
	}
	
	public ArrayList<Map> getMaps(){
		return this.maps;
	}
}
