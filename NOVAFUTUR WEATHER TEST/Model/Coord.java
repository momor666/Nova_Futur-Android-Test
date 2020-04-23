package // add

public class Coord{
	private double lon;//was long changed to double
    private double lat;//was long changed to double
	
	public Coord(){
		
	}
	
    @JsonProperty("lon")
    public double getLon() { return lon; }
    @JsonProperty("lon")
    public void setLon(long value) { this.lon = value; }

    @JsonProperty("lat")
    public double getLat() { return lat; }
    @JsonProperty("lat")
    public void setLat(long value) { this.lat = value; }
	
	
	
	@Override
	public String toString(){
		return new StringBuilder("[").append(this.lat).append(',').append(this.lon).append("]").toString();
	}

}