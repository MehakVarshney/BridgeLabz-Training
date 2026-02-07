
public class Vessel {
	String vesselId;
	String vesselName;
	double averageSpeed;
	String vesselType;
	public Vessel(String vesselId,String vesselName,double averageSpeed,String vesselType) {
		// TODO Auto-generated constructor stub
		this.vesselId=vesselId;
		this.vesselName=vesselName;
		this.averageSpeed=averageSpeed;
		this.vesselType=vesselType;
	}
	public double getAverageSpeed() {
		return averageSpeed;
	}
	public Object getVesselId() {
		// TODO Auto-generated method stub
		return vesselId;
	}
	  @Override
	    public String toString() {
	        return vesselId + " " + vesselName + " " + vesselType + " " + averageSpeed;
	    }
	}
