package CS102.Lab.Week6.Lab5;

public class Meat extends Food {
	private String quality;

	public Meat(double taxRate, double kgs, String quality){
		super(taxRate, kgs);
		this.quality = quality;
	}

	public String toString(){
		return super.toString() + "Quality: " + quality + "\n";
	}
}
