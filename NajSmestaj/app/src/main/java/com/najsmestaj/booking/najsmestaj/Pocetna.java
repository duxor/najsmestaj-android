package com.najsmestaj.booking.najsmestaj;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.content.Intent;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Pocetna extends Activity {
    RequestQueue red;
    StringRequest zahtev;
    TextView sadrzaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocetna);

//        final Button dugme = (Button) findViewById(R.id.button);
//        sadrzaj = (TextView) findViewById(R.id.sadrzaj);
//        red = Volley.newRequestQueue(this);
//
//        dugme.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                //goToUrl("http://test.najsmestaj.com/"
//
//                zahtev = new StringRequest(Request.Method.POST, "http://test.najsmestaj.com/android", new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String s) {
//                        sadrzaj.setText(s);
//                    }
//                }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError volleyError) {
//                        sadrzaj.setText(volleyError.getLocalizedMessage());
//                    }
//                }) {
//                    @Override
//                    protected Map<String, String> getParams() throws AuthFailureError {
//                        Map<String, String> params = new HashMap<String, String>();
//                        params.put("url", "/log/test/");
//                        params.put("mobile_token", "najsmestaj.com:android");
//                        return params;
//                    }
//                };
//                red.add(zahtev);
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pocetna, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_kontakt:
                startActivity(new Intent(this, Kontakt.class));
                break;
            case R.id.menu_login:
                startActivity(new Intent(this, Login.class));
                break;
            case R.id.menu_rezervacije:
                startActivity(new Intent(this, Rezervacije.class));
                break;
            case R.id.menu_smestaj:
                startActivity(new Intent(this, Smestaj.class));
                break;
        }

        return true;
    }

//    private void goToUrl (String url) {
//        Uri uriUrl = Uri.parse(url);
//        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
//        startActivity(launchBrowser);
//    }

}