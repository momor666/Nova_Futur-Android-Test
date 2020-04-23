package 'com.mohammed.weather' //add pack

import com.mohammed.weather.Model.WeatherResult;
import io.reactives.Observable;
import retrofit2.http.GET;

public interface IOpenWeatherMap{
	@GET("weather")
	Observable<WeatherResult> getWeatherByLatLng(@Query("lat") String lat,
												@Query("lon") String lgn
												@Query("appid") String appid
												@Query("units") String unit);
	


}