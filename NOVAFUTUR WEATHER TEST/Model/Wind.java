package


public class Wind{
	
	private double speed;
    private double deg;
	
	
	public Wind(){
		
		
	}
	
	@JsonProperty("speed")
    public double getSpeed() { return speed; }
    @JsonProperty("speed")
    public void setSpeed(double speed) { this.speed = speed; }

    @JsonProperty("deg")
    public double getDeg() { return deg; }
    @JsonProperty("deg")
    public void setDeg(double deg) { this.deg = deg; }


}