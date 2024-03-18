package encapsulation;

public class DataEncapsulation {
	
	/*
	 * Encapsulation:
	 * Data hiding
	 * Visibility of member variables in relation to other classes
	 */
	
	private String model;
	private long imei;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getImei() {
		return imei;
	}

	public void setImei(long imei) {
		this.imei = imei;
	}
	
	
	public void displayPhone() {
		
		System.out.println("The IMEI "+imei + " belongs to a "+model +" phone");
	}
	
}
