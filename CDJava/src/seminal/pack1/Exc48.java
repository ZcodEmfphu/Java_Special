package seminal.pack1;

public class Exc48 {

	public int wheelCount;
	private String vin;

	public Exc48(String vin) {
		this.vin = vin;
		wheelCount = 4;
	}

	public String extend() {
		return "zoom zoom";
	}

	public String getInfo() {
		return "VIN" + vin + " whells: " + wheelCount;
	}

}
