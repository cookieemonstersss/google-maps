package com.nse.android.maps;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    TextView infor;
    Button mbutton;
    Button nbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        mbutton=(Button)findViewById(R.id.Button);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MapsActivity.this,Registration.class);
                startActivity(in);

            }
        });

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        String snippet1="Rating : 4/5"+"\n"+"School fees :"+"\n";
        String snippet2="Rating : 3/5"+"\n"+"School fees :"+"\n";
        String snippet3="Rating : 4/5"+"\n"+"School fees :"+"\n";
        String snippet4="Rating : 3/5"+"\n"+"School fees :"+"\n";
        String snippet5="Rating : 4.5/5"+"\n"+"School fees :"+"\n";
        String snippet6="Rating : 2/5"+"\n"+"School fees :"+"\n";
        String snippet7="Rating : 4/5"+"\n"+"School fees :"+"\n";
        String snippet8="Rating : 4/5"+"\n"+"School fees :"+"\n";
        String snippet9="Rating : 3/5"+"\n"+"School fees :"+"\n";
        String snippet10="Rating : 4/5"+"\n"+"School fees :"+"\n";
        String snippet11="Rating : 3/5"+"\n"+"School fees :"+"\n";
        String snippet12="Rating : 4/5"+"\n"+"School fees :"+"\n";
        String snippet13="Rating : 2/5"+"\n"+"School fees :"+"\n";
        String snippet14="Rating : 4/5"+"\n"+"School fees :"+"\n";
        String snippet15="Rating : 3/5"+"\n"+"School fees :"+"\n";

        mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {

            @Override
            public View getInfoWindow(Marker marker) {
                return null;
            }






            @Override

            public View getInfoContents(Marker marker) {
                View v = getLayoutInflater().inflate(R.layout.info_window, null);

                TextView tvLocality = (TextView) v.findViewById(R.id.tv_locality);
                TextView tvLat = (TextView) v.findViewById(R.id.tv_lat);
                TextView tvLng = (TextView) v.findViewById(R.id.tv_lng);
                TextView tvSnippet = (TextView) v.findViewById(R.id.tv_snippet);
                infor =(TextView) v.findViewById(R.id.info);


                LatLng l= marker.getPosition();
                tvLocality.setText(marker.getTitle());
                infor.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent info=new Intent(MapsActivity.this,Information.class);
                        startActivity(info);
                    }
                });

                tvLat.setText("          "+"         ");
                tvLng.setText("                ");
                tvSnippet.setText(marker.getSnippet());

                return v;

            }

        });
     //String in=infor.toString();


                // Add a marker in Sydney and move the camera
                LatLng Kimberley = new LatLng(-28.7282, 24.7499);
                LatLng THUSEGO_INTERMEDIATE_SCHOOL = new LatLng(-27, 23);
                LatLng floors_Primary = new LatLng(-28.7225, 24.7603);
                LatLng BARKLY_WEST_PRIMARY_SCHOOL = new LatLng(-28.535, 24.5007);
                LatLng BEACON_PRIMARY_SCHOOL = new LatLng(-28.7102, 24.7549);
                LatLng PESCODIA_PRIMARY_SCHOOL = new LatLng(-28.6684, 24.7243);
                LatLng NEWTON_PRIMARY_SCHOOL = new LatLng(-28.7473, 24.7498);
                LatLng OLYMPIC_PRIMARY_SCHOOL = new LatLng(-28.725, 24.7532);
                LatLng PROGRESS_PRIMARY_SCHOOL = new LatLng(-28.7194, 24.7618);
                LatLng STAATS_PRIMARY_SCHOOL = new LatLng(-28.7584, 24.7717);
                LatLng ST_CYPRIANS_GRAMMAR_SCHOOL = new LatLng(-28.7425, 24.7705);
                LatLng Kimberley_junoir_school = new LatLng(-28.7625, 24.7633);
                LatLng Healer_Primary_school = new LatLng(-28.7472, 24.7863);
                LatLng Endeaver_Primary_school = new LatLng(-28.7180, 24.7637);
                LatLng Diamantveld_primary_school = new LatLng(-28.7322, 24.7661);
                LatLng Sol_plaatjie_primary_schools = new LatLng(-28.7132, 24.7307);
                LatLng Tshiamo_primary_school = new LatLng(-28.7090, 24.7218);
                LatLng Masiza_primary_school = new LatLng(-28.7032, 24.7248);
                LatLng Boitshoko_primary_school = new LatLng(-28.7182, 24.7440);
                LatLng Flamingo_primary_school = new LatLng(-28.7109, 24.7481);
                LatLng isago_primary_school = new LatLng(-28.7166, 24.7210);
                LatLng eureka_primary_school = new LatLng(-28.7551, 24.7432);
                LatLng tshwarelela_primary_school = new LatLng(-28.7212, 24.7125);



       // mMap.addMarker(new MarkerOptions());//.position(Northern_Cape).title("Northern Cape"));
               Marker m= mMap.addMarker(new MarkerOptions().position(Kimberley).title("Northern Cape"));
              // m=(Marker)findViewById(R.id.map);
                mMap.addMarker(new MarkerOptions().position(THUSEGO_INTERMEDIATE_SCHOOL).title("THUSEGO_INTERMEDIATE_SCHOOL").snippet(snippet1));
                mMap.addMarker(new MarkerOptions().position(floors_Primary).title("floors Primary School").snippet(snippet2));
                mMap.addMarker(new MarkerOptions().position(BARKLY_WEST_PRIMARY_SCHOOL).title("BARKLY_WEST_PRIMARY_SCHOOL" ).snippet(snippet3));
                mMap.addMarker(new MarkerOptions().position(BEACON_PRIMARY_SCHOOL).title("BEACON_PRIMARY_SCHOOL"
                        ).snippet(snippet4));
                mMap.addMarker(new MarkerOptions().position(PESCODIA_PRIMARY_SCHOOL).title("PESCODIA PRIMARY SCHOOL" ).snippet(snippet5));
                mMap.addMarker(new MarkerOptions().position(NEWTON_PRIMARY_SCHOOL).title("NEWTON PRIMARY SCHOOL"  ).snippet(snippet6));
                mMap.addMarker(new MarkerOptions().position(OLYMPIC_PRIMARY_SCHOOL).title("OLYMPIC PRIMARY SCHOOL" ).snippet(snippet7));
                mMap.addMarker(new MarkerOptions().position(PROGRESS_PRIMARY_SCHOOL).title("PROGRESS_PRIMARY_SCHOOL"  ).snippet(snippet8));
                mMap.addMarker(new MarkerOptions().position(STAATS_PRIMARY_SCHOOL).title("STAATS PRIMARY SCHOOL"  ).snippet(snippet9));
                mMap.addMarker(new MarkerOptions().position(ST_CYPRIANS_GRAMMAR_SCHOOL).title("ST_CYPRIANS_GRAMMAR_SCHOOL" ).snippet(snippet10));
                mMap.addMarker(new MarkerOptions().position(Kimberley_junoir_school).title("Kimberley junoir school" ).snippet(snippet11));
                mMap.addMarker(new MarkerOptions().position(Healer_Primary_school).title("Healer Primary school").snippet(snippet12));
                mMap.addMarker(new MarkerOptions().position(Endeaver_Primary_school).title("Endeaver Primary school" ).snippet(snippet13));
                mMap.addMarker(new MarkerOptions().position(Diamantveld_primary_school).title("Diamantveld primary_school" ).snippet(snippet14));
                mMap.addMarker(new MarkerOptions().position(Sol_plaatjie_primary_schools).title("Sol plaatjie primary_school" ).snippet(snippet15));
                mMap.addMarker(new MarkerOptions().position(Tshiamo_primary_school).title("Tshiamo primary school" ).snippet(snippet1));
                mMap.addMarker(new MarkerOptions().position(Masiza_primary_school).title("Masiza primary school" ).snippet(snippet1));
                mMap.addMarker(new MarkerOptions().position(Boitshoko_primary_school).title("Boitshoko primary school") .snippet(snippet1));
                mMap.addMarker(new MarkerOptions().position(Flamingo_primary_school).title("Flamingo primary school" ).snippet(snippet1));
                mMap.addMarker(new MarkerOptions().position(isago_primary_school).title("Isago primary school" ).snippet(snippet1));
                mMap.addMarker(new MarkerOptions().position(eureka_primary_school).title("Eureka primary school" ).snippet(snippet1));
                mMap.addMarker(new MarkerOptions().position(tshwarelela_primary_school).title("tshwarelela primary school" ).snippet(snippet1));

                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Kimberley, 13),2500,null);
            }
        }