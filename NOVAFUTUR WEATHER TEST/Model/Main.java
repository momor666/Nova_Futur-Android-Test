package


public class Main{
	
	private double temp;
    private double feelsLike;
    private double tempMin;
    private double tempMax;
    private long pressure;
    private long humidity;
	
	
	
	public Main(){
		
	}
	
	
	@JsonProperty("temp")
    public double getTemp() { return temp; }
    @JsonProperty("temp")
    public void setTemp(double temp) { this.temp = temp; }

    @JsonProperty("feels_like")
    public double getFeelsLike() { return feelsLike; }
    @JsonProperty("feels_like")
    public void setFeelsLike(double FeelsLike) { this.feelsLike = FeelsLike; }

    @JsonProperty("temp_min")
    public double getTempMin() { return tempMin; }
    @JsonProperty("temp_min")
    public void setTempMin(double TempMin) { this.tempMin = TempMin; }

    @JsonProperty("temp_max")
    public double getTempMax() { return tempMax; }
    @JsonProperty("temp_max")
    public void setTempMax(double tempMax) { this.tempMax = tempMax; }

    @JsonProperty("pressure")
    public long getPressure() { return pressure; }
    @JsonProperty("pressure")
    public void setPressure(long pressure) { this.pressure = pressure; }

    @JsonProperty("humidity")
    public long getHumidity() { return humidity; }
    @JsonProperty("humidity")
    public void setHumidity(long humidity) { this.humidity = humidity; }
}