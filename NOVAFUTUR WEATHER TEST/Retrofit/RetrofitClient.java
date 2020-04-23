package //add package on AS

import retrofit2.Retrofit;

public class RetrofitClient{
	private static Retrofit instance;
	
	public static Retrofit getInstance(){
		if(instance == null)
			instance = new Retrofit.Builder()
					 .baseUrl("https://api.openweathermap.org/data/2.5/")
					 .addConverterFactory(GsonConverterFactory.create())
					 .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
					 .build();
		return instance;
	}
	
	
	
	
}