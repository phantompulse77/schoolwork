package main;
import java.util.LinkedList;
import java.text.NumberFormat;

public class CDCollection {
	
	private LinkedList<CD> collection = new LinkedList<CD>();
	private int count;
	private double totalCost;
	
	public CDCollection() {
		count = 0;
		totalCost = 0.0;
	}
	
	public void addCD (String title, String artist, double cost, int tracks) {
		
		collection.add(new CD (title, artist, cost, tracks));
		totalCost += cost;
		count++;
	}
	
	public String toString() {
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String report = "---------------------------------------- \n";
		report += "My CD Collection\n\n";
		
		report += "Number of CDs: " + count + "\n";
		report += "Total cost: " + fmt.format(totalCost) + "\n";
		report += "Average cost: " + fmt.format(totalCost/count);
		
		report += "\n\nCD List:\n\n";
		
		LinkedList<CD> copycollection = collection;
		
		for (int cd = 0; cd < count; cd++) {
			report += copycollection.pop().getData() + "\n";
			System.out.println(cd);
		}
		return report;
	} 
	

}
