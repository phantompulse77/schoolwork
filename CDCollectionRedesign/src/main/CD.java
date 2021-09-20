package main;
import java.text.NumberFormat;

public class CD {
	
	private String title, artist;
	private double cost;
	private int tracks;
	NumberFormat numfmt = NumberFormat.getCurrencyInstance();
	
	CD(String t, String a, double c, int tr){
		
		title = t;
		artist = a;
		cost = c;
		tracks = tr;
	}
	
	public String getData() {
		
		String data = "";
		data += numfmt.format(cost) + "  " + tracks + "    " + title + "    " + artist + "    ";
		return data;
	}

}
