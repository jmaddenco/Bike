

public class Gear {
	private int chainring, cog;

	public Gear(int chainring, int cog) {
		this.chainring = chainring;
		this.cog = cog;
	}

	public String toString() {
		return chainring + " " + cog + " " + ratio();
	}

	public int getChainring() {
		return chainring;
	}

	public void setChainring(int chainring) {
		this.chainring = chainring;
	}

	public int getCog() {
		return cog;
	}

	public void setCog(int cog) {
		this.cog = cog;
	}

	public double ratio(){ 
		return this.chainring / ((double) this.cog);
	}
}