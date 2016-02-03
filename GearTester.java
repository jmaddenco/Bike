package gear;

public class GearTester {
	public static void main(String[] args) {
		Gear Gear = new Gear(51, 11);
		System.out.println(Gear.ratio()); 

		System.out.println(new Gear(30, 27).ratio());
	}
}