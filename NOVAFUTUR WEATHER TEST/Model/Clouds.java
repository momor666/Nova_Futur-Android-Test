package

public class Clouds{
	
	private int all;
		
	
	public Clouds(){
		
		
	}
	
	@JsonProperty("all")
    public long getAll() { return all; }
    @JsonProperty("all")
    public void setAll(long all) { this.all = all; }


}