package//add

import


public class MainActivity extends AppCompatActivity{
	
	private Toolbar toolbar;
	private TabLayout tabLayout;
	private ViewPager viewPager;
	
	private CoordinatorLayout coordinatorLayout;
	
	private FusedLocationProviderClient fusedLocationProviderClient;
	private LocationCallback locationCallback;
	private LocationRequest locationRequest;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main)
		
		coordinatorLayout = (CoordinatorLayout) findViewById(R.id.root_view);
		
		toolbar  = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		
		getSupportActionBar().setDisplayAsHomeAsUpEnabled(true);
		
		//permission request
		Dexter.withActivity(this)
				.withPermission(Manifest.permission.ACCESS_COARSE_LOCATION,
								Manifest.permission.ACCESS_COARSE_LOCATION,)
				.withListener(new MultiplePermissionListener){
					@Override
					public void onPermissionsChecked(MultiplePermissionReport report){
						if(reportAreAllPermissionGranted()){
							buildLocationRequest();
							buildlocationCallBack();
							
							fusedLocationProviderClient.requestLocationUpdates(locationRequest,locationCallback, Looper.myLooper());
						}
							
					}
					
					@Override
					public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permission, PermissionToken token){
						Snackbar.make(coordinatorLayout, "Permission Denied", Snackbar.LENGTH_LONG)
								.show();
						}}.check();				
	}
	
}